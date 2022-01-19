package com.qa.doggo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class DoggoTest {

	private DoggoCompetition doggo = new DoggoCompetition();

	@Test
	public void testLength() {
		assertEquals(99, this.doggo.competition(4).size());
	}

	@Test
	public void testNotNull() {
		assertNotNull(this.doggo.competition(12));
	}

	@Test
	public void testNotContains() {
		assertFalse(this.doggo.competition(12).contains("12th"));
	}

	@Test
	public void testEleventh() {
		assertTrue(this.doggo.competition(25).contains("11th"));
	}

	@Test
	public void testTwelfth() {
		assertTrue(this.doggo.competition(25).contains("12th"));
	}

	@Test
	public void testThirteenth() {
		assertTrue(this.doggo.competition(25).contains("13th"));
	}

	@Test
	public void testFirst() {
		assertTrue(this.doggo.competition(25).contains("21st"));
	}

	@Test
	public void testSecond() {
		assertTrue(this.doggo.competition(25).contains("32nd"));
	}

	@Test
	public void testThird() {
		assertTrue(this.doggo.competition(25).contains("43rd"));
	}

	@Test
	public void testFourth() {
		assertTrue(this.doggo.competition(25).contains("54th"));
	}

	@Test
	public void testStart() {
		assertEquals("1st", this.doggo.competition(25).get(0));
	}

	@Test
	public void testLast() {
		List<String> places = this.doggo.competition(33);
		assertEquals("100th", places.get(places.size() - 1));
	}

}
