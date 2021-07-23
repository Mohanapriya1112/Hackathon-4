package com.sample.dupli;

import java.util.Scanner;

public class swap {
	
	public static void main(String[] args) {
		
	int n,count=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	n=s.nextInt();
	for (int i = 1; i<=10; i++) {
		if (n%i==0) {
			count++;
			
		}
		
	}
	if(count==2) {
		System.out.println(n+"prime");
	}
	else {
		System.out.println(n+"is not a prime");
	}
	

	}
}


