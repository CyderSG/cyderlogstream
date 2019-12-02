export BROKER=broker.kafka.mydomain
export  SCHEMAREGISTRY=broker.kafka.mydomain
mvn exec:java -Dexec.mainClass="sg.com.cyder.kafka.log.api.CyderLogAPIConsumer"
