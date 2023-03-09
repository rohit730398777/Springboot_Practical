package coffee.production.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cofeedemo.production.entity.Coffee;

@RestController
public class CoffeeControllerdemo 
{	
	List<Coffee> coffees=new ArrayList<Coffee>();
	
	//Adding values
	
	public CoffeeController()
	{
		coffees.addAll(List.of
				(new Coffee("Hot Coffee",200.80),
				new Coffee("Cold Coffee",200.80),
				new Coffee("Cappuccino",200.80),
				new Coffee("Espresso",200.80),
				new Coffee("Americano",200.80),
				new Coffee("Latte",200.80),
				new Coffee("Iced Coffee",200.80),
				new Coffee("Caffee Mocha",200.80)));
	}
	@RequestMapping("/coffees")
	List<Coffee> getAllLeds()
	{
			return coffees;	
	}
}
