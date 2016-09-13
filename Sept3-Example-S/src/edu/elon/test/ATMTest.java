package edu.elon.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class ATMTest {
	
	private ATM atm;
	
	@Before
	public void setUp() throws Exception {
		atm = new ATM(100.00);
	}
	
	@After
	public void tearDown() throws Exception {
		atm = null;
	}

	@Test
	public void testDeposit() {
		atm.deposit(20);;

		double actual = atm.getBalance();

		double expected = 120;

		assertEquals(expected, actual,0);
	}

	@Test
	public void testGetBalance() {
		double actual = atm.getBalance();

		double expected = 100;

		assertEquals(expected, actual, 0);
	}

	private void extracted(double actual, double expected) {
		assertEquals(expected, actual,0);
	}

	@Test
	public void testToString() {
		String expected = "Amount balance is $100.00";

		String actual = atm.toString();
		
		assertEquals(expected,actual);
	}


	@Test
	public void testWithdraw() {

		double actual = atm.withdraw(3);

		double expected = 97;

		assertEquals(expected, actual,0);
	}

}
