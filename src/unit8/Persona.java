/**
 * 
 */
package unit8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @author Antonio Reche Ramal
 * @version Mayo 2015
 */
public abstract class Persona {
	protected String nombre;
	protected String dni;
	protected ArrayList<Asignatura> asignaturas=new ArrayList<Asignatura>();
	
	/**
	 *Constructor por defecto 
	 */
	public Persona(){		
	}
	
	/**
	 * Constructor parametrizado para asignar el nombre y el dni al inicializar el objeto
	 * @param nombre --> nombre de la persona
	 * @param dni --> dni de la persona
	 */
	public Persona(String nombre, String dni){
		this.nombre=nombre;
		this.dni=dni;
	}
	
	/**
	 * Método para añadir asignatura al arraylist
	 * @param a --> objeto del tipo  Asignatura
	 */
	public void anyadirAsignatura(Asignatura a){
		asignaturas.add(a);
	}
	
	/**
	 * Método que indica si es profesor o no
	 * @return 'true' si lo es o 'false' si no
	 */
	public abstract boolean esProfesor();
	
	/**
	 * Método que muestra por pantalla el nombre de la persona, las asignaturas y la nota de cada una.
	 */
	public void mostrarListadoAsignaturasNota(){
		Iterator<Asignatura> iterador=asignaturas.iterator();
		
		while(iterador.hasNext()){
			Asignatura a=iterador.next();
			
			System.out.println("\tAsignatura: "+a.getNombre());
			System.out.println("\tNota: "+a.getNota());
		}
	}
	
	/**
	 * Método get para el atributo nombre
	 * @return nombre de la persona
	 */
	public String getNombre(){
		return nombre;
	}
	
	/**
	 * Método set para el atributo nombre
	 * @param nombre -->nombre de la persona
	 */
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	/**
	 * Método get para el atributo dni
	 * @return dni de la persona
	 */
	public String getDni(){
		return dni;
	}
	
	/**
	 * Método set para dni
	 * @param dni
	 */
	public void setDni(String dni){
		this.dni=dni;
	}
	
	/**
	 * Método get para el ArrayList de asignaturas
	 * @return ArrayList con objetos del tipo Asignatura
	 */
	public ArrayList<Asignatura> getAsignaturas(){
		return asignaturas;
	}
		
	/**
	 *	Método que  ordena el ArrayList por el nombre de las asignaturas redefiniendo el método 
	 *  compare de  la clase Collections 
	 */
	public void ordenarPorAsignaturas(){
		Collections.sort(asignaturas, new Comparator<Asignatura>() {
			@Override
			public int compare(Asignatura a1, Asignatura a2) {
				return new String(a1.getNombre()).compareTo(new String(a2.getNombre()));
			}
		});				
	}
	
	/**
	 *	Método que  ordena el ArrayList  de las asignaturas por nota de mayor a menor redefiniendo el método 
	 *  compare de  la clase Collections 
	 */
	public void ordenarPorNota(){
		Collections.sort(asignaturas, new Comparator<Asignatura>(){
			@Override
			public int compare(Asignatura a1, Asignatura a2){
				//ordenado de mayor a menor nota
				return new Double(a2.getNota()).compareTo(new Double(a1.getNota()));
			}
		});
	}

}
