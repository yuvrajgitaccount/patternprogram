package com.demo;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.printf("%d",+j);
			}
			System.out.println("\n");
		}

	}

}
