package main;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("입력: ");
		int num = scanner.nextInt();	// 키보드로 숫자 입력정수(13)
		scanner.close();
		
		int i; //반복문용 변수
		
		// i++ => i = i + 1
		// i+=2 => i = i + 2
		//for(임시변수=초기값; 임시변수를 이용한 조건; 임시변수의 변화(1씩증가))
		// 조건이 거짓이 되면 출력안됨 마지막 조건이 거짓이 되도록 만들어야 함
		for(i=1; i<=num; i++) {	//1, 2, 3, 4
			System.out.print(i+" ");
		}
		
		System.out.println(" ");
		
		for(i=num;i>=1;i--) {
			System.out.print(i+" ");
			
		}
		//이 위치의 i 값은? 4
		
		
	
		
		
		
	}

}
