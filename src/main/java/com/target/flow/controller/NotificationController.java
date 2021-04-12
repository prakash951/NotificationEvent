package com.target.flow.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.target.flow.requests.NotificationRequest;
import com.target.flow.response.NotificationResponse;
import com.target.flow.service.NotificationService;

@RestController
public class NotificationController {

	@Autowired
	NotificationService myNotificationService;

	@PostMapping("/notifications")
	public ResponseEntity<Object> sendNotification(@Valid @RequestBody NotificationRequest request) {
		NotificationResponse myNotificationResponse = myNotificationService.sendMessage(request);
		if (myNotificationResponse.getCode() == 0) {
			return new ResponseEntity<>(myNotificationResponse, HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<>(myNotificationResponse, HttpStatus.NOT_ACCEPTABLE);
	}

}
