package JButton;
import javax.swing.JFrame;
public class PruebaBoton{   

    public static void main( String args[] ) {
MarcoBoton marcoBoton = new MarcoBoton(); // crea MarcoBoton
marcoBoton.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
marcoBoton.setSize( 600, 600 ); // establece el tamaño del marco
marcoBoton.setVisible( true ); // muestra el marco
} }