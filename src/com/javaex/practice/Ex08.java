package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b;
		int c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		a = sc.nextInt();
		
		System.out.print("숫자2: ");
		b = sc.nextInt();
		
		System.out.print("숫자3: ");
		c = sc.nextInt();
						
		
		
		
		if(a>=b) { 
			if(b>=c) { 
				if(b>c) {
					System.out.println("가장 작은수는 "+c+"입니다.");
						}
				else {
					System.out.println("가장 작은수는 "+b+"입니다.");
					 } 
					}
			else { 
					System.out.println("가장 작은수는 "+b+"입니다.");
				} 
					}
		
			
		
		
	
	
		else {
			if(a>=c) {
				if(a>c) {
					System.out.println("가장 작은수는 "+c+"입니다.");
						}
				else {
					System.out.println("가장 작은수는 "+c+"입니다.");
					 }
					 }
			else {
				System.out.println("가장 작은수는 "+a+"입니다.");	
				 }
					
			 }
	
					sc.close();
			  
			}}
	
	
	
	
