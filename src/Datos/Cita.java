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
public class Cita {
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Dentista dentista;
    private String estado;

    Scanner leer = new Scanner(System.in);

    public void registrarCita(Paciente paciente, Dentista dentista) {
        System.out.print("Digite la fecha (dd/mm/aaaa): ");
        this.fecha = leer.nextLine();
        System.out.print("Digite la hora: ");
        this.hora = leer.nextLine();
        this.paciente = paciente;
        this.dentista = dentista;
        this.estado = "PENDIENTE";
        System.out.println("---- CITA REGISTRADA ----");
    }
    public void mostrarCita() {
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Hora: " + this.hora);
        System.out.println("Paciente: " + this.paciente.getNombreCompleto());
        System.out.println("Dentista: " + this.dentista.getNombreCompleto());
        System.out.println("Estado: " + this.estado);
        System.out.println("--------------------------");
    }

    public void confirmarCita() {
        this.estado = "CONFIRMADA";
        System.out.println("---- CITA CONFIRMADA ----");
    }

    public void cancelarCita() {
        this.estado = "CANCELADA";
        System.out.println("---- CITA CANCELADA ----");
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
