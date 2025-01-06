package menu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import personal.Profesor;
import personal.Profesor_aux;
import personal.Roles;
import personal.person;
import school.Materia;
import school.university;

public class crearProfe extends JDialog {
    private university uni;
    private Materia materia;
    private int control;
    private Profesor profesorVacio;

    public crearProfe(JFrame parent, university uni, Materia materia, int control) {
        super(parent, true); // Hacer el diálogo modal
        this.uni = uni;
        this.materia = materia;
        this.control = control;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomProfe = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        apeProfe = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailProfe = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passProfe = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cedProfe = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tituloProfe = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        perteneceProfe = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        imparteMateria = new javax.swing.JTextField();
        crearProfeButton = new javax.swing.JButton();
        backcrearProfAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 18));
        jLabel1.setText("Crear un profesor");

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 12));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 12));
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 0, 12));
        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 0, 12));
        jLabel5.setText("Password:");

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 0, 12));
        jLabel6.setText("Cédula:");

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 0, 12));
        jLabel7.setText("Título:");

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 0, 12));
        jLabel8.setText("Grupo al que pertenece:");

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 0, 12));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Materia que imparte:");

        crearProfeButton.setFont(new java.awt.Font("Book Antiqua", 2, 14));
        crearProfeButton.setText("Crear Profesor");
        crearProfeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearProfeButtonActionPerformed(evt);
            }
        });

        backcrearProfAdmin.setText("Regresar");
        backcrearProfAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backcrearProfAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(crearProfeButton)
                                .addGap(55, 55, 55))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(backcrearProfAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(tituloProfe, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(nomProfe)
                                                                        .addComponent(apeProfe)
                                                                        .addComponent(emailProfe)
                                                                        .addComponent(passProfe)
                                                                        .addComponent(cedProfe, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel9)
                                                                        .addComponent(imparteMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap())
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(perteneceProfe)
                                                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(51, 51, 51))))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(nomProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(apeProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel8))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(emailProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(47, 47, 47)
                                                                .addComponent(perteneceProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(passProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel9))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(cedProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(imparteMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(tituloProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(crearProfeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addComponent(backcrearProfAdmin)
                                .addGap(15, 15, 15))
        );

        pack();
    }

    private void crearProfeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        crearProfesor(uni, materia, 1);
    }

    private void backcrearProfAdminActionPerformed(java.awt.event.ActionEvent evt) {
        AdminMenu adminMenu = new AdminMenu(uni, profesorVacio);
        adminMenu.setVisible(true);
        this.dispose();
    }

    public void crearProfesor(university uni, Materia materia, int control) {
        try {
            String nombre = nomProfe.getText();
            String apellido = apeProfe.getText();
            String email = emailProfe.getText();
            String password = passProfe.getText();
            String cedula = cedProfe.getText();
            String titulo = tituloProfe.getText();
            if (nombre.isEmpty() || apellido.isEmpty() || email.isEmpty() || password.isEmpty() || cedula.isEmpty() || titulo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (control == 1) {
                person persona = uni.buscarProfesorPorCedula(cedula);
                if (persona != null) {
                    if (persona instanceof Profesor_aux) {
                        JOptionPane.showMessageDialog(this, "El profesor es un profesor auxiliar y ya está asignado a otra materia.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if (persona instanceof Profesor) {
                        Profesor profesor = (Profesor) persona;
                        profesor.addMateria(materia);
                        materia.setProfesor(profesor);
                        JOptionPane.showMessageDialog(this, "Materia añadida al profesor existente.");
                        return;
                    }
                } else {
                    Profesor profesor = new Profesor(nombre, apellido, email, password, Roles.PROFESOR, cedula, titulo);
                    profesor.addMateria(materia);
                    materia.setProfesor(profesor);
                    uni.addProfesor(profesor);
                    JOptionPane.showMessageDialog(this, "Profesor creado y añadido a la materia");
                }
            } else {
                String grupo = JOptionPane.showInputDialog(this, "Nombre del grupo: ");
                String nombreMateria = JOptionPane.showInputDialog(this, "Nombre de la materia:");

                if (grupo == null || nombreMateria == null || grupo.isEmpty() || nombreMateria.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Grupo y materia son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (uni.getGrupos().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "No hay grupos creados.", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (uni.buscarGrupoPorNombre(grupo) != null) {
                    Materia mat = uni.buscarGrupoPorNombre(grupo).buscarMateriaPorNombre(nombreMateria);
                    if (mat != null) {
                        if (mat.getProfesor() != null && mat.getProfesor().getName().equals(nombre)) {
                            JOptionPane.showMessageDialog(this, "El profesor ya está asignado a esta materia.", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        Profesor profesor = new Profesor(nombre, apellido, email, password, Roles.PROFESOR, cedula, titulo);
                        mat.setProfesor(profesor);
                        uni.addProfesor(profesor);
                        JOptionPane.showMessageDialog(this, "Profesor creado y asignado a la materia.");
                    } else {
                        JOptionPane.showMessageDialog(this, "Materia no encontrada.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Grupo no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(crearProfe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        university uni = new university();
        Materia materi = new Materia();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crearProfe(null, uni, materi, 1).setVisible(true);
            }
        });
    }

    private javax.swing.JTextField apeProfe;
    private javax.swing.JButton backcrearProfAdmin;
    private javax.swing.JTextField cedProfe;
    private javax.swing.JButton crearProfeButton;
    private javax.swing.JTextField emailProfe;
    private javax.swing.JTextField imparteMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nomProfe;
    private javax.swing.JTextField passProfe;
    private javax.swing.JTextField perteneceProfe;
    private javax.swing.JTextField tituloProfe;
}