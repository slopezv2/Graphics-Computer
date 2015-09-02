/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retolineasconextra;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sebastian
 */
public class RetoLineasConExtra extends JPanel{
// por defecto, el radio es de 100 pixeles
    private static final int RADIO = 100;
    //cuantos nodos posee la figura
    private static int nodos = 0;
    // posicion en x de los nodos
    private static int puntosx[];
    //posicion en y de los nodos
    private static int puntosy[];
    /**
     * Metodo para  dibujar los nodos en una circunferencia de 100 pixeles de 
     * radioy almacenar sus posiciones
     * @param panel Graphics2D del panel donde se va a dibujar
     * @param nodos int con la cantidad de nodos a dibujar
     * @param width 
     * @param height 
     */
    public static void dibujarNodos(Graphics2D  panel, int nodos, int width, int height) {
        int posx = width/2, posy = height/2;
        // Tomamos el angulo que hay entre cada nodo en radianes
        double anguloRadParte = 2 * Math.PI / nodos, angulo=0;
        // pintaremos en azul
        panel.setColor(Color.blue);
        // Iterar y dibujar cada nodo
        for(int i = 0; i < nodos;i++){
            // el angulo lo hacemos iniciar en 90 grados para pintar primero en (0,100)
            angulo = (anguloRadParte * i) + (Math.PI/2) ;
            // a + rcosD = x
            posx = (int)((width/2) + RADIO * Math.cos(angulo));
            // b + rsenD = y
            posy = (int)((height/2) + RADIO * Math.sin(angulo));
            //Guardar posicion de nodo
            puntosx[i] = posx;
            puntosy[i] = posy;
            // dibujar el punto
            dibujarLinea(posx, posy, posx, posy,panel);
        }
    }
  @Override
  public void paintComponent(Graphics g) {
      super.paintComponent(g);
      // los graficos 2d para dibujar
      Graphics2D g2d = (Graphics2D) g;
      // size es el tamaño de la ventana.
      Dimension size = getSize();
      // Insets son los bordes y los títulos de la ventana.
      Insets insets = getInsets();
      int w =  size.width - insets.left - insets.right;
      int h =  size.height - insets.top - insets.bottom;
      // dibujamos los nodos en una circunferencia
      dibujarNodos(g2d,nodos, w, h);
      //dibujamos los enlaces
      dibujarEnlaces(g2d);
  }
  public static void main(String[] args) {
      // Crear un nuevo Frame
      JFrame frame = new JFrame("Lines");
      // Al cerrar el frame, termina la ejecución de este programa
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // Almacenar entrada
      String entrada = "s";
      // Recibimos la entrada del usuario, si no es un número lo dejaremos alli
      while(!esNumero(entrada)){
          entrada = JOptionPane.showInputDialog("Ingrese el número de nodos");
      }
       nodos = Integer.parseInt(entrada);
       puntosx = new int[nodos];
       puntosy = new int[nodos];
      // Agregar un JPanel que se llama Points (esta clase)
      frame.add(new RetoLineasConExtra());
      // Asignarle tamaño
      frame.setSize(400, 400);
      // Poner el frame en el centro de la pantalla
      frame.setLocationRelativeTo(null);   
      // Mostrar el frame
      frame.setVisible(true);
  }
  /**
   * Este metodo no nos pertenece, no somos sus autores
   * Implementación del algoritmo de Bresenham
   * @param x posicion inicial en x
   * @param y posicion inicial en y
   * @param x2 posicion final en x
   * @param y2 posicion final en y
   * @param d  graficos donde va a dibujar
   */
  public static void dibujarLinea(int x,int y,int x2, int y2, Graphics2D d) {
    int w = x2 - x ;
    int h = y2 - y ;
    int dx1 = 0, dy1 = 0, dx2 = 0, dy2 = 0 ;
    if (w<0) dx1 = -1 ; else if (w>0) dx1 = 1 ;
    if (h<0) dy1 = -1 ; else if (h>0) dy1 = 1 ;
    if (w<0) dx2 = -1 ; else if (w>0) dx2 = 1 ;
    int longest = Math.abs(w) ;
    int shortest = Math.abs(h) ;
    if (!(longest>shortest)) {
        longest = Math.abs(h) ;
        shortest = Math.abs(w) ;
        if (h<0) dy2 = -1 ; else if (h>0) dy2 = 1 ;
        dx2 = 0 ;            
    }
    int numerator = longest >> 1 ;
    for (int i=0;i<=longest;i++) {
        d.drawLine(x,y,x,y) ;
        numerator += shortest ;
        if (!(numerator<longest)) {
            numerator -= longest ;
            x += dx1 ;
            y += dy1 ;
        } else {
            x += dx2 ;
            y += dy2 ;
        }
    }
}
  /**
   * Determinar si la entrada es valida
   * @param numero String a convertir a entero
   * @return verdadero si es numero, falso en caso contrario
   */
    private static boolean esNumero(String numero){
      try{
          Integer.parseInt(numero);
      }catch(NumberFormatException ex){
          return false;
      }
      return true;
  }
    public void dibujarEnlaces(Graphics2D g2d) {
       for(int i = 0; i < nodos;i++){
           for(int j = i + 1; j < nodos;j++){
               dibujarLinea(puntosx[i],puntosy[i],puntosx[j],puntosy[j],g2d);            
           }
       }
    }
}
