package br.com.zup.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	@KafkaListener(topics = "CUSTOMER_DATA", groupId = "group_id")
    public void listen(String message) {
        System.out.println("Consumed message: " + message);
    }
	
}
