package com.target.flow.config;

import java.util.HashMap;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
public class KafkaConfig {

	@Bean
	public KafkaTemplate<String, String> getKafkaTemplate() {
		HashMap<String, Object> prodProps = new HashMap<>();
		prodProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		prodProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		prodProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);

		DefaultKafkaProducerFactory<String, String> factory = new DefaultKafkaProducerFactory<>(prodProps);
		KafkaTemplate<String, String> template = new KafkaTemplate<>(factory);
		return template;
	}

}
