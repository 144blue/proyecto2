package modelo;

public class Jugador {
	
	 //Atributos
     private int score;
	   private String nombre;
		
	/**
	* Método constructor de la clase Juego.
    * @param nombre
	*/
	public Jugador(String nombre) {
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
	
	
}
