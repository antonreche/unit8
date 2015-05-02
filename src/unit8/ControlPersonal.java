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
public class ControlPersonal {
	
	static ArrayList<Persona> personas=new ArrayList<Persona>();
	
	/**
	 * Constructor por defecto
	 */
	private ControlPersonal(){
		
	}
	
	/**
	 * Método estático para añadir objetos tipo Persona al arraylist
	 * @param p -->objeto tipo Persona 
	 */
	public static void anyadirPersona(Persona p){
		personas.add(p);
	}
	
	public void ordenarPorDni(){
		Collections.sort(personas, new Comparator<Persona>(){
			@Override
			public int compare(Persona p1, Persona p2){
				return new String(p2.getDni()).compareTo(new String(p1.getDni()));
			}
		});
	}
	
	public void ordenarPorOrdenAlfabetico(){
		Collections.sort(personas, new Comparator<Persona>(){
			@Override
			public int compare(Persona p1, Persona p2){
				return new String(p1.getNombre()).compareTo(new String(p2.getNombre()));
			}
		});
	}
	
	public void mostrarListado(){
		Iterator<Persona> iterador;
		
		System.out.println("Listado de alumnos ordenado por nombre: ");
		System.out.println();
		ordenarPorOrdenAlfabetico();
		iterador=personas.iterator();
		while(iterador.hasNext()){
			Persona p=iterador.next();
			if(!p.esProfesor()){
				System.out.println("Nombre: "+p.getNombre());
				System.out.println("DNI: "+p.getDni());
				p.ordenarPorAsignaturas();
				p.mostrarListadoAsignaturasNota();
			}
		}				
		
		System.out.println();
		System.out.println("Listado de profesores por DNI:");
		System.out.println();
		ordenarPorDni();
		iterador=personas.iterator();
		while(iterador.hasNext()){
			Persona p=iterador.next();
			if(p.esProfesor()){
				System.out.println("Nombre: "+p.getNombre());
				System.out.println("DNI: "+p.getDni());
				p.ordenarPorAsignaturas();
				p.mostrarListadoAsignaturasNota();
			}
		}		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ControlPersonal control=new ControlPersonal();
		Asignatura programacion=new Asignatura("Progamación");
		Asignatura entornos=new Asignatura("Entornos de programación");
		Asignatura basesDatos=new Asignatura("Bases de datos");
		
		Profesor profesor1=new Profesor("Profesor1", "1111AAA");
		Profesor profesor2=new Profesor("Profesor2", "2222BBB");
		Profesor profesor3=new Profesor("Profesor3", "3333CCC");
		
		Alumno alumno1=new Alumno("Alumno 1", "123A");
		Alumno alumno2=new Alumno("Alumno 2", "234B");
		Alumno alumno3=new Alumno("Alumno 3", "456C");
		
		profesor1.anyadirAsignatura(programacion);
		profesor2.anyadirAsignatura(sistemas);
		profesor3.anyadirAsignatura(entornos);
		
		alumno1.anyadirAsignatura(programacion);
		alumno2.anyadirAsignatura(sistemas);
		alumno3.anyadirAsignatura(entornos);
		
		//ponemos nota a las asignaturas de los profesores
		ArrayList<Asignatura> asignaturas;
		asignaturas=profesor1.getAsignaturas();
		Iterator<Asignatura> iterador=asignaturas.iterator();
		
		int n=5;
		while(iterador.hasNext()){
			Asignatura a=(Asignatura)iterador.next();
			a.setNota(n++);			
		}
		
		asignaturas=profesor2.getAsignaturas();
		iterador=asignaturas.iterator();
		
		while(iterador.hasNext()){
			Asignatura a=(Asignatura)iterador.next();
			a.setNota(n++);			
		}
		
		asignaturas=profesor3.getAsignaturas();
		iterador=asignaturas.iterator();
		
		while(iterador.hasNext()){
			Asignatura a=(Asignatura)iterador.next();
			a.setNota(n++);			
		}
		
		//ponemos nota a los alumnos
		n=3;
		asignaturas=alumno1.getAsignaturas();
		iterador=asignaturas.iterator();
		
		while(iterador.hasNext()){
			Asignatura a=(Asignatura)iterador.next();
			a.setNota(n++);			
		}
		
		asignaturas=alumno2.getAsignaturas();
		iterador=asignaturas.iterator();
		
		while(iterador.hasNext()){
			Asignatura a=(Asignatura)iterador.next();
			a.setNota(n++);			
		}
		
		asignaturas=alumno3.getAsignaturas();
		iterador=asignaturas.iterator();
		
		while(iterador.hasNext()){
			Asignatura a=(Asignatura)iterador.next();
			a.setNota(n++);			
		}
		
		//añadimos a las personas al arraylist
		
		anyadirPersona(profesor1);
		anyadirPersona(profesor2);
		anyadirPersona(profesor3);
		anyadirPersona(alumno1);
		anyadirPersona(alumno2);
		anyadirPersona(alumno3);
		
		control.ordenarPorOrdenAlfabetico();
		control.mostrarListado();
		
	}

}
