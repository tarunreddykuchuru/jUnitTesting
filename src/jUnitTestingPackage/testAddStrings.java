package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	public void test() {
		jUnitFunction jstr= new jUnitFunction();
        String result= jstr.addstring("tarun", "reddy");
        assertEquals("tarunreddy", result);
	}
}
