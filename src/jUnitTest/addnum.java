package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class addnum {

	@Test
	public void test() {
		jUnitTest junit = new jUnitTest();
		int result = junit.addNum(100, 200);
		assertEquals (300, result);
	}

}
