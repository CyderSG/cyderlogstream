export BROKER=broker.kafka.cyder.com.sg
export  SCHEMAREGISTRY=broker.kafka.cyder.com.sg
mvn exec:java -Dexec.mainClass="sg.com.cyder.kafka.log.api.CyderLogAPIProducer"
