import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Prog2_8Test {

		@Test
		public void testCalculateSum() {
			int[] testArray = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
			int result = Prog2_8.min(testArray);
			int expected = -22;
			assertTrue(expected == result);
		}
}
