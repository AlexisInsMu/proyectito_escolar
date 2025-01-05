/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personal;

import java.util.ArrayList;

import school.Materia;

/**
 *
 * @author alexisnovo8
 */
public class Profesor_aux extends Profesor {
    private Materia materiaAsignada;
    
    public Profesor_aux(String name, String lastName, String email, String password, Roles role, String cedula, String titulo) {
        super(name, lastName, email, password, role, cedula, titulo);
    }

    public Profesor_aux() {
        super();
    }

    @Override
    public String getDetails() {
        StringBuilder data = new StringBuilder();
        data.append("Profesor Auxiliar").append("\n");
        data.append("Nombre: ").append(super.getName()).append("\n");
        data.append("Apellido: ").append(super.getLastName()).append("\n");
        data.append("Email: ").append(super.getEmail()).append("\n");
        data.append("Cedula: ").append(super.getCedula()).append("\n");
        data.append("Titulo: ").append(super.getTitulo()).append("\n");
        data.append("Materias: ").append(super.getMaterias().size()).append("\n");
        data.append("Grupos: ").append(super.getGrupos().size()).append("\n");
        data.append("Alumnos: ").append(super.getNumberAlumnos()).append("\n");
        return data.toString();
    }
    // Método para asignar una materia
    public void setMateriaAsignada(Materia materia) {
        this.materiaAsignada = materia;
        super.addMateria(materia);
    }

    // Método para obtener la materia asignada
    public Materia getMateriaAsignada() {
        return materiaAsignada;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMateria Asignada: " + (materiaAsignada != null ? materiaAsignada.getNombre() : "Ninguna");
    }
    @Override
    public String getRole(){
        StringBuilder data = new StringBuilder();
        data.append("Profesor Auxiliar").append("\n");
        data.append("Cedula: ").append(super.getCedula()).append("\n");
        data.append("Titulo: ").append(super.getTitulo()).append("\n");
        return data.toString();
    }
}
