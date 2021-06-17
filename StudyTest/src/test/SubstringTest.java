/*
 * String 클래스에 대한 학습 테스트
 * 요구사항 2
 * "(1,2)" 값이 주어졌을 때 String의 substring() 메소드를 활용해 () 을 제거하고 "1,2"를 반환하도록 구현한다
 * 
 * 민종현
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import test.java.Substring;

class SubstringTest {

	@Test
	void testSub() {
		Substring substring = new Substring();
		
		assertEquals("1,2", substring.sub("(1,2)"));
	}

}
