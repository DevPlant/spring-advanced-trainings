package com.devplant.introduction.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Slf4j
@Service
public class HelloService {

	public String sayHello(String who) {
		try {
			return "Hello, " + who + " from: " + InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			log.error("Hostname lookup failed", e);
		}
		return "Hello from the unknown";
	}

}
