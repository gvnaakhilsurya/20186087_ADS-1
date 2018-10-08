import java.util.Scanner;
import java.util.Arrays;

public class MinHeap <E extends Comparable <E>> {

	private E[] array;
	private int size;

	MinHeap(E[] array) {
		this.array = array;
	}

	public boolean IsMinHeap() {
		for (int i = 0; i < array.length; i++) {
			if (2 * i < array.length && min(2 * i, i)) {
				return false;
			}
		}
		return true;
	}

	public boolean min(final int i, int j) {
		return array[i].compareTo(array[j]) < 0;
	}
}
	


	
