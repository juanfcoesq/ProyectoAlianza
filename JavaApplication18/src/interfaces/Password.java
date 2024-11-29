package interfaces;

import clases.IntegerDocumentFilter;
import java.awt.Color;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.text.AbstractDocument;


/**
 *
 * @author monse
 */
public class Password extends javax.swing.JFrame {

    private final Connection con;
    
    public Password(Connection con) {
        this.con = con; // Assign the provided username
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Contraseña");
        this.setResizable(false);
        
        ((AbstractDocument) contra1.getDocument()).setDocumentFilter(new IntegerDocumentFilter());
        ((AbstractDocument) contra2.getDocument()).setDocumentFilter(new IntegerDocumentFilter());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        contra1 = new javax.swing.JPasswordField();
        ojo = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        contra2 = new javax.swing.JPasswordField();
        ojo2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 29, 61));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes (1).png"))); // NOI18N
        jLabel2.setEnabled(false);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 614, 65, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libro-marcador-amarillo.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 60, 70));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/taller (1).png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/resaltador.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar-alt-amarillo.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hogar.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 700));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Quicksand Light", 0, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario (3).png"))); // NOI18N
        jLabel4.setText("Cerrar Sesión");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 170, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salida.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/deshacer.png"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 1200, 50));

        jPanel3.setBackground(new java.awt.Color(204, 220, 232));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(1, 75, 142));
        jLabel14.setFont(new java.awt.Font("Quicksand Bold", 1, 65)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Password");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WhatsApp Image 2024-04-12 at 08.53.37.jpeg"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, -450, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 1200, 160));

        jPanel4.setBackground(new java.awt.Color(0, 53, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(1, 75, 142));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Quicksand Light", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Llena los siguientes campos");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, 40));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 1080, 60));

        jPanel8.setBackground(new java.awt.Color(1, 75, 142));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 560, 90));

        jLabel1.setFont(new java.awt.Font("Quicksand Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo contraseña");
        jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 50));

        contra1.setFont(new java.awt.Font("Quicksand Book", 0, 18)); // NOI18N
        contra1.setToolTipText("contraseña");
        jPanel8.add(contra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 490, 50));

        ojo.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        ojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo-bnco.png"))); // NOI18N
        ojo.setText("Mostrar Contraseña");
        jPanel8.add(ojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 40, -1));

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 900, 90));

        jPanel10.setBackground(new java.awt.Color(1, 75, 142));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 560, 90));

        jLabel3.setFont(new java.awt.Font("Quicksand Bold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Vuelve a ingresarla");
        jPanel10.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 30));

        contra2.setFont(new java.awt.Font("Quicksand Book", 0, 18)); // NOI18N
        contra2.setToolTipText("contraseña");
        jPanel10.add(contra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 490, 50));

        ojo2.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        ojo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo-bnco.png"))); // NOI18N
        ojo2.setText("Mostrar Contraseña");
        ojo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ojo2MouseClicked(evt);
            }
        });
        jPanel10.add(ojo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 40, -1));

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 900, 90));

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Quicksand Bold", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 214, 10));
        jLabel16.setText("Cambiar");
        jPanel12.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 50));

        jPanel4.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 230, 50));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 1200, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.dispose();
        new LogIn(con).setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.dispose();
        new PaginaPrincipal(con).setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        this.dispose();
        new DocentesI(con).setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        this.dispose();
        new MaterialI(con).setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        this.dispose();
        new Consultar(con).setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

    }//GEN-LAST:event_jLabel9MouseClicked

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        String buttonText = ojo.getText();
        String usuario = PaginaPrincipal.usuario;
        
        if (buttonText.equals("Mostrar Contraseña")) {
            contra1.setEchoChar((char) 0); // Mostrar la contraseña
            ojo.setText("Ocultar Contraseña");
            ojo.setIcon(new ImageIcon(getClass().getResource("/imagenes/vision-baja.png")));
        } else {
            contra1.setEchoChar('*'); // Ocultar la contraseña
            ojo.setText("Mostrar Contraseña");
            ojo.setIcon(new ImageIcon(getClass().getResource("/imagenes/ojo.png")));
        }

        String password1 = new String(contra1.getPassword());
        String password2 = new String(contra2.getPassword());

        if (password1.equals(password2)) {
            String query = "UPDATE admin SET password = ? WHERE usuario = ?";
            try {
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, password1); // Encripta la contraseña si es necesario
                pst.setString(2, usuario); // Reemplaza 1 con el ID del usuario correspondiente

                int updated = pst.executeUpdate();
                System.out.println("Filas actualizadas: " + updated); // Verificar cuántas filas se han actualizado realmente
                if (updated > 0) {
                    JOptionPane.showMessageDialog(this, "Contraseña actualizada con éxito");
                } else {
                    JOptionPane.showMessageDialog(this, "Error al actualizar la contraseña: No se realizaron actualizaciones");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al actualizar la contraseña: " + e.getMessage() + "\nQuery: " + query + "\nUsuario: " + usuario);
                e.printStackTrace(); // Mostrar detalles de la excepción en la consola
            }
        } else {
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden");
        }
    }//GEN-LAST:event_jPanel12MouseClicked

    private void ojo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ojo2MouseClicked
         String buttonText = ojo2.getText();
        // Cambiar el carácter de ocultamiento según el texto del botón
        if (buttonText.equals("Mostrar Contraseña")) {
            contra2.setEchoChar((char) 0); // Mostrar la contraseña
            ojo2.setText("Ocultar Contraseña");
            ojo2.setIcon(new ImageIcon(getClass().getResource("/imagenes/vision-baja-bnco.png")));

        } else {
            contra2.setEchoChar('*'); // Ocultar la contraseña
            ojo2.setText("Mostrar Contraseña");
            ojo2.setIcon(new ImageIcon(getClass().getResource("/imagenes/ojo-bnco.png")));
        }
    }//GEN-LAST:event_ojo2MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        this.dispose();
        new Ajustes(con).setVisible(true);
    }//GEN-LAST:event_jLabel23MouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contra1;
    private javax.swing.JPasswordField contra2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel ojo;
    private javax.swing.JLabel ojo2;
    // End of variables declaration//GEN-END:variables
}