package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class addstr {

	@Test
	public void test() {
		jUnitTest junitstr = new jUnitTest();
		String result = junitstr.addstring("Software ","Engineering");
		assertEquals ("Software Engineering", result);
	}

}
