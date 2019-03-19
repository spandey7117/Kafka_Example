package com.kafka.producer;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.LongSerializer;
import org.apache.kafka.common.serialization.StringSerializer;

import com.kafka.constants.IKafkaConstants;

public class ProducerCreator {

	public static Producer<Long, String> createProducer() {
		Properties props = new Properties();
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, IKafkaConstants.KAFKA_BROKERS);
		props.put(ProducerConfig.CLIENT_ID_CONFIG, IKafkaConstants.CLIENT_ID);
		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, LongSerializer.class.getName());
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
	/*	 props.put("security.protocol", "SSL");
		props.put("ssl.truststore.location", "/Users/macbookproretina/client.truststore.jks");
        props.put("ssl.truststore.password", "secret");
        props.put("ssl.keystore.type", "PKCS12");
        props.put("ssl.keystore.location", "/Users/macbookproretina/client.keystore.p12");
        props.put("ssl.keystore.password", "secret");
        props.put("ssl.key.password", "secret");*/
		return new KafkaProducer<>(props);
	}
}