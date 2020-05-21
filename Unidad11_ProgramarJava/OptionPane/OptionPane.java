package OptionPane;

import javax.swing.JOptionPane; // Es utilizada la clase JOptionPane
public class OptionPane {

    public static void main(String[] args) {

// introducción de datos
String numeroUno = JOptionPane.showInputDialog( "Pon el primer numero a sumar" );
String numeroDos = JOptionPane.showInputDialog( "Pon el segundo numero a sumar" );

// convertir String a Enteros para poder sumar
int n1 = Integer.parseInt( numeroUno );
int n2 = Integer.parseInt( numeroDos );

int suma = n1 + n2; // sumar variables

// Restulado de la sumatoria pero con texto
JOptionPane.showMessageDialog( null, "La suma es " + suma, "Sumatoria", JOptionPane.PLAIN_MESSAGE );
} //fin de main
} //fin de clase