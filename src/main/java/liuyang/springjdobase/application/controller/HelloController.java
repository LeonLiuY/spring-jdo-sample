package liuyang.springjdobase.application.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import liuyang.springjdobase.domain.model.Greeting;
import liuyang.springjdobase.domain.model.GreetingRepository;
import liuyang.springjdobase.domain.model.ITest;
import liuyang.springjdobase.domain.model.TestImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@Transactional
public class HelloController {

	@Autowired
	private GreetingRepository greetingRepository;
	private final Logger log = LoggerFactory.getLogger(getClass());
	@RequestMapping("/")
	public @ResponseBody List<Greeting> index(){
		log.info("test");
		Set<ITest> tests= new HashSet<ITest>();
		tests.add(new TestImpl(2));
		tests.add(new TestImpl(20));
		greetingRepository.create(new Greeting("liu", "hi",tests));
		greetingRepository.create(new Greeting("yang", "hello",tests));
		return greetingRepository.findAll();
	}
}
