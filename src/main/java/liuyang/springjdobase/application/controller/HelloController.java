package liuyang.springjdobase.application.controller;

import liuyang.springjdobase.application.dto.GreetingDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {

	private final Logger log = LoggerFactory.getLogger(getClass());
	@RequestMapping("/greetings")
	public @ResponseBody GreetingDto index(){
		log.info("log test");
		return new GreetingDto("liu", "hi");
	}
}
