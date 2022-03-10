package com.bino.academy.controller;

import org.springframework.stereotype.Component;
@Component
public class Greeting {
	
private  long id;
private String content;
public void setId(long id) {
	this.id = id;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}



	
}
