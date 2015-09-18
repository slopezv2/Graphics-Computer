/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author Sebastian-PC
 */
public abstract class Ghost extends Figure {
    protected int size; // Original size: 1
    protected double rotationAngle;

    public Ghost() {
        super();
    }
    
    public abstract void fall();
}
