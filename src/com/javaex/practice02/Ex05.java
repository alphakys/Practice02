package com.javaex.practice02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int weight;
		int height;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요");
		System.out.print("키: ");
		height = sc.nextInt();
		
		System.out.print("몸무게: ");
		weight = sc.nextInt();
		
		double standard = (height-100)*0.9;
		
		if(weight>standard) {
			System.out.print("과체중");
		}else if(weight==standard){
			System.out.print("표준");
		}else {
			System.out.print("저체중");
		}
		System.out.println("입니다.\n표준체중: "+ standard);
		
		sc.close();
	}

}
