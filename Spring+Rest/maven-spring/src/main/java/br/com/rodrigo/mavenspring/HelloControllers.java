package br.com.rodrigo.mavenspring;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllers {
	
	private static String template = "Hello %s";
	
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/hello")
	public HelloClass hello(@RequestParam (value = "name", defaultValue = "World")String  name) {
		return new HelloClass(counter.incrementAndGet(),String.format(template, name));
		
	}

}
