package Powof2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		long num = input.nextLong();
		if(powOfTwo(num)) System.out.println("yes");
		else System.out.println("no");	
		input.close();

	}
	
	public static boolean powOfTwo(long num){
		if(num > 2 && num % 2 == 0) return powOfTwo(num/2);
		else return num == 2 || num == 1;
	}

}
