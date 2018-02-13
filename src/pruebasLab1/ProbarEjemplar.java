package pruebasLab1;

import modularidad.Ejemplar;

public class ProbarEjemplar {
	
	public static void probarConstructorYMas(){
		Ejemplar e= new Ejemplar();
		System.out.println(e.toString());
		System.out.println();
		
		e.setAutor("Maite");
		e.setTitulo("Los cuentos preferidos");
		e.setSignatura("GSJEY567");
		e.setAñoEdicion(2020);
		System.out.println(e.toString());
		
		System.out.println(e.getSignatura()+" "+e.getAutor()+" "+e.getTitulo()+" "+e.getAñoEdicion()+" "+e.getEstado());
		Ejemplar ee=new Ejemplar("FGTFC$","Alguien", "Las cosas",2030);
		System.out.println();
		System.out.println(ee.toString());
		System.out.println(ee.getSignatura()+" "+ee.getAutor()+" "+ee.getTitulo()+" "+ee.getAñoEdicion()+" "+ee.getEstado());
	}
	
	public static void casoEstadoEjemplar(int caso, Ejemplar e, int esperado){
		int resultado = e.estadoEjemplar();
		System.out.print(" casoEstado "+caso+": ");
		if (esperado==resultado) System.out.println("PASA");
		else System.out.println("ERROR: Valor esperado "+esperado+", resultado obtenido "+resultado);
	}

	public static void casoEstaLibre(int caso, Ejemplar e, boolean esperado){
		boolean resultado=e.estaLibre();
		System.out.print(" casoEstaLibre "+caso+": ");
		if (esperado==resultado) System.out.println("PASA");
		else System.out.println("ERROR: Valor esperado "+esperado+", resultado obtenido "+resultado);
	}

	public static void casoEstaPrestado(int caso, Ejemplar e, boolean esperado){
		boolean resultado=e.estaPrestado();
		System.out.print(" casoEstaPrestado "+caso+": ");
		if (esperado==resultado) System.out.println("PASA");
		else System.out.println("ERROR: Valor esperado "+esperado+", resultado obtenido "+resultado);
	}

	public static void casoQueEstado(int caso, Ejemplar e, String esperado){
		String resultado=e.queEstado();
		System.out.print(" casoQueEstado "+caso+": ");
		if (esperado.equals(resultado)) System.out.println("PASA");
		else System.out.println("ERROR: Valor esperado "+esperado+", resultado obtenido "+resultado);
	}

	public static void probarEstadoEjemplar(){
		Ejemplar e= new Ejemplar();
		e.setAutor("Maite");
		e.setTitulo("Los cuentos preferidos");
		e.setSignatura("GSJEY567");
		e.setAñoEdicion(2020);

		System.out.print(e.toString());
		casoEstadoEjemplar(1, e, 0);
		System.out.println();

		e.setEstado(1);
		System.out.print(e.toString());
		casoEstadoEjemplar(2, e, 1);
		System.out.println();

		e.setEstado(-1);
		System.out.print(e.toString());
		casoEstadoEjemplar(3, e, -1);
	}

	public static void probarEstaLibre(){
		Ejemplar e= new Ejemplar();
		e.setAutor("Maite");
		e.setTitulo("Los cuentos preferidos");
		e.setSignatura("GSJEY567");
		e.setAñoEdicion(2020);

		System.out.print(e.toString());
		casoEstaLibre(1, e, true);
		System.out.println();

		e.setEstado(1);
		System.out.print(e.toString());
		casoEstaLibre(2, e, false);
		System.out.println();

		e.setEstado(-1);
		System.out.print(e.toString());
		casoEstaLibre(3, e,  false);
	}
	
	public static void probarEstaPrestado(){
		Ejemplar e= new Ejemplar();
		e.setAutor("Maite");
		e.setTitulo("Los cuentos preferidos");
		e.setSignatura("GSJEY567");
		e.setAñoEdicion(2020);

		System.out.print(e.toString());
		casoEstaPrestado(1, e, false);
		System.out.println();

		e.setEstado(1);
		System.out.print(e.toString());
		casoEstaPrestado(2, e, true);
		System.out.println();

		e.setEstado(-1);
		System.out.print(e.toString());
		casoEstaPrestado(3, e, false);
	}
	
	public static void probarQueEstado(){
		Ejemplar e= new Ejemplar();
		e.setAutor("Maite");
		e.setTitulo("Los cuentos preferidos");
		e.setSignatura("GSJEY567");
		e.setAñoEdicion(2020);

		System.out.print(e.toString());
		casoQueEstado(1, e, "libre");
		System.out.println();

		e.setEstado(1);
		System.out.print(e.toString());
		casoQueEstado(2, e, "prestado");
		System.out.println();

		e.setEstado(-1);
		System.out.print(e.toString());
		casoQueEstado(1, e, "desaparecido");
	}
	
	public static void main (String[] args){
		System.out.println("Hola");
		probarConstructorYMas();
		System.out.println();

		probarEstadoEjemplar();
		System.out.println();

		probarEstaLibre();
		System.out.println();

		probarEstaPrestado();
		System.out.println();

		probarQueEstado();
		System.out.println();
	}
}