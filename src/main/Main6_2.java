package main;

import java.util.Scanner;

public class Main6_2 {

	public static void main(String[] args) {
		//문제2 숫자 1개 입력 10
		//3의 배수일 때에만 1로 출력
		//       1 2 3 4 5 6 7 8 9 10
		// 출력결과 0 0 1 0 0 1 0 0 1 0
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력: ");
		int num = scanner.nextInt();
		scanner.close();
		
		int i;
		
		
		for(i=1; i<=num; i++) {	
			System.out.print(i+" ");
		}
		System.out.println("");
		
		//합치는건 안되는건가??
		
		for(i=1; i<=num; i++) {	
			
			if(i%3==0) {
				System.out.print("1 ");
			}else {
				System.out.print("0 ");
			}
		}
		
	}

}
