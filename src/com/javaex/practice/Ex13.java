package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		double num1;
		double S;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		
		System.out.print("숫자: ");
		num1 = sc.nextInt();
		
		
		
		if(num1<=0) {
			S = Math.pow(num1, 3) -(9*num1)+2;
		
		}else {
			S = (7*num1)+2;
		} System.out.println("계산결과는 "+S+"입니다.");
		
		
		
		sc.close();
	}

}
