package ar.edu.ort.tp1.clases;

public class Atleta {
    private int id;
    private double tiempo;
    
    

    public Atleta(int id, double tiempo) {
		super();
		this.id = id;
		this.tiempo = tiempo;
	}

	public int getId() {
        return id;
    }

    public double getTiempo() {
        return tiempo;
    }

	@Override
	public String toString() {
		return "Atleta [id=" + id + ", tiempo=" + tiempo + "]";
	}

    
}
