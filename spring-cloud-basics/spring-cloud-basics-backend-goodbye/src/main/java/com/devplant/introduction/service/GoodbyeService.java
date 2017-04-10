package com.devplant.introduction.service;

import lombok.extern.slf4j.Slf4j;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Slf4j
public class GoodbyeService {

	private String message;

	public GoodbyeService(String message) {
		this.message = message;
	}

	public String sayGoodbye() {
		try {
			return message + InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			log.error("Hostname lookup failed", e);
		}
		return "Hello from the unknown";
	}

}
