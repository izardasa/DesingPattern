package com.designpattern.decorator;

public class Whip extends CondimentDecorator{

	private Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		return beverage.getDescription()+", Whip";
	}

	@Override
	public double cost() {
		return beverage.cost()+.10;
	}

}
