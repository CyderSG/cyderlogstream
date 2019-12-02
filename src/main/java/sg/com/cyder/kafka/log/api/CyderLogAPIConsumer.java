package sg.com.cyder.kafka.log.api;

import java.util.Collections;
import java.util.Properties;

import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import sg.com.cyder.kafka.log.avro.ApiLog;

public class CyderLogAPIConsumer {
	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();

		// Assign topicName to string variable
		String topicName = "cyder-log";

		// normal consumer
		properties.setProperty("bootstrap.servers", System.getenv("BROKER") + ":9092");
		properties.put("group.id", "customer-consumer-group-v1");
		properties.put("auto.commit.enable", "false");
		properties.put("auto.offset.reset", "earliest");

		// avro part (deserializer)
		properties.setProperty("key.deserializer", StringDeserializer.class.getName());
		properties.setProperty("value.deserializer", KafkaAvroDeserializer.class.getName());
		properties.setProperty("schema.registry.url", "http://" + System.getenv("SCHEMAREGISTRY") + ":8081");
		properties.setProperty("specific.avro.reader", "true");

		KafkaConsumer<String, ApiLog> kafkaConsumer = new KafkaConsumer<String, ApiLog>(properties);
		kafkaConsumer.subscribe(Collections.singleton(topicName));

		System.out.println("Waiting for data...");

		while (true) {
			System.out.println("Polling");
			ConsumerRecords<String, ApiLog> records = kafkaConsumer.poll(1000);

			for (ConsumerRecord<String, ApiLog> record : records) {
				GenericRecord customer = record.value();
				System.out.println(customer);
			}

			kafkaConsumer.commitSync();
		}
	}
}
