/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menu;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import personal.Profesor;
import school.Grupo;
import school.Materia;
import school.university;

/**
 *
 * @author ldrnt
 */
public class generarMateriasGrup extends javax.swing.JFrame {
    private university uni;
    private Profesor profesorVacio;
    private Grupo grupo;
    
    private crearProfe crearProfeInstace;
    /**
     * Creates new form generarMateriasGrup
     */
    public generarMateriasGrup(university uni, Profesor profesorVacio) {
        this.uni = uni;
        this.profesorVacio = profesorVacio;
//        this.crearProfeInstace = new crearProfe();
        initComponents();
    }
    
    public void setGrupo(Grupo grupo){
        this.grupo = grupo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        materiasPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        numeroMateriasField = new javax.swing.JTextField();
        generarButton = new javax.swing.JButton();
        backgenerarAdmin = new javax.swing.JButton();

        javax.swing.GroupLayout materiasPanelLayout = new javax.swing.GroupLayout(materiasPanel);
        materiasPanel.setLayout(materiasPanelLayout);
        materiasPanelLayout.setHorizontalGroup(
            materiasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        materiasPanelLayout.setVerticalGroup(
            materiasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Número de materias:");

        generarButton.setText("Generar");
        generarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarButtonActionPerformed(evt);
            }
        });

        backgenerarAdmin.setText("Regresar");
        backgenerarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backgenerarAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroMateriasField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(generarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(backgenerarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numeroMateriasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generarButton)
                    .addComponent(backgenerarAdmin))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarButtonActionPerformed
       materiasPanel.removeAll();
        
        int numeroMaterias;
        try {
            numeroMaterias = Integer.parseInt(numeroMateriasField.getText());
            if(numeroMaterias <= 0) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un número mayor a 0.");
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido.");
            return;
        }
        materiasPanel.setLayout(new GridLayout(0,2));
        
        for (int i = 1; i <= numeroMaterias; i++) {
            String nombreMateria = JOptionPane.showInputDialog(this, "Nombre de la materia " + i + ":");
            if (nombreMateria != null && !nombreMateria.isEmpty()) {
                Materia materia = new Materia(nombreMateria, profesorVacio, grupo);
                grupo.addMateria(materia);
                uni.addMateria(materia, grupo);
            }
        }
        
        JOptionPane.showMessageDialog(this, grupo.imprimirMaterias());
        
        
        for (var materia : grupo.getMaterias()) {
            SwingWorker<Void, Void> worker = new SwingWorker<>() {
                @Override
                protected Void doInBackground() throws Exception {
                    // No interactuar con la GUI aquí
                    return null;
                }
                @Override
                protected void done() {
                    try {
                        get();
                        crearProfe crearProfeInstace = new crearProfe(generarMateriasGrup.this,uni, materia, 1);
                        crearProfeInstace.crearProfesor(uni, materia, 1);
                        crearProfeInstace.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            worker.execute();
            try { 
                worker.get();
            } catch (Exception e) { 
                e.printStackTrace();
            }
        }
        
        int ver = JOptionPane.showConfirmDialog(this, "¿Quiere ver el listado de todo?", "Confirmar", JOptionPane.YES_NO_OPTION); 
        if (ver == JOptionPane.YES_OPTION) { 
            for (var materia : grupo.getMaterias()) {
                JOptionPane.showMessageDialog(this, materia.getNombre());
            } 
        }
        
        materiasPanel.revalidate();
        materiasPanel.repaint();
    }//GEN-LAST:event_generarButtonActionPerformed

    private void backgenerarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backgenerarAdminActionPerformed
        AdminMenu adminMenu = new AdminMenu(uni, profesorVacio);
        adminMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backgenerarAdminActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        university uni = new university();
        Profesor profesorVacio = new Profesor();
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
            java.util.logging.Logger.getLogger(generarMateriasGrup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(generarMateriasGrup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(generarMateriasGrup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(generarMateriasGrup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new generarMateriasGrup(uni, profesorVacio).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backgenerarAdmin;
    private javax.swing.JButton generarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel materiasPanel;
    private javax.swing.JTextField numeroMateriasField;
    // End of variables declaration//GEN-END:variables
}
