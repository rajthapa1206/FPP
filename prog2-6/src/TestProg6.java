import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestProg6 {
	
	String[] arrrayOfStrings = {"horse", "dog", "cat", "horse","dog"};
	@Test
	void testRemoveDups() {
		String[] inputArray = {"horse", "dog", "cat", "horse", "dog"};
		String[] expectedResult = {"horse", "dog", "cat"};
		assertTrue(Arrays.equals(expectedResult, Prog6.removeDups(inputArray)));
	}
	
	@Test
	void testCheckPresent() {
		assertEquals(true, Prog6.checkPresent(arrrayOfStrings, "horse"));
		assertEquals(false, Prog6.checkPresent(arrrayOfStrings, "elephants"));
	}

}

