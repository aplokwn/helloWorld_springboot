package ca.sait.itsd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloWorld01Application {

	public static void main(String[] args) {
		
		//ConfigurableApplicationContext ctx = SpringApplication.run(HelloWorld01Application.class, args);
		//User user = ctx.getBean(User.class);
		//System.out.println("user bean ====> " + user);
		
		
		SpringApplication.run(HelloWorld01Application.class, args);
		
		
		
	}

}
