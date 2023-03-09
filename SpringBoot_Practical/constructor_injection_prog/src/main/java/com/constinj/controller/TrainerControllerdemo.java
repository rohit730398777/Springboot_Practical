package constructordemo.injection.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import constructordemo.injection.entiry2.Trainer;
import constructordemo.injection.entity1.Subject;

//Spring Configuration annotation indicates that the class has @Bean definition methods
@Configuration
//It is used to define subject and trainer class 
class AppConfiguration
{
	//Spring @Bean Annotation is applied on a method to specify that it returns a bean to be managed by Spring context
	@Bean
	public Subject subject()
	{
		return new Subject("Python");
	}
	
	@Bean
	public Trainer trainer(Subject subject) 
	{
		return new Trainer(subject);
	}
}

//RestController annotation is used to create RESTful web services using Spring MVC
@RestController
//It is use constructor injection to get trainer instance
class TrainerControllerdemo
{
	public Trainer trainer;
	
	public TrainerController(Trainer trainer)
	{
		this.trainer = trainer;
	}
	
	//http://localhost:8080/teach
	@GetMapping("/teach")
	public String teach()
	{
		return trainer.teach();
	}
}
