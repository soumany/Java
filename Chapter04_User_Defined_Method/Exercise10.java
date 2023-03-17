import java.util.concurrent.atomic.AtomicInteger;

public class Exercise10 {
	public static void removeInt(int[] array, AtomicInteger size, int number) {
		// Loop through every element and remove the element equal to number
		for (int i = 0; i < size.get(); i++) {
			// Remove the element
			if (array[i] == number) {
				for (int j = i; j < size.get() - 1; j++) {
					array[j] = array[j + 1];
				}
				size.decrementAndGet();
				i--;
			}
		}
	}

	public static void printArray(int[] array, int size) {
		System.out.print("Array: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] array = { 1, 3, 2, 4, 2, 3, 3, 1, 3, 6 };
		AtomicInteger size = new AtomicInteger(array.length);
		// Print array before removeInt
		printArray(array, size.get());
		System.out.println("Remove number occurance from array");
		removeInt(array, size, 3);
		// Print array after removeInt
		printArray(array, size.get());
	}
}