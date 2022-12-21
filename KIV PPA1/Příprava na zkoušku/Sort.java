import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {

		int[] array = {2, 9, 1, 4, 7, 6, 8, 5, 3};

		int[] selectionSortArray = Arrays.copyOf(array, array.length);
		selectionSort(selectionSortArray);
		displayArray(selectionSortArray);

		int[] insertSortArray = Arrays.copyOf(array, array.length);
		insertSort(insertSortArray);
		displayArray(insertSortArray);

		int[] bubbleSortArray = Arrays.copyOf(array, array.length);
		bubbleSort(bubbleSortArray);
		displayArray(bubbleSortArray);

	}

	public static void bubbleSort(int[] array) {
		for(int i=1; i<array.length; i++) {
			boolean swapped = false;
			for(int j=array.length-1; j >= i; j--) {
				if(array[j-1] > array[j]) {
					int currentNumber = array[j];
					array[j] = array[j-1];
					array[j-1] = currentNumber;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}

	public static void insertSort(int[] array) {
		for(int i=1; i<array.length; i++) {
			int currentNumber = array[i];
			int j = i-1;
			while(j >= 0 && array[j] > currentNumber) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = currentNumber;
		}
	}

	public static void selectionSort(int[] array) {
		for(int i=0; i<array.length; i++) {
			int iMin = i;
			for(int j=i+1; j<array.length; j++) {
				if(array[iMin] > array[j]) {
					iMin = j;
				}
			}
			if(iMin != i) {
				int currentNumber = array[i];
				array[i] = array[iMin];
				array[iMin] = currentNumber;
			}
		}
	}

	public static void displayArray(int[] array) {
		for (int i : array) {
			System.out.print(i);
		}
		System.out.println();
	}

}