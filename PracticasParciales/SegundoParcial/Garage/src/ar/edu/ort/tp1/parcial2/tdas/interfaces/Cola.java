package ar.edu.ort.tdas.interfaces;

public interface Cola<T> extends Tda {

	void add(T element);

	T remove();

	T get();

}