/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Math;

/**
 *
 * @author htrefftz
 */
public class UVNMatrix extends Matrix4x4 {
    
    boolean DEBUG = false;
    
    public UVNMatrix(Vector4 camPos, Vector4 lookingTo, Vector4 V) {
        super();
        // Find N vector
        Vector4 N = new Vector4(lookingTo.getX(), lookingTo.getY(), lookingTo.getZ(),
            camPos.getX(), camPos.getY(), camPos.getZ());
        N.normalize();
        Vector4 n = N;
        // Compute the U vector
        Vector4 U = Vector4.crossProduct(V, N);
        U.normalize();
        Vector4 u = U;
        // Compute the v vector
        Vector4 v = Vector4.crossProduct(n, u);
        
        // Insert vector u, v and n in the matrix HERE   ***
        
        // Compute u . P0, v . P0, n . P0
        double dx = - Vector4.dotProduct(u, camPos);
        double dy = - Vector4.dotProduct(v, camPos);
        double dz = - Vector4.dotProduct(n, camPos);
        
        // Insert dx, dy and dz in the matrix HERE ***
        
                
        if(DEBUG) {
            System.out.println("u: " + u); //System.out.println(u.magnitude());
            System.out.println("v: " + v); //System.out.println(v.magnitude());
            System.out.println("n: " + n); //System.out.println(n.magnitude());
            //System.out.println(Vector4.crossProduct(u, v));
            //System.out.println(Vector4.crossProduct(v, n));
            //System.out.println(Vector4.crossProduct(n, u));
        }

    }
    
    public static void main(String[] args) {
        Vector4 camPos = new Vector4(10, 10, 10);
        Vector4 lookingTo = new Vector4(0, 0, 0);
        Vector4 V = new Vector4(0, 1, 0);
        UVNMatrix uvn = new UVNMatrix(camPos, lookingTo, V);
        
    }
}
