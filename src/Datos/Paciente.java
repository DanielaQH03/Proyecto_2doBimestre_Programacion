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
public class Paciente extends Persona{
    private String fechaNacimiento;
    private String grupoSanguineo;
    private HistorialDental historial;
    private List<Pago> listaPagos;
    private List<Cita> listaCitas;

    Scanner leer = new Scanner(System.in);

    public Paciente() {
        listaPagos = new ArrayList<>();
        listaCitas = new ArrayList<>();
        historial = new HistorialDental();
    }
    
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
        System.out.print("Digite la fecha de nacimiento (dd/mm/aaaa): ");
        this.fechaNacimiento = leer.nextLine();
        System.out.print("Digite el grupo sanguineo: ");
        this.grupoSanguineo = leer.nextLine();
        System.out.println("---- PACIENTE REGISTRADO CORRECTAMENTE ----");
        
    }

    @Override
    public void mostrar() {
        System.out.println("CI: " + super.getCi());
        System.out.println("Nombre: " + super.getNombreCompleto());
        System.out.println("Telefono: " + super.getTelefono());
        System.out.println("Direccion: " + super.getDireccion());
        System.out.println("Fecha Nacimiento: " + this.fechaNacimiento);
        System.out.println("Grupo Sanguineo: " + this.grupoSanguineo);
        System.out.println("------------------------------------------");
    }
    
    public void agregarPago(Pago pago) {
        listaPagos.add(pago);
        System.out.println("---- PAGO AGREGADO ----");
    }

    public void agregarCita(Cita cita) {
        listaCitas.add(cita);
        System.out.println("---- CITA AGREGADA ----");
    }

    public void mostrarPagos() {
        if (!listaPagos.isEmpty()) {
            for (Pago p : listaPagos) {
                p.mostrarPago();
            }
        } else {
            System.out.println("****No se tienen pagos registrados****");
        }
    }

    public void mostrarCitas() {
        if (!listaCitas.isEmpty()) {
            for (Cita c : listaCitas) {
                c.mostrarCita();
            }
        } else {
            System.out.println("****No se tienen citas registradas****");
        }
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public HistorialDental getHistorial() {
        return historial;
    }

    public void setHistorial(HistorialDental historial) {
        this.historial = historial;
    }

    public List<Pago> getListaPagos() {
        return listaPagos;
    }

    public void setListaPagos(List<Pago> listaPagos) {
        this.listaPagos = listaPagos;
    }

    public List<Cita> getListaCitas() {
        return listaCitas;
    }

    public void setListaCitas(List<Cita> listaCitas) {
        this.listaCitas = listaCitas;
    }
    
    
}
