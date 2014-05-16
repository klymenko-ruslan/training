package dataStructures;

import java.util.Iterator;

public class UserSet<T> implements Iterable<T>{
	private int N;
	private T set [];
	
	public UserSet() {
		clear();
	}
	
	public void add(T obj) {
		if(N + 1 > set.length - 1) {
			resize(N * 2);
		}
		if(!contains(obj)) {
			set[N++] = obj;
		}
	}
	
	public boolean contains(T obj) {
		for(T current : set) {
			if(current != null && current.equals(obj)) {
				return true;
			}
		}
		return false;
	}
	
	public void remove(T obj) {
		for(int i = 0; i < set.length; i++) {
			if(set[i] != null && set[i].equals(obj)) {
				System.arraycopy(set, i+1, set, i, N - i);
				set[N-1] = null;
				N--;
				break;
			}
		}
	}
	
	public int size() {
		return N;
	}
	
	public void clear() {
		N = 0;
		set = (T[]) new Object[4];
	}
	
	private void resize(int size) {
		T tmp [] = set;
		set = (T[]) new Object[size];
		System.arraycopy(tmp, 0, set, 0, tmp.length);
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public T [] toArray() {
		T [] array = (T[]) new Object[N];
		System.arraycopy(set, 0, array, 0, N);
		return (T[])array;
	}
	
	@Override 
	public boolean equals(Object obj) {
		if(!(obj instanceof UserSet)) {
			return false;
		}
		UserSet userSet = (UserSet) obj;
		for(int i = 0; i < set.length; i++) {
			if(set[i] != null && !userSet.contains(set[i])) {
				return false;
			}
		}
		return true;
	}

	public Iterator<T> iterator() {
		return new UserSetIterator();
	}	
	
	
	private class UserSetIterator implements Iterator<T> {
		private T [] iterSet;
		private int cnt;
		public UserSetIterator() {
			iterSet = set;
		}		
		

		public boolean hasNext() {
			return iterSet[cnt] != null;
		}

		public T next() {
			return iterSet[cnt++];
		}

		public void remove() {
			throw new UnsupportedOperationException();			
		}		
	}
}
