export BROKER=broker.kafka.mydomain
export  SCHEMAREGISTRY=broker.kafka.mydomain
java -jar ~/.m2/repository/org/apache/avro/avro-tools/1.9.1/avro-tools-1.9.1.jar compile schema schemas/CyderLogAPI.avsc src/main/java
