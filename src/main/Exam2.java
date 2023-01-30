package main;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		
		int i = 0;	//반복문 임시변수
		int j = 0;
		
		for(i=1; i<=5; i++) {
			System.out.println("*");
		}
		
		
		
		
		//순서대로 출력
		for(i=1; i<=5; i++) { // 1 2 3 4 5
			for(j=1;j<i;j++) {	// 1 12 123 1234 12345
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 거꾸로 출력
//		
//		for(i=1; i<=5; i++) { // 1 2 3 4 5
//			for(j=5;j>i;j--) {	// 12345 1234 123 12 1
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(i=1; i<=5; i++) { // 1 2 3 4 5
			for(j=1;j<(6-i);j++) {	// 12345 1234 123 12 1
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 2씩 증가하며 출력
		//이런거 두개씩 쓸일은 거의 없다  하나만 제대로 이해하자 
		for(i=1; i<=5; i++) { // 1 2 3 4 5	5번째 줄까지 출력한다는 의미
			for(j=1; j<=(i*2-1);j++) {	// 1 123 12357 1234579	//j<i*2로해도 괜찮음
				System.out.print("*");
			}
			System.out.println();	// 첫번째 줄 두번째 줄 세번째 줄 줄바꿈 느낌
		}
		

		
		

	}

}
