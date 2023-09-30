
package pantallas;

import entidades.Curso;
import entidades.Profesor;
import java.util.List;
import javax.swing.JOptionPane;


public class PantallaEditarCurso extends javax.swing.JFrame {

    private List<Curso> cursos;
    
    
    /**
     * Creates new form PantallaEditarProfesor
     */
    public PantallaEditarCurso(List<Curso> cursos) {
        initComponents();
        this.cursos= cursos;
        this.setLocationRelativeTo(null);

    }

    public void guardar(Profesor profesor ){
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_creditos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JLabel();
        btn_Cancelar = new javax.swing.JLabel();

        jLabel4.setText("nombre");

        jTextField3.setText("jTextField1");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel5.setText("Creditos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("[Nombre del Curso]");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        txt_codigo.setBackground(new java.awt.Color(255, 255, 255));
        txt_codigo.setForeground(new java.awt.Color(0, 0, 0));
        txt_codigo.setBorder(null);
        getContentPane().add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 249, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txtCursos.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, 46));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txtCursos.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, 46));

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombre.setBorder(null);
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 249, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txtCursos.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, 46));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txtCursos.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, 46));

        txt_creditos.setBackground(new java.awt.Color(255, 255, 255));
        txt_creditos.setForeground(new java.awt.Color(0, 0, 0));
        txt_creditos.setBorder(null);
        getContentPane().add(txt_creditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 249, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txtCursos.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, 46));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txtCursos.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, 46));

        btn_guardar.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Agregar.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardarMouseClicked(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        btn_Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Cancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Eliminar.png"))); // NOI18N
        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CancelarMouseClicked(evt);
            }
        });
        getContentPane().add(btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void btn_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseClicked
        // TODO add your handling code here:
       String codigo = txt_codigo.getText();
    String creditos = txt_creditos.getText();
    String nombre = txt_nombre.getText();
    if (!codigo.isEmpty() && !creditos.isEmpty() && !nombre.isEmpty()) {
        Curso cursoAgregar = new Curso(codigo, Integer.valueOf(creditos), nombre);
        cursos.add(cursoAgregar);
        JOptionPane.showMessageDialog(null, "Curso Agregado",
                "Agregar", JOptionPane.INFORMATION_MESSAGE);
        
        // Después de agregar el curso, cerramos la ventana actual y regresamos a PantallaGestorCursos
        this.dispose();
        PantallaGestorCursos pantaGesto = new PantallaGestorCursos(cursos);
        pantaGesto.setVisible(true);
    } else {
        JOptionPane.showMessageDialog(null, "Completa todos los campos",
                "Error", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_btn_guardarMouseClicked

    private void btn_CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelarMouseClicked
        // TODO add your handling code here:
        this.dispose();
        PantallaGestorCursos pantaGesto =new PantallaGestorCursos(cursos);
        pantaGesto.setVisible(true);
    }//GEN-LAST:event_btn_CancelarMouseClicked

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Cancelar;
    private javax.swing.JLabel btn_guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_creditos;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
