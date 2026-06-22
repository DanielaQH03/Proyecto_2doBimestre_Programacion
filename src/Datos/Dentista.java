/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Dentista extends Persona{
    private String especialidad;
    private double salario;

    Scanner leer = new Scanner(System.in);

    @Override
    public void registrar() {
        System.out.print("Digite el CI: ");
        super.setCi(leer.nextLine());
        System.out.print("Digite el nombre completo: ");
        super.setNombreCompleto(leer.nextLine());
        System.out.print("Digite el telefono: ");
        super.setTelefono(leer.nextLine());
        System.out.print("Digite la direccion: ");
        super.setDireccion(leer.nextLine());
        System.out.print("Digite la especialidad: ");
        this.especialidad = leer.nextLine();
        System.out.print("Digite el salario: ");
        this.salario = leer.nextDouble();
        leer.nextLine();
        System.out.println("---- DENTISTA REGISTRADO CORRECTAMENTE ----");
    }

    @Override
    public void mostrar() {
        System.out.println("CI: " + super.getCi());
        System.out.println("Nombre: " + super.getNombreCompleto());
        System.out.println("Telefono: " + super.getTelefono());
        System.out.println("Direccion: " + super.getDireccion());
        System.out.println("Especialidad: " + this.especialidad);
        System.out.println("Salario: " + this.salario);
        System.out.println("--------------------------------------------");
    }  

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
  
    
} 
    



   
