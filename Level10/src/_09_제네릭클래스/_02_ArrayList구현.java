package _09_제네릭클래스;

import java.util.Arrays;

class MyArrayList<T> {
	private T[] arr;
	private int capacity = 10;
	private final int DEFAULT_CAPACITY = 10;
	private int size;
	
	public T[] getArr() {
		return arr;
	}

	public void setArr(T[] arr) {
		this.arr = arr;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getDEFAULT_CAPACITY() {
		return DEFAULT_CAPACITY;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	MyArrayList(T[] arr, int capacity, int size) {
		this.arr = arr;
		this.capacity = capacity;
		this.size = size;
	}

	@Override
	public String toString() {
		if(size == 0) return "[]";
		String data = "[";
		for(int i=0; i<size; i++) {
			data += arr[i];
		}
		data = data.substring(0, data.length()-1);
		data+="]";
		return data;
	}

	MyArrayList() {
//		arr = new T[capacity]; //제네릭 클래스로 배열 선언을 할 수 없다
		capacity = DEFAULT_CAPACITY;
		arr = (T[]) new Object[10];
	}
	
	public void print() {
		System.out.println(Arrays.toString(arr));
	}
	
	void add(T num) {
		if(size >= capacity) {
			T[] temp = arr;
			arr = (T[])new Object[capacity+DEFAULT_CAPACITY];
			capacity+=10;
			for(int i=0; i<size; i++) {
				arr[i] = temp[i];
			}
		}
		arr[size++] = num;
	}
	
	int size() {
		return size;
	}
	
	int capacity() {
		return capacity;
	}
	
	T get(int idx) {
		if(idx < 0 || idx >= size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return arr[idx];
	}
	
	
//	void add(int val) {
//		if(size >= capacity) {
//			int[] temp = arr;
//			arr = new int[capacity + DEFAULT_CAPACITY];
//			capacity+=10;
//			for(int i =0; i < size;i+=1) {
//				arr[i] = temp[i];
//			}
//		}
//		
//		arr[size] = val;
//		size+=1;
//	}
//	
//	
//	void add(int idx , int val) {
//		if(idx < 0 || idx >= size) {
//			throw new ArrayIndexOutOfBoundsException();
//		}
//		if(size >= capacity) {
//			int[] temp = arr;
//			arr = new int[capacity + 10];
//			capacity+=10;
//			for(int i =0; i < size;i+=1) {
//				arr[i] = temp[i];
//			}
//		}
//		for(int i = size; i > idx; i--) {
//			arr[i] = arr[i-1];
//		}
//		arr[idx] = val;
//		size+=1;
//	}
//	
//	void set(int idx , int val) {
//		if(idx < 0 || idx >= size) {
//			throw new ArrayIndexOutOfBoundsException();
//		}
//		arr[idx] = val;
//	}
//	
//	int remove(int idx) {
//		if(idx < 0 || idx >= size) {
//			throw new ArrayIndexOutOfBoundsException();
//		}
//		int num = arr[idx];
//		for(int i = idx; i < size; i++) {
//			arr[i] = arr[i+1];
//		}
//		arr[size] = 0;
//		size-=1;
//		
//		if(size == capacity- DEFAULT_CAPACITY ) {
//			capacity-=10;
//		}
//		
//		return num;
//	}
//	boolean remove(Integer value) {
//		
//		int idx = -1;
//		for(int i =0; i < size;i+=1)
//			if(value == arr[i]) {
//				idx = i;
//				break;
//			}
//		
//		if(idx == -1) return false;
//
//		for(int i = idx; i < size; i++) {
//			arr[i] = arr[i+1];
//		}
//		arr[size] = 0;
//		size-=1;
//		
//		if(size == capacity- DEFAULT_CAPACITY) {
//			capacity-=10;
//		}
//		
//		return true;
//	}
//	
//	void clear() {
//		size =0;
//		arr = new int[capacity];
//	}
//}

}


public class _02_ArrayList구현 {
	
	public static void main(String[] args) {
		
		MyArrayList<Double> list1 = new MyArrayList();
		list1.print();
		
		MyArrayList<Integer> list2 = new MyArrayList();
		list2.print();
		
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		MyArrayList<Double> v1 = new MyArrayList<>();
		
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		for(int i=0; i<10; i++) {
			v1.add((i + 1) * 10 *1.0);
		}
		
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println(v1.get(1));
		
//		v1.set(1, 1000.0);
//		System.out.println(v1);
//		
//		v1.add(1,20.0);
//		System.out.println(v1);
//		
//		v1.remove(3);
//		System.out.println(v1);
//		System.out.println(v1.size());
//		System.out.println(v1.capacity());
//		
//		v1.clear();
//		System.out.println(v1);
//		System.out.println(v1.size());
//		System.out.println(v1.capacity());
	}
}


/*
주요 기능
	1. 추가	: add(value)
	2. 삭제	: remove(int idx), remove(Integer value)
	3. 삽입	: add(idx, value)
	4. 수정	: set(idx, value)
	5. 갯수	: size
	6. 값 읽기	: get(idx)
	7. 전체 삭제	: clear()
*/