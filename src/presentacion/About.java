/*
 * Proyecto Final Automatos II
 * Analizador Lexico
 */
package presentacion;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * los chidos
 */
public class About extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();

    /**
     * Se crea un nuevo "Acerca de"
     */
    public About() {
        this.setContentPane(fondo);
        initComponents();
    }

    /**
     * Este método se llama desde el constructor para inicializar el formulario.
     * 
     * 
     */
    @SuppressWarnings("unchecked")
    // Inicia initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 400));
        setMinimumSize(new java.awt.Dimension(700, 400));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(500, 20, 170, 30);

        pack();
        setLocationRelativeTo(null);
    }// Finaliza initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//Inicio de la accion del boton jButton1ActionPerformed
            this.setVisible(false);
            this.dispose();
    }//Finalizacion de la accion del boton jButton1ActionPerformed

    /**
     * Args
     */
    public static void main(String args[]) {
        
        
        
          
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* creacion y vista del formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About().setVisible(true);
            }
        });
    }

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/recursos/about.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
    // Inicio de Variables declaradas
    private javax.swing.JButton jButton1;
    // Termino de Variables declaradas
}
