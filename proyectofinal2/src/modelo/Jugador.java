package modelo;

public class Jugador implements Comparable<Jugador>{
	
	 //Atributos
     private int score;
	   private String nombre;
	     private Jugador hijoIzquierdo;
	       private Jugador hijoDerecho;
		
	/**
	* Método constructor de la clase Juego.
    * @param nombre
	*/
	public Jugador(String nombre) {
		hijoIzquierdo = null;
		hijoDerecho = null;
		this.nombre = nombre;
	}
	
	
	
	//*******************
	//GETS AND SETTERS
	//*******************
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Jugador getHijoIzquierdo() {
		return hijoIzquierdo;
	}


	public void setHijoIzquierdo(Jugador hijoIzquierdo) {
		this.hijoIzquierdo = hijoIzquierdo;
	}


	public Jugador getHijoDerecho() {
		return hijoDerecho;
	}


	public void setHijoDerecho(Jugador hijoDerecho) {
		this.hijoDerecho = hijoDerecho;
	}



	@Override
	public int compareTo(Jugador comparar) {
        int retorno = 0;		
		
		if(this.getNombre().compareTo(comparar.getNombre()) > 0) {
			retorno = 1;
		}else if(this.getNombre().compareTo(comparar.getNombre()) < 0) {
			retorno = -1;
		}
		
		return retorno;
	}
	
	
	  public String toString() {
		  
		  return "El nombre del Jugador es: "+nombre;
	  }
	
	
}
