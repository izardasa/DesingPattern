package com.designpattern.factorypizza;

public class ChicagoStyleCheesePizza extends Pizza{

	public ChicagoStyleCheesePizza() {
		name= "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozerella Cheese");
	}
	
	void cut()
	{
		System.out.println("Cutting the pizza into square slices");
	}
}
