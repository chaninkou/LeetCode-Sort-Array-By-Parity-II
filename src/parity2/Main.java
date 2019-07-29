package parity2;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4};
		
		System.out.println("Input: " + Arrays.toString(A));
		
		SortEvenAndOddFunction solution = new SortEvenAndOddFunction();
		
		System.out.println("Solution: " + Arrays.toString(solution.sortArrayByParityII(A)));
	}
}
