package com.mageddo.tests;

public class CoffeeMachine {

	private final WaterMachine waterMachine;

	public CoffeeMachine(final WaterMachine waterMachine) {
		this.waterMachine = waterMachine;
	}

	public String doCoffee() {
		return this.waterMachine.doHotWater(3.38) + "-normal-coffee";
	}
}
