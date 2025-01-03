/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menu;

import javax.swing.JOptionPane;
import personal.Alumno;
import personal.Profesor;
import personal.Roles;
import school.university;

/**
 *
 * @author ldrnt
 */
public class crearAlumno extends javax.swing.JFrame {
    private university uni;
    private Profesor profesorVacio;
    /**
     * Creates new form crearAlumno
     */
    public crearAlumno(university uni) {
        initComponents();
        this.uni = uni;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreAlumno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        apellidoAlumno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailAlumno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordAlumno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        matriculaAlumno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        perteneceAlumno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        registrarMatAlumno = new javax.swing.JTextField();
        crearAlumnoButton = new javax.swing.JButton();
        backCrearalumAdminMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel1.setText("Crear Alumno");

        jLabel2.setText("Nombre del alumno:");

        jLabel3.setText("Apellido del alumno:");

        jLabel4.setText("Email del alumno:");

        jLabel5.setText("Password del alumno:");

        jLabel6.setText("Matricula del alumno:");

        jLabel7.setText("Grupo al que pertenece:");

        jLabel8.setText("Materia a la que se registra: ");

        crearAlumnoButton.setText("Crear Alumno");
        crearAlumnoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearAlumnoButtonActionPerformed(evt);
            }
        });

        backCrearalumAdminMenu.setText("Regresar");
        backCrearalumAdminMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backCrearalumAdminMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreAlumno)
                            .addComponent(apellidoAlumno)
                            .addComponent(emailAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordAlumno)
                            .addComponent(matriculaAlumno)
                            .addComponent(perteneceAlumno)
                            .addComponent(registrarMatAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(crearAlumnoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(backCrearalumAdminMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(apellidoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crearAlumnoButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(emailAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(passwordAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(backCrearalumAdminMenu)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(matriculaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(perteneceAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(registrarMatAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearAlumnoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearAlumnoButtonActionPerformed
        try {
            String nombre_alumno = nombreAlumno.getText();
            String apellido_alumno = apellidoAlumno.getText();
            String email_alumno = emailAlumno.getText();
            String pass_alumno = passwordAlumno.getText();
            String matricula_alumno = matriculaAlumno.getText();
            String grupo = perteneceAlumno.getText();
            String materia = registrarMatAlumno.getText();
            
            if (uni.getAlumnos().isEmpty() && Alumno.getContador() == uni.getAlumnosMax()) {
               JOptionPane.showMessageDialog(this, "No se pueden agregar más alumnos");
               return; 
            }
            
            if (uni.getGrupos().isEmpty()) {
               JOptionPane.showMessageDialog(this, "No hay grupos creados");
            } else if(uni.buscarGrupoPorNombre(grupo) != null){
                if (uni.buscarGrupoPorNombre(grupo).buscarMateriaPorNombre(materia) != null) {
                    if (!uni.getAlumnos().isEmpty() && uni.buscarAlumnoPorMatricula(matricula_alumno) != null) {
                        JOptionPane.showMessageDialog(this, "Alumno ya estaba inscrito");
                        return;
                    }
                    JOptionPane.showMessageDialog(this, "Agregando alumno a la materia");
                    Alumno alumno = new Alumno(nombre_alumno, apellido_alumno, email_alumno, pass_alumno, Roles.ESTUDIANTE, matricula_alumno);
                    uni.buscarGrupoPorNombre(grupo).buscarMateriaPorNombre(materia).inscribirAlumno(alumno, "0");
                    uni.addAlumno(alumno);
                } else {
                   JOptionPane.showMessageDialog(this, "Materia no encontrada"); 
                }
            }else{
                JOptionPane.showMessageDialog(this, "Grupo no encontrado");
            }
        } catch (Exception e) {
           JOptionPane.showMessageDialog(this, "Error al procesar los datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_crearAlumnoButtonActionPerformed

    private void backCrearalumAdminMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backCrearalumAdminMenuActionPerformed
        AdminMenu adminMenu = new AdminMenu(uni, profesorVacio);
        adminMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backCrearalumAdminMenuActionPerformed

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
            java.util.logging.Logger.getLogger(crearAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crearAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crearAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crearAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        university uni = new university();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crearAlumno(uni).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoAlumno;
    private javax.swing.JButton backCrearalumAdminMenu;
    private javax.swing.JButton crearAlumnoButton;
    private javax.swing.JTextField emailAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField matriculaAlumno;
    private javax.swing.JTextField nombreAlumno;
    private javax.swing.JTextField passwordAlumno;
    private javax.swing.JTextField perteneceAlumno;
    private javax.swing.JTextField registrarMatAlumno;
    // End of variables declaration//GEN-END:variables
}
