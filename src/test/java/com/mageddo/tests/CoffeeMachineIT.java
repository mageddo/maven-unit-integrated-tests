package com.mageddo.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author deFreitas edigitalb@gmail.com
 */
public class CoffeeMachineIT {
	
	CoffeeMachine machine;
	
	@Before
	public void startUp(){
		machine = new CoffeeMachine(new WaterMachine());
	}
	
	@Test
	public void doCoffeeTest(){
		Assert.assertEquals("3.38-hot water-normal-coffee", machine.doCoffee());
	}
	
}
