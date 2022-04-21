package jUnittestpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions jUnitstring = new jUnitFunctions();
		String result = jUnitstring.addStrings("capstone","project");
		assertEquals("capstoneproject",result);	}

}
