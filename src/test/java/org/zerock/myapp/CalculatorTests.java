package org.zerock.myapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Objects;

import org.junit.Before;
import org.junit.Test;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor
public class CalculatorTests {
	private Calculator calc;		// 테스트 대상 필드
	
	
	@Before
	public void setup() {	// 사전처리 - 매번 테스트할 새로운 인스턴스 생성
		log.trace("setup() invoked.");
		
		this.calc = new Calculator();
	} // setup
	
	
	@Test(timeout = 1000L * 1)
	public void test더하기() throws Exception {
		log.trace("test더하기() invoked.");
		
		// 체크대상이 널인지 여부를 확인하는 3가지 코딩기법
		Objects.requireNonNull(this.calc);
		assert this.calc != null;
		assertNotNull(this.calc);
		
		
		int number1=100;
		int number2=200;
		
		int result = this.calc.더하기(number1, number2);
		log.info("\t+ result: {}", result);
		
		assertEquals(300, result);	// 검증수행
	} // test더하기
	
	
	@Test
	public void test빼기() {
		log.trace("test빼기() invoked.");
		
	} // test빼기
	
	
	@Test
	public void test곱하기() {
		log.trace("test곱하기() invoked.");
		
	} // test곱하기
	
	
	@Test
	public void test나누기() {
		log.trace("test나누기() invoked.");
		
	} // test나누기

} // end class
