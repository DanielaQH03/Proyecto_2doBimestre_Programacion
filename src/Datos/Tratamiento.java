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
public class Tratamiento {
    private String descripcion;
    private double costo;
    private String fecha;
    private Dentista dentista;

    Scanner leer = new Scanner(System.in);

    public void registrarTratamiento(Dentista dentista) {
        System.out.print("Digite la descripcion: ");
        this.descripcion = leer.nextLine();
        System.out.print("Digite el costo: ");
        this.costo = leer.nextDouble();
        leer.nextLine();
        System.out.print("Digite la fecha (dd/mm/aaaa): ");
        this.fecha = leer.nextLine();
        this.dentista = dentista;
        System.out.println("---- TRATAMIENTO REGISTRADO ----");
    }

    public void mostrarTratamiento() {
        System.out.println("Descripcion: " + this.descripcion);
        System.out.println("Costo: " + this.costo);
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Dentista: " + this.dentista.getNombreCompleto());
        System.out.println("---------------------------------");
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }
    
    
}
