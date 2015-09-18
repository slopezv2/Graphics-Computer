/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author sebastian
 */
public class Juego extends JPanel implements KeyListener{

   

    Dimension size;
    Graphics2D g2d;


    /*
     * En esta función se dibuja.
     * La función es llamada por Java2D.
     * Se recibe una variable Graphics, que contiene la información del contexto
     * gráfico.
     * Es necesario hacerle un cast a Graphics2D para trabajar en Java2D.
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g2d = (Graphics2D) g;
        //Size es el tamaño de la ventana
        size = getSize();
  
    }  
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("por fin");
    }

    @Override
    public void keyReleased(KeyEvent e) {      
    }
    
    public static void message(){
        Image img = new ImageIcon("res/img/porfavor.png").getImage();
        final JOptionPane optionPane = new JOptionPane( "Recoge: a",JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{});
        final JDialog dialog = new JDialog();
        dialog.setTitle("Recoger");
        dialog.setModal(true);
        dialog.setContentPane(optionPane);
        dialog.setIconImage(img);
        dialog.setLocationRelativeTo(null);
        dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        dialog.pack();

//create timer to dispose of dialog after 5 seconds
        Timer timer = new Timer(5000, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dialog.dispose();
            }
        });
timer.setRepeats(false);//the timer should only go off once

//start timer to close JDialog as dialog modal we must start the timer before its visible
timer.start();

dialog.setVisible(true);

    }
   
    public static void main(String[] args) {
        Juego dc = new Juego();
        JFrame frame = new JFrame("Juego");
        //Al cerrar el frame, termina la ejecución de este programa
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Agregar el listener de las teclas
        dc.addKeyListener(dc);
        dc.setFocusable(true);
        frame.add(dc);
        //Asignarle tamaño
        frame.setSize(600, 400);
        //Poner el frame en el centro de la pantalla
        frame.setLocationRelativeTo(null);
        //Mostrar el frame
        frame.setVisible(true);
        JOptionPane.showMessageDialog(frame, "Usa las teclas para jugar", "Información" , JOptionPane.INFORMATION_MESSAGE, null);
        message();
        play(dc);
    }
    
    public static void play(Juego j){
        int x = j.getWidth()/2;
        int y = 0;
        Graphics2D g = (Graphics2D)j.getGraphics();
        Ghost hellboy = new HellBoy();
        for(int i = 0; i < 10 ;++i){
            
            hellboy.setCoordXcentral(x);
            hellboy.setCoordYCentral(y);
            while(hellboy.getCoordYCentral() < 100){
                System.out.println("ENtrando al while");
                g.clearRect(0, 0, x*2, j.getHeight());
                hellboy.fall();
                try{
                   hellboy.drawObject(g);
                }catch(Exception e){
                    
                }
                /*try{
                    Thread.sleep(1000);
                }catch(Exception e){
                    
                }*/
            }
        }
    }
}
