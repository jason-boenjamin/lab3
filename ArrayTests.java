import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {1,2,3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3,2,1}, input1);
    // assertArrayEquals(new int[]{1,2,3},input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {3,2,1};
    assertArrayEquals(new int[]{1,2,3}, ArrayExamples.reversed(input1));
  }
}
