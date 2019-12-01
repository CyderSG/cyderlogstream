package sg.com.cyder.kafka.log.api;

import java.net.InetAddress;
import java.util.Date;
import java.util.Properties;
import java.util.UUID;

import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import sg.com.cyder.kafka.log.avro.ApiLog;

public class CyderLogAPIProducer {
	public static void main(String[] args) throws Exception {

		// Assign topicName to string variable
		String topicName = "cyder-log";

		// create instance for properties to access producer configs
		Properties props = new Properties();

		// Assign localhost id
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "broker.kafka.cyder.com.sg:9092");

		// Schema registry URL
		props.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://broker.kafka.cyder.com.sg:8081");

		// Set acknowledgements for producer requests.
		props.put(ProducerConfig.ACKS_CONFIG, "all");

		// If the request fails, the producer can automatically retry,
		props.put(ProducerConfig.RETRIES_CONFIG, 0);

		// Specify buffer size in config
		props.put(ProducerConfig.BATCH_SIZE_CONFIG, 16384);

		// Reduce the no of requests less than 0
		props.put(ProducerConfig.LINGER_MS_CONFIG, 1);

		// The buffer.memory controls the total amount of memory available to the
		// producer for buffering.
		props.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 33554432);

		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "io.confluent.kafka.serializers.KafkaAvroSerializer");

		Producer<String, GenericRecord> producer = new KafkaProducer<String, GenericRecord>(props);

		System.out.println("About to send messages");

		// message key.

		// message value, avro generic record.
		ApiLog record = new ApiLog();
		record.setCategory("Leaves");
		record.setDetail("Detail - " + new Date());
		record.setHost(InetAddress.getLocalHost().getHostAddress());
		record.setLevel("INFO");
		record.setMessage("Message - " + new Date());
		record.setTimestamp(new Date().getTime());

		// send avro message to the topic page-view-event.
		producer.send(new ProducerRecord<String, GenericRecord>(topicName, UUID.randomUUID().toString(), record));

		System.out.println("Message sent successfully");
		producer.close();
	}

}
