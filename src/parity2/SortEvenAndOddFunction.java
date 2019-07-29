package parity2;

public class SortEvenAndOddFunction {
	public int[] sortArrayByParityII(int[] A) {
		int i = 0;
		int j = 1;
		int n = A.length;

		while (i < n && j < n) {
			// When A[i] is even, then go to the next even element
			while (i < n && A[i] % 2 == 0) {
				i += 2;
			}

			// When A[j] is odd, then go to the next odd element
			while (j < n && A[j] % 2 == 1) {
				j += 2;
			}

			// Finally i and j still smaller than A.length
			if (i < n && j < n) {
				// Call the helper function to swap both element
				swap(A, i, j);
			}
		}
		return A;
	}

	// Helper method to swap both element
	private void swap(int[] A, int i, int j) {
		int temp = A[i];

		A[i] = A[j];

		A[j] = temp;
	}
}
