package quickSort;

public class QuickSort {
	public static void main(String[] args) {
		int[] numbers = { 18, 52, 236, 3, 7, -8};
		
		QuickSort q = new QuickSort();
		q.quickSort(numbers, 0, numbers.length - 1);

		for(int s:numbers){
			System.out.print(" \t "+s);
		}
		
	}

	void quickSort(int[] numbers, int start, int end) {
		int pivot = start;
		int i = start + 1, j = end;
		while (true) {
			while (numbers[i] < numbers[pivot])
				i++;
			while (numbers[j] > numbers[pivot])
				j--;
			if (i < j){
				swap(numbers, i, j);
			}
			else
				break;
		}
		if (numbers[pivot] > numbers[j]) {
			swap(numbers, j, pivot);
			pivot = j;
		}

		if (pivot - start - 1 > 0)
			quickSort(numbers, start, pivot - 1);
		if (end - pivot - 1 > 0)
			quickSort(numbers, pivot + 1, end);
	}

	void swap(int array[], int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}
