package ar.edu.ort.tdas.interfaces;

public interface Checkable {
	
	void checkEmptiness() throws RuntimeException;

	void checkFullness() throws RuntimeException;

}
