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
public class Pago {
    private Paciente paciente;
    private double montoTotal;
    private double montoPagado;
    private String fechaPago;
    private String metodoPago;
    private String estado;

    Scanner leer = new Scanner(System.in);

    public void registrarPago(Paciente paciente) {
        this.paciente = paciente;
        System.out.print("Digite el monto total: ");
        this.montoTotal = leer.nextDouble();
        System.out.print("Digite el monto pagado: ");
        this.montoPagado = leer.nextDouble();
        leer.nextLine();
        System.out.print("Digite la fecha de pago (dd/mm/aaaa): ");
        this.fechaPago = leer.nextLine();
        System.out.print("Digite el metodo de pago (EFECTIVO/TARJETA/QR): ");
        this.metodoPago = leer.nextLine();
        this.estado = (montoPagado >= montoTotal) ? "PAGADO" : "PENDIENTE";
        System.out.println("---- PAGO REGISTRADO ----");
    }

    public void mostrarPago() {
        System.out.println("Paciente: " + this.paciente.getNombreCompleto());
        System.out.println("Monto Total: " + this.montoTotal);
        System.out.println("Monto Pagado: " + this.montoPagado);
        System.out.println("Saldo Pendiente: " + calcularSaldoPendiente());
        System.out.println("Fecha de Pago: " + this.fechaPago);
        System.out.println("Metodo de Pago: " + this.metodoPago);
        System.out.println("Estado: " + this.estado);
        System.out.println("---------------------------");
    }
    public double calcularSaldoPendiente() {
        return this.montoTotal - this.montoPagado;
    }

    public boolean verificarPagoCompleto() {
        return this.estado.equalsIgnoreCase("PAGADO");
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public double getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
