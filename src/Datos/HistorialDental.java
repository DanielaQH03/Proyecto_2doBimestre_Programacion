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
public class HistorialDental {
    private int id;
    private String observaciones;
    private List<Tratamiento> listaTratamientos;

    Scanner leer = new Scanner(System.in);

    public HistorialDental() {
        listaTratamientos = new ArrayList<>();
    }

    public void registrarHistorial() {
        System.out.print("Digite el id del historial: ");
        this.id = leer.nextInt();
        leer.nextLine();
        System.out.print("Digite observaciones: ");
        this.observaciones = leer.nextLine();
        System.out.println("---- HISTORIAL REGISTRADO ----");
    }

    public void agregarTratamiento(Tratamiento tratamiento) {
        listaTratamientos.add(tratamiento);
        System.out.println("---- TRATAMIENTO AGREGADO AL HISTORIAL ----");
    }

    public void mostrarHistorial() {
        System.out.println("Id Historial: " + this.id);
        System.out.println("Observaciones: " + this.observaciones);
        if (!listaTratamientos.isEmpty()) {
            System.out.println("----- TRATAMIENTOS -----");
            for (Tratamiento t : listaTratamientos) {
                t.mostrarTratamiento();
            }
        } else {
            System.out.println("****No se tienen tratamientos registrados****");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public List<Tratamiento> getListaTratamientos() {
        return listaTratamientos;
    }

    public void setListaTratamientos(List<Tratamiento> listaTratamientos) {
        this.listaTratamientos = listaTratamientos;
    }
    
    
}
