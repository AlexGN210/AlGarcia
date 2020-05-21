package TextoImagenes;

import java.awt.FlowLayout; // especifica cómo se van a ordenar los componentes
import javax.swing.JFrame; // proporciona las características básicas de una ventana
import javax.swing.JLabel; // muestra texto e imágenes
import javax.swing.SwingConstants; // constantes comunes utilizadas con Swing
import javax.swing.Icon; // interfaz utilizada para manipular imágenes
import javax.swing.ImageIcon; // carga las imágenes

public class LabelFrame extends JFrame
{
    /**
    	 *
    	 */
private static final long serialVersionUID = 1L;

private JLabel etiqueta1; // JLabel sólo con texto
private JLabel etiqueta2; // JLabel construida con texto y un icono
private JLabel etiqueta3; // JLabel con texto adicional e icono

// El constructor de LabelFrame agrega objetos JLabel a JFrame
 public LabelFrame(){
super( "Prueba de JLabel" );
setLayout( new FlowLayout() ); // establece el esquema del marco

 // Constructor de JLabel con un argumento String
 etiqueta1 = new JLabel( "Hola :3" );
 etiqueta1.setToolTipText( "Pongame 10 profe, muy buen tip" );
 add( etiqueta1 ); // agrega etiqueta1 a JFrame

 // Constructor de JLabel con argumentos de cadena, Icono y alineación
Icon insecto = new ImageIcon( getClass().getResource( "giphy.gif" ) );
etiqueta2 = new JLabel( "Monita Japonesa Bailando", insecto, SwingConstants.LEFT );
etiqueta2.setToolTipText( "denuevo pongame 10" );
add( etiqueta2 ); // agrega etiqueta2 a JFrame

Icon insecto2 = new ImageIcon( getClass().getResource( "cutecat.gif" ) );
etiqueta3 = new JLabel(); // Constructor de JLabel sin argumentos
etiqueta3.setText( "un gato en la parte inferior" );
etiqueta3.setIcon( insecto2 ); // agrega icono a JLabel
etiqueta3.setHorizontalTextPosition( SwingConstants.CENTER );
etiqueta3.setVerticalTextPosition( SwingConstants.BOTTOM );
etiqueta3.setToolTipText( "Etiqueta numero 3, con gatito" );
add( etiqueta3 ); // agrega etiqueta3 a JFrame
} // fin del constructor de LabelFrame
} // fin de la clase LabelFrame