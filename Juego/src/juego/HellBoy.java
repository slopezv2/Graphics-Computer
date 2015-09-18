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
    }
    
    
   
    @Override
    public void fall(){
        this.coordYCentral+=100;
        
    }
    
}
