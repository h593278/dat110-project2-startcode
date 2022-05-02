package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 

	// TODO:
	// Implement object variables - a topic and a message is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	private String topic;
	private String message;
	
	public PublishMsg(String user, String topic, String message) {
		super(MessageType.PUBLISH, user);
		this.topic=topic;
		this.message=message;
	}
	public String getMessage() {
		return message;
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public void setMessage(String message) {
		this.message=message;
	}
	
	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "CreateTopicMsg [topic=" + topic + " message=" + message + 
				", toString()= " + super.toString() + "]";
	}
	
	
}
