package FibNums;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		Pair pair = fib(num);
		System.out.println(pair.a);
		input.close();

	}
	
	public static Pair fib(long num){
		if(num < 2) return new Pair(1,1);
		else {
			Pair p = fib(num-1);
			return new Pair(p.a + p.b, p.a);
		}
	}
	
	//a represents the n and b the n-1 
	private static class Pair{
		long a;
		long b;
		public Pair(long a, long b){
			this.a = a;
			this.b = b;
		}
	}
}
