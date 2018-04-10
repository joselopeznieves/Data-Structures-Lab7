package OrderedPairs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		int[] inputArray = new int[size];  
		for(int i = 0; i < size; i++)
			inputArray[i] = input.nextInt();
		
		ArrayList<Pair> result = orderedPairs(inputArray);
		
		System.out.println(result.size());
		for(Pair pair : result) {
			System.out.println(pair.a + " " + pair.b);
		}
		
		
		input.close();
	}
	
	public static ArrayList<Pair> orderedPairs(int[] arr) {
		ArrayList<Pair> result = new ArrayList<>();
		if(arr.length > 0)
			recOP(arr, result, 0, 1);
		return result;
	}
	
	public static void recOP(int[] arr, ArrayList<Pair> result, int i, int j) {
		if(j != arr.length) {
			if(arr[i] < arr[j]) result.add(new Pair(arr[i], arr[j]));
			recOP(arr, result, i+1, j+1);
		}
	}
	
	public static class Pair{
		int a;
		int b;
		public Pair(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}

}
