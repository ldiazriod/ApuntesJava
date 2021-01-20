package Genericos1;

public class MinimoMaximo<T extends Comparable<T>> implements IMinMax<T> {
	
	private T [] vector;
	
	public MinimoMaximo(T [] vector) {
		this.vector = vector;
	}
	
	public T max() {
		T max = this.vector[0];
		
		for(int i = 1; i < this.vector.length; i++) {
			if(this.vector[i].compareTo(max) > 0) {
				max = this.vector[i];
			}
		}
		return max;
	}
	
	public T min() {
		T min = this.vector[0];
		for(int i = 1; i < this.vector.length; i++) {
			if(this.vector[i].compareTo(min) < 0) {
				min = this.vector[i];
			}
		}
		return min;
	}
	
}
