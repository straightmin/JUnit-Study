/*
 * Set Collection에 대한 학습 테스트
 * 요구사항 1
 * Set의 size() 메소드를 활용해 Set의 크기를 확인하는 학습테스트를 구현한다.
 * 
 * 민종현
 */

package test.java;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SetTest {
	
	private Set<Integer> numbers;
	
	@BeforeEach
	void setUp() {
		numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(1);	// 중복 불허
		numbers.add(2);
		numbers.add(3);
	}

	@Test
	@DisplayName("Set size() Test")
	void test() {
		
		assertEquals(3, numbers.size());
	}

}
