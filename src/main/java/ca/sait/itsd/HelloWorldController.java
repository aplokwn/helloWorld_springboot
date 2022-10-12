package ca.sait.itsd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {
	
	//using RequestMapping method
	//@RequestMapping(method=RequestMethod.GET, path="/") 
	//public String hellowWorld() {
		//return "Hello by requestMapping!";
	//}
	
	@GetMapping(path="/")
	public String hellowWorld() {
			return "Hello by GetMapping!";
		}
	

}
