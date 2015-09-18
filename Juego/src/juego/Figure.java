
package juego;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Toolkit;
/**
 *
 * @author Sebastian-PC
 */
public abstract class  Figure {
    protected int coordXcentral;
    protected int coordYCentral;
    protected String imgAddress;
    
    public Figure(){
        
    }

    public void drawObject(Graphics2D g) throws IOException{
        Toolkit t = Toolkit.getDefaultToolkit();
        
        Image originalImage = t.getImage(imgAddress);
        g.drawImage(originalImage,this.coordXcentral,this.coordYCentral, null);
    }
    public int getCoordXcentral() {
        return coordXcentral;
    }

    public void setCoordXcentral(int coordXcentral) {
        this.coordXcentral = coordXcentral;
    }

    public int getCoordYCentral() {
        return coordYCentral;
    }

    public void setCoordYCentral(int coordYCentral) {
        this.coordYCentral = coordYCentral;
    }

    public String getImgAddress() {
        return imgAddress;
    }
}
