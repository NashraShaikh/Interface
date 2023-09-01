package com.jsp.Interface;

public class Wrapper {

	public static void main(String[] args) {
		int a=20;
		int b=40;
		
		//CONVERT TO WRAPPER CLASS
		Integer c= Integer.valueOf(a); //BOXING
		Integer d = b; //AUTO- BOXING
		
		//CONVERT TO PRIMIRTIVE CLASS
		int e= c.intValue(); //UNBOXING
		int f=d;             //AUTO-UNBOXING
		
		//PRINT
		System.out.println(e);
		System.out.println(f);
 
	}

}
