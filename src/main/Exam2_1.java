package main;

import java.util.Scanner;

public class Exam2_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자 입력: ");
		int num = scanner.nextInt();
		scanner.close();
		
		System.out.println();
		
		// 숫자 5를 입력하면 아래처럼 출력하시오
		// 1 2 3 4 5 4 3 2 1
		
		System.out.println("첫번째 문제");
		
		int i = 0;
		int j = 0;
		
		for(i=1; i<=num; i++) {
			System.out.print(i+" ");
		}
		for(j=num-1; j>0; j--) {
			System.out.print(j+" ");
		}
		
		
		System.out.println();
		System.out.println();
		
//=========================================================		
		
		// 문제2 숫자 13을 입력하면 3의 배수의 합 구하기
		// 3 6 9 12  => 30
		
		System.out.println("두번째 문제");
		
		int x=0;
		int y=0;
		
		for(x=0; x<=num; x+=3) {
			y=y+x;
			System.out.print(x+" ");
		}
		System.out.println("=" + y);
	
		
		System.out.println();
		
//================================================================		
		// 문제3 숫자 10을 입력하면 홀수의 합 짝수의 합 각각 구하기
		// 10 => 1 3 5 7 9 => 25
		// 10 => 2 4 6 8 10 => 30
		
		System.out.println("세번째 문제");
		
		int a=0;
		int b=0;
		int x1=0;
		int y1=0;
		
		for(a=0; a<=num; a+=2) {
			b=b+a;
			System.out.print(a+" ");
		}
		System.out.println("="+b);
		
		for(x1=1; x1<=num; x1+=2) {
			y1=y1+x1;
			System.out.print(x1+" ");
		}
		System.out.println("="+y1);
		
		
		//Ver.선생님
		
		int t=0;
		int sum1 =0; //홀
		int sum2 = 0; //짝
		for(t=1; t<=num; t++) {
			if(t%2==0) {
				sum1 = sum1 + t;
			}else {
				sum2 += t;
			}
		}
		System.out.println("짝수합 = " + sum1);
		System.out.println("홀수합 = " + sum2);
		
		
		
		System.out.println();
		
//=========================================================		
		// 문제4 숫자 7을 입력하면 구구단 구하기
		
		System.out.println("네번째 문제");
		
		int u=0;
		int k=0;
		for(u=num; u<=num; u++) {
			for(k=1; k<=9; k++)
				System.out.println(u+" * "+k+" = "+(u*k));
		}
		
		

	}

}
