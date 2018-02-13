package modularidad;

public class Ejemplar {

	private String signatura, titulo, autor;
	private int a�oEdicion, estado;
	
	//Getters y setters
	
	public String getSignatura() {
		return signatura;
	}

	public void setSignatura(String signatura) {
		this.signatura = signatura;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getA�oEdicion() {
		return a�oEdicion;
	}

	public void setA�oEdicion(int a�oEdicion) {
		this.a�oEdicion = a�oEdicion;
	}

	public int getEstado() {
		return estado;
	}

	//A setEstado solo se le pueden asignar 3 valores, el 0, 1 y -1.

	public void setEstado(int estado) {
		
		this.estado = estado;
	}
	
	//Visualizadores o de consulta
	
	public boolean estaLibre() {
		
		return this.estado == 0;
	}
	
	public boolean estaPrestado() {
		
		return this.estado == 1;
	}
	
	public boolean estaDesaparecido() {
		
		return this.estado == -1;
	}
	
	public int estadoEjemplar() {
		
		if(this.estaLibre()) {
			return 0;
		}
		if(this.estaPrestado()) {
			return 1;
		}
	}
	
	public String toString(Ejemplar ejemplar) {
		return "El ejemplar contiene los siguientes datos: signatura"+ejemplar.getSignatura()+"t�tulo:"+ejemplar.getTitulo()+"autor:"+ejemplar.getAutor()+"a�o de edici�n:"+ejemplar.getA�oEdicion()+"estado:"+ejemplar.getEstado();
	}
	//Constructoras
	
	public Ejemplar() {
		this.setEstado(0);
	}
	
	public Ejemplar(String signatura, String titulo, String autor, int a�oEdicion) {
		setSignatura(signatura);
		setTitulo(titulo);
		setAutor(autor);
		setA�oEdicion(a�oEdicion);
		setEstado(0);
	}
	
	//Modificadoras
	
	public void prestar(Ejemplar ejemplar) {
		if(ejemplar.getEstado() != 1) {
			ejemplar.setEstado(1);
		}
	}
	
	public void devolver(Ejemplar ejemplar) {
		if(ejemplar.getEstado() != 0) {
			ejemplar.setEstado(0);
		}
	}
	
	public void desaparecido(Ejemplar ejemplar) {
		if(ejemplar.getEstado() != -1) {
			ejemplar.setEstado(-1);
		}
	}
	
	//Entrada/Salida
	
	public void leerEjemplar(Ejemplar ejemplar) {
		System.out.print("Asigna la signatura del ejemplar");
	}
	
	public void escribeEjemplar(Ejemplar ejemplar) {
		System.out.println("La sginatura del ejemplar es:"+ejemplar.getSignatura());
		System.out.println("El autor del ejemplar es:"+ejemplar.getTitulo());
		System.out.println("El t�tulo del ejemplar es:"+ejemplar.getTitulo());
		System.out.println("El a�o de edici�n del ejemplar es:"+ejemplar.getA�oEdicion());
		System.out.println("El estado del ejemplar es:"+ejemplar.getEstado());
	}
	
	
}
