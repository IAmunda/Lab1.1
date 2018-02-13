package modularidad;

public class Ejemplar {

	private String signatura, titulo, autor;
	private int añoEdicion, estado;
	
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

	public int getAñoEdicion() {
		return añoEdicion;
	}

	public void setAñoEdicion(int añoEdicion) {
		this.añoEdicion = añoEdicion;
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
		return "El ejemplar contiene los siguientes datos: signatura"+ejemplar.getSignatura()+"título:"+ejemplar.getTitulo()+"autor:"+ejemplar.getAutor()+"año de edición:"+ejemplar.getAñoEdicion()+"estado:"+ejemplar.getEstado();
	}
	//Constructoras
	
	public Ejemplar() {
		this.setEstado(0);
	}
	
	public Ejemplar(String signatura, String titulo, String autor, int añoEdicion) {
		setSignatura(signatura);
		setTitulo(titulo);
		setAutor(autor);
		setAñoEdicion(añoEdicion);
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
		System.out.println("El título del ejemplar es:"+ejemplar.getTitulo());
		System.out.println("El año de edición del ejemplar es:"+ejemplar.getAñoEdicion());
		System.out.println("El estado del ejemplar es:"+ejemplar.getEstado());
	}
	
	
}
