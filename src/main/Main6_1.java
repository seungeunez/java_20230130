package main;

import java.util.Scanner;

public class Main6_1 {

	public static void main(String[] args) {
		//문제 두 개의 숫자를 입력받아서 범위 만큼 출력 (같은 숫자는 없음)
		// ex) 3 7 -> 3 4 5 6 7
		// ex) 8 2 -> 2 3 4 5 6 7 8
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("입력: ");
		int num = scanner.nextInt();
		int num1 = scanner.nextInt();
		scanner.close();
		
		int i;
		
		
		if(num < num1) {
			for(i=num; i<=num1; i++) {
				System.out.print(i+" ");
			}
			
		}
		else if(num >num1) {
			for(i=num1; i<=num; i++) {
				System.out.print(i+" ");
			}
		}
		
		
		

	}

}
