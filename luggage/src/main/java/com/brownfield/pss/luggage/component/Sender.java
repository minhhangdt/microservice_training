package com.brownfield.pss.luggage.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@EnableBinding(LuggageSource.class)
@Component
public class Sender {

	public Sender() {

	}

	@Output(LuggageSource.CHECKINQ)
	@Autowired
	private MessageChannel messageChannel;

	public void send(Object message) {
		System.out.println("Output CheckInQ");
		messageChannel.send(MessageBuilder.withPayload(message).build());
	}
}

interface LuggageSource {
	public static String CHECKINQ = "checkInQ";

	@Output(LuggageSource.CHECKINQ)
	public MessageChannel checkInQ();
}