/*
 * String 클래스에 대한 학습 테스트
 * 요구사항 3
 * "abc" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습테스트를 구현한다.
 * String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면
 * StringIndexOutOfBoundsException이 발생하는 부분에 대한 학습 테스트를 구현한다.
 * JUnit의 @DisplayName을 활용해 테스트 메소드의 의도를 드러낸다.
 * 
 * 민종현
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import test.java.CharAt;

class CharAtTest {

	@Test
	@DisplayName("CharAt Test")
	void testCharAt() {

		CharAt chAt = new CharAt();
		
		assertEquals('a', chAt.charAt("abc", 0));

		assertEquals('d', chAt.charAt("abc", 3));
		
		
	}

}
