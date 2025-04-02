package com_program;

public class Program_Practice {
public static void main(String[] args) {
	reverseString();
}
public static void reverseString() {
	String str="Jyoti Gaikwad";
	String rev="";
	for(int i=str.length()-1;i>=0;i--) {
	rev=rev+str.charAt(i);
	}
	System.out.println(rev);
}
}
