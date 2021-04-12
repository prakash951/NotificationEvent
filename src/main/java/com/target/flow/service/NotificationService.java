package com.target.flow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.target.flow.entity.Notification;
import com.target.flow.requests.NotificationRequest;
import com.target.flow.response.NotificationResponse;

@Service
public class NotificationService {

	@Value("${topic}")
	private String topic;

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	public NotificationResponse sendMessage(NotificationRequest request) {
		String id = System.currentTimeMillis() + "";
		Notification noti = new Notification(id, request.getFrom(), request.getBody(), request.getSubject(),
				request.getTo());
		ObjectMapper mapper = new ObjectMapper();
		try {
			String message = mapper.writeValueAsString(noti);
			kafkaTemplate.send(topic, message);
			return new NotificationResponse("Notification With Id: " + id + " Sent Successfully", "", 0);

		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new NotificationResponse("Notification Failed", "", -1);
		}
	}

}
