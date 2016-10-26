import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WordSmithTest {

	@Before
	public void setUp() throws Exception {
	}

	
	/* 
	 * Test Case 1, Input "1", Output "1"
	 */
	@Test
	public void test1() {
		assertEquals("1", WordSmith.getWordSmith(1));
	}

	/* 
	 * Test Case 2, Input "2", Output "2"
	 */
	@Test
	public void test2() {
		assertEquals("2", WordSmith.getWordSmith(2));
	}
	
	/* 
	 * Test Case 3, Input "3", Output "word"
	 */
	@Test
	public void test3() {
		assertEquals("word", WordSmith.getWordSmith(3));
	}
	
	/* 
	 * Test Case 4, Input "5", Output "smith"
	 */
	@Test
	public void test4() {
		assertEquals("smith", WordSmith.getWordSmith(5));
	}
	
	/* 
	 * Test Case 5, Input "15" Output "wordsmith"
	 */
	@Test
	public void test5() {
		assertEquals("wordsmith", WordSmith.getWordSmith(15));
	}
}
