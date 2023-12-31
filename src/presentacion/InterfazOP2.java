package presentacion;

import domain.Analizar;
import domain.Reglas;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @los chidos
 */
public class InterfazOP2 extends javax.swing.JFrame {

    /**
     * Se empieza a realizar la InterfazGrafica
     */
    public InterfazOP2() {
        initComponents();
        jScrollPane3.setVisible(false);
    }

    /**
     * Este método se llama desde el constructor para inicializar el formulario.
     * 
     * 
     */
    @SuppressWarnings("unchecked")
    //Se genera los componentes de la interfaz, caracteristicas e instrucciones (metodos)
    private void initComponents() {

        TituloP = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Texto = new javax.swing.JTextArea();
        BAnalizar = new javax.swing.JButton();
        BLimpiar = new javax.swing.JButton();
        Resultado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaResultados = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Respuesta = new javax.swing.JTextArea();
        img = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        repositorio = new javax.swing.JMenuItem();
        about = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(529, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloP.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        TituloP.setText("ANALIZADOR LEXICO");
        getContentPane().add(TituloP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 280, 30));

        jLabel1.setText("Ingrese el texto para analizar:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        Texto.setColumns(20);
        Texto.setRows(5);
        jScrollPane2.setViewportView(Texto);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 470, 150));

        BAnalizar.setText("Analizar");
        BAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAnalizarActionPerformed(evt);
            }
        });
        getContentPane().add(BAnalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 80, -1));

        BLimpiar.setText("Limpiar");
        BLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(BLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 80, -1));

        Resultado.setText("Resultados de la ejecucion:");
        getContentPane().add(Resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        tablaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Palabra", "Resultado"
            }
        ));
        jScrollPane1.setViewportView(tablaResultados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 317, 510, 230));

        Respuesta.setColumns(20);
        Respuesta.setForeground(new java.awt.Color(0, 0, 205));
        Respuesta.setRows(5);
        jScrollPane3.setViewportView(Respuesta);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 470, 220));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/analizador.jpg"))); // NOI18N
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 200, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/java.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 90, 80));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 560));

        jMenu2.setText("Acerca de");

        repositorio.setText("Repositorio");
        repositorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repositorioMouseClicked(evt);
            }
        });
        repositorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repositorioActionPerformed(evt);
            }
        });
        jMenu2.add(repositorio);

        about.setText("Autores");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        jMenu2.add(about);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// finaliza el initComponents

    private void BAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//Inicia Acciones del analizador
        String Ing = Texto.getText();
        if (Reglas.soloEspacio(Ing)) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese texto para analizar", "Aviso", HEIGHT);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) tablaResultados.getModel();
            modelo.setRowCount(0);
            Analizar.separar(Ing, modelo);
        }
    }//Finaliza Acciones realizados por el analizador

    private void BLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//Inicia la accion del limpiador
        Texto.setText("");
        Respuesta.setText("");
        DefaultTableModel modelo = (DefaultTableModel) tablaResultados.getModel();
        modelo.setRowCount(0);
    }//Termina Accion del limpiador

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//Inicia accion de nosotros
        About nF = new About();
        nF.setVisible(true);
    }//Termina accion de nosotros

    private void repositorioActionPerformed(java.awt.event.ActionEvent evt) {//Inicia accion de repositorio
        if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    java.net.URI uri = new java.net.URI("https://github.com/MonicaGarcia1789/ProyectoLexico.git");
                    desktop.browse(uri);
                } catch (URISyntaxException ex) {
                    Logger.getLogger(InterfazOP2.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(InterfazOP2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//Termina accion del repositorio

    private void repositorioMouseClicked(java.awt.event.MouseEvent evt) {//Inicia Accion del click del repositorio

    }//Termina accion del click del repositorio

    /**
     * @El comando args la linea de argumentos
     */
    public static void main(String args[]) {
        /* Para establecer la apariencia de Nimbus */
        //
        /* Se requiere tener Java SE 6 como minimo
         *  
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazOP2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazOP2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazOP2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazOP2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        

        /* Creacion y visualizacion del formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazOP2().setVisible(true);
            }
        });
    }

    // Declaracion de las variables
    private javax.swing.JButton BAnalizar;
    private javax.swing.JButton BLimpiar;
    private javax.swing.JTextArea Respuesta;
    private javax.swing.JLabel Resultado;
    private javax.swing.JTextArea Texto;
    private javax.swing.JLabel TituloP;
    private javax.swing.JMenuItem about;
    private javax.swing.JMenuItem repositorio;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaResultados;
    // Fin de la declaracion de las variables
}
