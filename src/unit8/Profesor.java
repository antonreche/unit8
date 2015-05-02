/**
 * 
 */
package unit8;

/**
 * @author Antonio Reche Ramal
 * @version Mayor 2015
 */
public class Profesor extends Persona{
	
	public Profesor(String nombre, String dni){
		this.nombre=nombre;
		this.dni=dni;
	}
	
	public boolean esProfesor(){
		return true;
	}

}
