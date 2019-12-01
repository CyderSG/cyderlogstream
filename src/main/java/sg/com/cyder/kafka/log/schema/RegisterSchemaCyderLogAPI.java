package sg.com.cyder.kafka.log.schema;

import java.io.FileInputStream;

import org.apache.avro.Schema;
import org.apache.commons.io.IOUtils;

import io.confluent.kafka.schemaregistry.client.CachedSchemaRegistryClient;

public class RegisterSchemaCyderLogAPI {

	public static void main(String[] args) {
		try {
			// schema registry url.
			String url = "http://broker.kafka.cyder.com.sg:8081";
			// associated topic name.
			String topic = "cyder-log";
			// avro schema avsc file path.
			String schemaPath = "./schemas/CyderLogAPI.avsc";
			// subject convention is "<topic-name>-value"
			String subject = topic + "-api";
			// avsc json string.
			String schema = null;

			FileInputStream inputStream = new FileInputStream(schemaPath);
			try {
				schema = IOUtils.toString(inputStream);
			} finally {
				inputStream.close();
			}

			Schema avroSchema = new Schema.Parser().parse(schema);

			CachedSchemaRegistryClient client = new CachedSchemaRegistryClient(url, 20);

			client.register(subject, avroSchema);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
