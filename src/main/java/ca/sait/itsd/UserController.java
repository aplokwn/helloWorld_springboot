package ca.sait.itsd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class UserController {
	
	//localhost:8085/user
	@GetMapping("/user")
	public User getUser() {
		return new User ("April", "Wan");
	}

}
