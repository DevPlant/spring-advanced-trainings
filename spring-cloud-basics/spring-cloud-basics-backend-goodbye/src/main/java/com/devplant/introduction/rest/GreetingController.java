package com.devplant.introduction.rest;

import com.devplant.introduction.model.GreetingModel;
import com.devplant.introduction.service.GoodbyeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController {

	@Autowired
	private GoodbyeService goodbyeService;


	@RequestMapping("/goodbye")
	public GreetingModel sayGoodbye() {
		return new GreetingModel(goodbyeService.sayGoodbye());
	}

}
