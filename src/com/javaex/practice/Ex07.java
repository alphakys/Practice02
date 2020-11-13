package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		num1 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		num2 = sc.nextInt();
		
		
		
		if(num1>num2) {
			System.out.println("몫: "+(num1/num2)+"\n나머지: "+ (num1%num2));
		
		}else {
			System.out.println("몫: "+(num2/num1)+"\n나머지: "+ (num2%num1));
		}
		
		sc.close();
	}

}
