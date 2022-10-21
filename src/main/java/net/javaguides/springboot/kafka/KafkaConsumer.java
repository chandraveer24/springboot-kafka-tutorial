package net.javaguides.springboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	private static Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);
	
	@KafkaListener(topics = "javaguides", groupId = "myGroup")/* groupId is specified in the application.properties */
	public void consume(String message) {
		LOG.info(message);
	}
}
