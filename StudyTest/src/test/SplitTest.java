/*
 * String 클래스에 대한 학습 테스트
 * 요구사항 1
 * "1,2"을 , 로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.
 * "1"을 , 로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.
 * 
 * 민종현
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import test.java.Split;

class SplitTest {
	
	Split split = new Split();

	@Test
	void testSplit() {
		
		// 1,2"을 , 로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트
		assertArrayEquals(new String[] {"1", "2"}, split.split("1,2", ","));
		
		// "1"을 , 로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트
		assertArrayEquals(new String[] {"1"}, split.split("1", ","));
		
	}

}
