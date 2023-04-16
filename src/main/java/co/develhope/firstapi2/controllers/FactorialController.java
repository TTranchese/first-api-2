package co.develhope.firstapi2.controllers;

import co.develhope.firstapi2.services.FactorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {
	@Autowired
	private FactorialService factorialService;
	@GetMapping("/factorial/{n}")
	public int factorial(@PathVariable int n){
		return factorialService.returnFactorial(n);
	}
}