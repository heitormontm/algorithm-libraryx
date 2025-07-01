
public class Array {

	private int[] data;
	private int size;
		
	public Array(int capacity) {
		data = new int[capacity];
		size = 0;
	}

	public void add(int value) {
		if(size == data.length) {
			System.out.println("Array is full");
			return;
		}
		
		data[size] = value;
		size++;
	}
	
	public int get(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index out of range");
		}
		
		return data[index];
	}
	
	public void set(int index, int value) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index out of range");
		}
		
		data[index] = value;
	}
	
	public void removeLast() {
		if(size > 0) {
			size--;
		}
	}
	
	public int size() {
		return size;
	}
	
	public void print() {
		System.out.print("Array: ");
		for(int i = 0; i < size; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
}
