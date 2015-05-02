/**
 * 
 */
package unit8;

/**
 * @author Antonio Reche Ramal
 * @version Mayo 2015
 */
public class Asignatura {

	private String nombre;
	private double nota;
	
	/**
	 * Constructor parametrizado que dá nombre a la asignatura
	 * @param nombre --> nombre de la asignatura
	 */
	public Asignatura(String nombre){
		this.nombre=nombre;
	}
	
	/**
	 * Métod set para nombre
	 * @param nombre --> nombre de la asignatura
	 */
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	/**
	 * Método set para la nota
	 * @param nota --> valor en formato double de la nota
	 */
	public void setNota(double nota){
		this.nota=nota;
	}
	
	/**
	 * Método get para nombre
	 * @return nombre de la asignatura
	 */
	public String getNombre(){
		return nombre;
	}
	
	/**
	 * Método get para nota
	 * @return nota de la asignatura en formato double
	 */
	public double getNota(){
		return nota;
	}
}
