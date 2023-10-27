

public class Main {
	public static int linearSearch(int[] arr, int key) {

		for (int i = 0; i < arr.length; i++)
			if (arr[i] == key)
				return i;
		return -1;
	}

	public static int lastlinearSearch(int[] arr, int key) {

		for (int i = arr.length - 1; i >= 0; i--)
			if (arr[i] == key)
				return i;
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, -1, 2, 1, 0, -1, 7, 8 };
		for (int i : arr) {
			if (linearSearch(arr, i) == lastlinearSearch(arr, i)) {
				System.out.println("Value :" + i);
				break;
			}
		}
	}

}