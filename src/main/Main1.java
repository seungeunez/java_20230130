package main;

/* 변수 - 조건문 - 반복문 - 배열 - 클래스(중요)
 * 클래스명 첫글자 대문자 ex) Student Car StudentClass
 * 변수명 소문자 ex) car student studentAge
 * 메소드(함수) ex) printMyAge()
 */

public class Main1 {

	public static void main(String[] args) {
		// 타입 변수명 = 초기값
		// byte, short, int(32), long(64) => 정수 ex) 3, -3 
		// char => 문자 ex) 'a' '1' '0' 'N'
		// float, double => 실수 ex) 1.0 1.25
		// boolean 참, 거짓 => true, false
		
//		int y = 15;
//		float s = 3;
//		System.out.println(a + b);
//		System.out.println(a - b);
//		System.out.println(a * b);	
//		// 나누기 (정수/정수 => 정수)
//		// (정수/실수 => 실수)
//		System.out.println(a / b);	//나누기
//		System.out.println(a % b);	//나머지
		
		//문제
		int a = 124;
		int a1 = a % 10;	//4
		int a2 = a / 10 % 10;	//2
		int a3 = a / 100;	//1
		
		System.out.println(a1 + a2 + a3);
		
		//문제2 1000~9999 숫자를 뒤집어서 출력하시오.
		int b=1234;
		int b1 = b % 10;	//4
		int b2 = b / 10 % 10;	//3
		int b3 = b / 100 %10;	//2
		int b4 = b / 1000;	//1
		
		
		int b5 = b1*1000+b2*100+b3*10+b4;
		
		System.out.println(b5);
				
		
	}

}
