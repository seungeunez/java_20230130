package main;

//ctrl+shift+o
import java.util.Scanner;	

public class Main3 {

	public static void main(String[] args) {
		// 클래스명 객체명 = new 클래스명(준비물);
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 ");
		int a = sc.nextInt();	//nextInt() : int
		
		System.out.print("두번째 숫자 입력 ");
		int b = sc.nextInt();
		
		System.out.print("세번째 숫자 입력 ");
		int c = sc.nextInt();
		
		System.out.println("입력한 수의 합은 = "+ (a+b+c));
		
//		float avg = (a+b+c)/3;
		float avg = (a+b+c)/3.f;
		System.out.println("평균은 = " + avg);
//		System.out.println("평균은 = " + (a+b+c)/3.0);
		
		//정수형
		int a1 = 13;
		long a2= 13L;
		
		//실수형
		float a3 = 3.14f;	
			//float avg = sum / 3.0f;
		double a4 = 2.45d;
		
		//문자형
		char a5 = 'c';
		

		
		//다 사용했음
		sc.close();
		
	}

}
