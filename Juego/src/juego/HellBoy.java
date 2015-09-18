/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author sebastian
 */
public class HellBoy extends Ghost{

    public HellBoy() {
        super();
        this.imgAddress="C:\\Users\\sebastian\\Documents\\NetBeansProjects\\Juego\\src\\res\\img\\porfavor.png";
    }
    
    
   
    @Override
    public void fall(){
        this.coordYCentral+=100;
        
    }
    
}
