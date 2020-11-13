package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("수익을 입력해주세요");
		
		System.out.print("금익: ");
		double num1 = sc.nextInt();
		double tax;
		
	
		
		if(num1<0) {
			System.out.println("잘못 입력했습니다.");
			return;
		}else if(num1<=1000) {
			tax = 0.09*num1;
		}else if(num1<=4000) {
			tax = (1000*0.09) + (0.18*(num1-1000));
		}else if(num1<8000) {
			tax = (1000*0.09) + (3000*0.18)+(0.27*(num1-4000));
		}else {
			tax = (1000*0.09) + (3000*0.18)+(4000*0.27)+(0.36*(num1-8000));
		} System.out.println("소득세는 "+tax+"입니다.");
			
		
		
		
		
		
		
		
	
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
	

}}
