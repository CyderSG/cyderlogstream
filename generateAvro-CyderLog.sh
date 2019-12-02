export BROKER=broker.kafka.cyder.com.sg
export  SCHEMAREGISTRY=broker.kafka.cyder.com.sg
java -jar ~/.m2/repository/org/apache/avro/avro-tools/1.9.1/avro-tools-1.9.1.jar compile schema schemas/CyderLogAPI.avsc src/main/java
