package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사번(정수)를 입력해주세요");
		
		
		System.out.print("사번: ");
		num = sc.nextInt();
		
		if((num%3==0) &&(num>0)) {
			System.out.print("A팀");
		}else if(num%3==1){
			System.out.print("B팀");
		}else if(num%3==2)
		System.out.println("C팀");
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
		sc.close();
	}

}
