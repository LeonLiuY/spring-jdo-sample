package liuyang.springjdobase.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {

	private final Logger log = LoggerFactory.getLogger(getClass());
	@RequestMapping("/greetings")
	public @ResponseBody String index(){
		log.info("log test");
		return "Greetings!";
	}
}
