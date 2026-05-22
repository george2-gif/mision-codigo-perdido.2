package heroe_java;

public class Heroe {

	private String nombre;
	private int nivel;
	private int poder;

	public Heroe(String nombre, int nivel, int poder) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.poder = poder;
	}

	public void entrenar() {
		this.poder += 10;
		System.out.println(this.nombre + " ha entrenado duramente. ¡Su poder aumentó en 10 puntos!");
	}

	public void mostrarEstado() {
		System.out.println("Estadísticas del Héroe");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Nivel: " + this.nivel);
		System.out.println("Poder Actual: " + this.poder);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}


}
	
