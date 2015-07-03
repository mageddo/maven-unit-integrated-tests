package com.mageddo.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author deFreitas edigitalb@gmail.com
 */
public class WaterMachineTest {
	
	private WaterMachine machine;
	
	@Before
	public void startUp(){
		machine = new WaterMachine();
	}
	
	@Test
	public void doHotWaterTest() {
		Assert.assertEquals("3.4-hot water", machine.doHotWater(3.4));
	}

	@Test
	public void doColdWater() {
		Assert.assertEquals("3.4-cold water", machine.doColdWater(3.4));
	}

	@Test
	public void doNormalWater() {
		Assert.assertEquals("3.4-normal water", machine.doNormalWater(3.4));
	}
}
