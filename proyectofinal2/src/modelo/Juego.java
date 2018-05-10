package modelo;

import java.io.IOException;
import java.io.*;

public class Juego {
	
	//Constantes
	public static final String NOMBRE_ARCHIVO = "data/Jugadores.txt";
	
    //Relaciones
	private Jugador raiz;
	
	/**
	 * Método constructor de la 
	 * clase Juego.
	 */
	public Juego() {
		raiz = null;
		instanciarJugadores();
		
	}
	
	  /**
	   * Método que se encarga de agregar
	   * un jugador al árbol.
	   */
	  public void agregarJugadorArbol(Jugador jgr) {
		  
		  boolean esVerdad = true;
		  
		  if(raiz == null) {
			  raiz = jgr;
		  }else {
			  
			 Jugador aux = raiz;
			 Jugador padre;
			 
			 while(esVerdad) {
				 
				 padre = aux;
				 if(jgr.compareTo(aux) < 0) {
					 aux = aux.getHijoIzquierdo();
				      if(aux == null) {
				    	  padre.setHijoIzquierdo(jgr);
				    	    esVerdad = false;
				      }
					 
				 }else {
					 aux = aux.getHijoDerecho();
					 if(aux == null) {
						 padre.setHijoDerecho(jgr);
						 esVerdad = false;
					 }
				 }
				 
			 }
			 
		  }
		  
	   }
	  
	     /**
	      * Método que se encarga de leer
	      * el archivo .txt que contiene 
	      * los jugadores al iniciar el programa.
	      */
	      public void instanciarJugadores(){
	    	  File archivo = new File(NOMBRE_ARCHIVO);
	    	  
	    	  try {
	    	  FileReader lectura = new FileReader(archivo);
	    	  BufferedReader importar = new BufferedReader(lectura);
	    	  
	    	  String cadena = " ";
	    	  String[] info = null;
	    	  
	    	  while(cadena != null) {
	    		  cadena = importar.readLine();
	    		  info = cadena.split(",");
	    		  
	    		  int i = 0;
	    		    while(i < info.length) {
	    		    	 String nombre = info[i]; 
	    		    	   Jugador nuevo = new Jugador(nombre);
	    		    	     agregarJugadorArbol(nuevo);
	    		    	       i++;
	    		    }
	    	  }
	    	  
	    	  importar.close();
	    	  
	    	  }catch(Exception e) {
	    		 
	    	  }
	    	  
	      }

		   
	 //******************
	 // GETS AND SETTERS
	 //******************
	  
	      public Jugador getRaiz() {
				return raiz;
			}

			public void setRaiz(Jugador raiz) {
				this.raiz = raiz;
			}
		      
		      
	      

	
	
	
	
	
	
	

	
	
	

}
