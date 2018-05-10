package interfaz;
import javax.swing.*;
import java.awt.*;
import modelo.*;

public class VentanaPrincipal extends JFrame{
    
	//Relaciones
	private Juego juegoModelo;
	
	
	/**
	 * Método constructor de la clase.
	 */
	public VentanaPrincipal() {
		juegoModelo = new Juego();
		inicializarVentana();
		
		System.out.println(juegoModelo.getRaiz().getHijoIzquierdo());
	}
      /**
       * Método que se encarga de inicializar 
       * la ventana con sus debido atributos.
       */
	  public void inicializarVentana() {
		  
		Toolkit p = Toolkit.getDefaultToolkit();
		 setSize(1130, 600); 
		   Dimension tamanhoVentana = p.getScreenSize();
		     int ancho = tamanhoVentana.width;
		       int alto = tamanhoVentana.height;
		         setLocation(ancho/10, alto/8);
	  }
	  
	   
	  
	  
	  
	  
	/**
	 * Método main.
	 * @param args
	 */
	public static void main(String[] args) {
		VentanaPrincipal ventana = new VentanaPrincipal();
		ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
	}

}
