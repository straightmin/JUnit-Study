/*
 * String 클래스에 대한 학습 테스트
 * 
 * 민종현
 */

package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringTest {
	
	// 요구사항 1
	Split split = new Split();

	@Test
	void testSplit_01() {
		
		// "1,2"을 , 로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트
		assertArrayEquals(new String[] {"1", "2"}, split.split("1,2", ","));
		
	}

	@Test
	void testSplit_02() {
		
		// "1"을 , 로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트
		assertArrayEquals(new String[] {"1"}, split.split("1", ","));
		
	}
	
	// 요구사항 2
	Substring substring = new Substring();

	@Test
	void testSub() {
		
		assertEquals("1,2", substring.sub("(1,2)"));
	}

	// 요구사항 3
	CharAt chAt = new CharAt();

	@Test
	@DisplayName("CharAt Test")
	void testCharAt_01() {
		
		assertEquals('a', chAt.charAt("abc", 0));
		
	}

	@Test
	@DisplayName("CharAt Test")
	void testCharAt_StringIndexOutOfBoundsException() {

		assertEquals('d', chAt.charAt("abc", 3));
		
	}

}
