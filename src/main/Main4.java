package main;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		
		// = => 값을 치환(넣음)
		// == => 같음? 물어보는거임 (비교)
		// != => 다름? 물어보는거임 (비교)
		// && => AND
		// || => OR
		// 자동정렬 ctrl+shif+f
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력: ");
		int a = sc.nextInt();	
		
		
		if (a % 5 == 0) {// 5의배수인지 물어보는거 5로 나눴을 때 0 으로 나누어 떨어지는지
			System.out.println("5의 배수임");
		} else
			System.out.println("5의 배수 아님");

		// 점수 평가
		System.out.print("점수 입력: ");
		int b = sc.nextInt();

		if (b >= 90 && b <= 100) { // java는 90 <= b <= 100 불가능 따로 따로 해야함
			System.out.println("A");
		} else if (b >= 80 && b <= 89) {
			System.out.println("B");
		} else if (b >= 70 && b <= 79) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		
		//문제1 입력받은 숫자 a가 짝수인지 홀수인지 확인
			System.out.print("숫자 입력: ");
			int c = sc.nextInt();
			if(c%2==0) {
				System.out.println("짝수");
			}else
				System.out.println("홀수");
		
			
		
		//문제2 입력 받은 숫자가 3, 5, 3 5 인지 확인
		// ex) 15 -> 3 5 
		// ex) 5 -> 5
		System.out.print("숫자 입력: ");
		int d = sc.nextInt();
		
		if(d%3==0 && d%5==0) {		//순서 중요함
			System.out.println("3 5");
		}else if(d%5==0) {
			System.out.println("5");
		}else if(d%3==0) {
			System.out.println("3");
		}
		
		
		//종료
		sc.close();

	}

}
