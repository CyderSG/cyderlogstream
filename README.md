# Table of Contents

1.  Create Avro Schema
2.  Generate Avro Java class
3.  Register schema in Confluent Schema Registry
4.  Send message to Kafka broker
5.  Consume message from Kafka broker

## 1. Create Avro Schema

1. Manually develop schemas/CyderLogAPI.avsc
2. Content of the file

```
{
   "namespace": "sg.com.cyder.kafka.log.avro",
   "type": "record",
   "name": "ApiLog",
   "fields": [
      {"name": "timestamp", "type": "long"},
      {"name": "host", "type": "string"},
      {"name": "category", "type": "string"},
      {"name": "level", "type": "string"},
      {"name": "message", "type": "string"},
      {"name": "detail", "type": "string"}
   ]
}
```

## 2.   Avro Java class

1. Generate using this script generateAvro-CyderLog.sh
2. Content of the script
```
java -jar ~/.m2/repository/org/apache/avro/avro-tools/1.9.1/avro-tools-1.9.1.jar compile schema schemas/CyderLogAPI.avsc src/main/java
```

## Reference

* https://rmoff.net/post/schema-registry-cheatsheet/