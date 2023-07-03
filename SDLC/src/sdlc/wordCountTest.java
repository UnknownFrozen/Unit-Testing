package sdlc;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class wordCountTest {

	@Test
	public void test() throws IOException {
		
		Main test = new Main();
		int test1 = 0;
		int test2 = 0;
		for (int i = 0; i < test.wordCount().length; i++) {
			if(test.wordCount()[i][0].equals("my")) {
				test1 = i;
			}
			if(test.wordCount()[i][0].equals("raven")) {
				test2 = i;
			}
			
		}
		
		assertEquals(Integer.valueOf(test.wordCount()[test1][1]), 24);
		assertEquals(Integer.valueOf(test.wordCount()[test2][1]), 10);
	}

}
