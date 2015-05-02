/**
 * 
 */
package unit8;

/**
 * @author Antonio Reche Ramal
 * @version Mayor 2015
 */
public class Alumno extends Persona{
	
	public Alumno(String nombre, String dni){
		this.nombre=nombre;
		this.dni=dni;
	}
	
	public boolean esProfesor(){
		return false;
	}
}
