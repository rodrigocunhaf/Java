package br.com.rodrigo.calculaterrestspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
	
	
	@GetMapping("/sum/{a}/{b}")
	public double sum(@PathVariable double a , @PathVariable double b){	
		return a+b;
	}
	@GetMapping("/div/{a}/{b}")
	public double div(@PathVariable double a , @PathVariable double b){	
		return a/b;
	}
	
	@GetMapping("/mult/{a}/{b}")
	public double mult(@PathVariable double a , @PathVariable double b){	
		return a*b;
	}
	@GetMapping("/sub/{a}/{b}")
	public double sub(@PathVariable double a , @PathVariable double b){	
		return a-b;
	}
}
