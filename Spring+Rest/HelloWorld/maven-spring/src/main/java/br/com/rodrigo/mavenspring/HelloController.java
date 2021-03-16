package br.com.rodrigo.mavenspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	private static final String setence = "Hello %s";
	
	
	@RequestMapping("/hello")
	public HelloUser Hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new HelloUser(1, String.format(setence, name));
		
	}
	
	

}
