/*
 * Juan Manuel Mejia Botero y Sebastian Lopez Valencia
 */
package retolineasconextra;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @authors Sebastian Lopez and Juan Manuel Mejia
 */
public class Interfaz extends javax.swing.JFrame {
    // por defecto, el radio es de 100 pixeles    
    //cuantos nodos posee la figura
    private static int nodos = 0;
    // posicion en x de los nodos
    private static int puntosx[];
    //posicion en y de los nodos
    private static int puntosy[];
    private Random rd;
    /**
     * Creates new form Interfaz
     * Constructor
     */
    public Interfaz() {
        setTitle("Simulador de figuritas");
        // generador aleatorio para los botones de aleatorio
        rd = new Random(System.currentTimeMillis());
        initComponents();
        setResizable(false);
        this.setLocationRelativeTo(null);            
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setText("Dibujar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setLabelFor(jFormattedTextField1);
        jLabel1.setText("Cantidad de nodos");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Azul", "Amarillo", "Rojo", "Verde", "Morado", "Azul Claro", "Gris Oscuro", "Naranja", "Rosado", "Amarillo", "Negro" }));
        jComboBox1.setToolTipText("Seleccione un color");

        jLabel2.setText("Color");

        jButton2.setText("Aleatorio");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jSlider1.setMaximum(200);
        jSlider1.setMinimum(50);
        jSlider1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jLabel3.setText("Radio");

        jFormattedTextField1.setColumns(10);
        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));

        jButton3.setText("Super Aleatorio");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(110, 110, 110))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(24, 24, 24))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Metodo del botón de dibujar
 * @param evt evento
 */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Entrada de dato numerico
        String entradaNodos = jFormattedTextField1.getText();
        // verificar que sea un numero
        if(esNumero(entradaNodos)){
            int nroNodos = Integer.parseInt(entradaNodos);
            // Inicializar los arreglos empleados para almacenar las coordenadas
            puntosx = new int[nroNodos];
            puntosy = new int[nroNodos];
            // Radio a dibujar
            int radio = jSlider1.getValue();
            // Tomar el color elegido
            Color eleccion = escogerColor(jComboBox1.getSelectedIndex());
            Graphics2D gr = (Graphics2D) jPanel3.getGraphics();
            gr.setColor(Color.WHITE);
            // Limpiar el panel
            gr.clearRect(0, 0, jPanel3.getWidth(), jPanel3.getHeight());
            dibujarNodos(gr,nroNodos,jPanel3.getWidth(),jPanel3.getHeight(),radio,eleccion);
            dibujarEnlaces(gr,eleccion,nroNodos,0);
        }else{
            // En caso de mala entrada para Numero de nodos
            JOptionPane.showMessageDialog(rootPane, "Numero de nodos debe ser un dato numerico");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
/**
 * Metodo para mostrar el dato del slider
 * @param evt 
 */
    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        jLabel4.setText(""+jSlider1.getValue());
    }//GEN-LAST:event_jSlider1StateChanged
/**
 * Cuando se trata de un aleatorio simple con un solo color
 * @param evt 
 */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        randomFunction(0);
    }//GEN-LAST:event_jButton2ActionPerformed
/**
 * Metodo que llama al aleatorio con muchos colores
 * @param evt 
 */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        randomFunction(1);
    }//GEN-LAST:event_jButton3ActionPerformed
/**
 * Metodo para pintar aleatoriamente una figura
 * @param type si es o no pintar aleatorio 
 */
    private void randomFunction(int type){
        int nroNodos = rd.nextInt(41);
        int nvalor = rd.nextInt(5);
        Color color = escogerColor(nvalor);
        int radio = rd.nextInt(201);
        puntosx = new int[nroNodos];
        puntosy = new int[nroNodos];
        Graphics2D gr = (Graphics2D) jPanel3.getGraphics();
        gr.clearRect(0, 0, jPanel3.getWidth(), jPanel3.getHeight());
        dibujarNodos(gr,nroNodos,jPanel3.getWidth(),jPanel3.getHeight(),radio,color);
        dibujarEnlaces(gr,color,nroNodos,type);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    /**
     * 
     * @param panel Graphics2D para dibujar en el panel
     * @param nodos int cantidad de nodos
     * @param width
     * @param height
     * @param radio
     * @param color Color color de los nodos
     */
    public static void dibujarNodos(Graphics2D  panel, int nodos, int width, int height, int radio,Color color) {
        int posx = width/2, posy = height/2;
        // Tomamos el angulo que hay entre cada nodo en radianes
        double anguloRadParte = 2 * Math.PI / nodos, angulo=0;
        // pintaremos en azul
        panel.setColor(color);
        // Iterar y dibujar cada nodo
        for(int i = 0; i < nodos;i++){
            // el angulo lo hacemos iniciar en 90 grados para pintar primero en (0,100)
            angulo = (anguloRadParte * i) + (Math.PI/2) ;
            // a + rcosD = x
            posx = (int)((width/2) + radio * Math.cos(angulo));
            // b + rsenD = y
            posy = (int)((height/2) + radio * Math.sin(angulo));
            //Guardar posicion de nodo
            puntosx[i] = posx;
            puntosy[i] = posy;
            // dibujar el punto
            dibujarLinea(posx, posy, posx, posy,panel);
            
        }
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
    /**
     * 
     * @param colorElegido int que representa el color elegido
     * @return 
     */
    private Color escogerColor(int colorElegido){
        switch(colorElegido){
            case 0:
                return Color.BLUE;                
            case 1:
                return Color.YELLOW;
            case 2:
                return Color.RED;
            case 3:
                return Color.GREEN;
            case 4:
                return Color.MAGENTA;
            case 5:
                return Color.CYAN;
            case 6:
                return Color.DARK_GRAY;
            case 7:
                return Color.ORANGE;
            case 8:
                return Color.PINK;
            case 9:
                return Color.YELLOW;
        }
        
        return Color.BLACK;
    }
    /**
     * 
     * @param g2d Graphics2D lienzo para dibujar
     * @param color Color elejigo para el enlace si no es aleatorio loco
     * @param nro int que representa la cantidad de nodos
     * @param isRandom int que indica si es un random, 0 = no, el resto es si
     */
    public void dibujarEnlaces(Graphics2D g2d, Color color, int nro, int isRandom) {
       g2d.setColor(color);
       Random oli = new Random(System.currentTimeMillis());
       for(int i = 0; i < nro;i++){
           for(int j = i + 1; j < nro;j++){
               if(isRandom!=0){
                   g2d.setColor(escogerColor(oli.nextInt(10)));
               }
               dibujarLinea(puntosx[i],puntosy[i],puntosx[j],puntosy[j],g2d);            
           }
       }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
