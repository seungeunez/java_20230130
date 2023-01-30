package main;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		
		//클래스명 객체명 = new 클래스명(준비물);
		Scanner scanner = new Scanner(System.in);
		
		//정수면 nextInt 실수면 nextFloat
		
		System.out.print("점수 입력: ");
		float a1 = scanner.nextFloat();
		float a2 = scanner.nextFloat();
		float a3 = scanner.nextFloat();
		
		float avg = (a1+a2+a3)/3.f;
		if(avg>=90)
			System.out.println("A");
		else if(avg>=80)
			System.out.println("B");
		else
			System.out.println("C");
		
		
		
		
		//scanner 닫기 
		scanner.close();
	}

}
