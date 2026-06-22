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
public class OperacionesConsultorio {
    List<Paciente> listaPacientes;
    List<Dentista> listaDentistas;
    List<Cita> listaCitas;

    public List<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(List<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    public List<Dentista> getListaDentistas() {
        return listaDentistas;
    }

    public void setListaDentistas(List<Dentista> listaDentistas) {
        this.listaDentistas = listaDentistas;
    }

    public List<Cita> getListaCitas() {
        return listaCitas;
    }

    public void setListaCitas(List<Cita> listaCitas) {
        this.listaCitas = listaCitas;
    }
    

    Scanner leer = new Scanner(System.in);

    public OperacionesConsultorio() {
        listaPacientes = new ArrayList<>();
        listaDentistas = new ArrayList<>();
        listaCitas = new ArrayList<>();
    }

    public void registrarPaciente() {
        Paciente p = new Paciente();
        p.registrar();
        listaPacientes.add(p);
    }

    public void registrarDentista() {
        Dentista d = new Dentista();
        d.registrar();
        listaDentistas.add(d);
    }

    public void mostrarPacientes() {
        if (!listaPacientes.isEmpty()) {
            for (Paciente p : listaPacientes) {
                p.mostrar();
            }
        } else {
            System.out.println("****No se tienen pacientes registrados****");
        }
    }

    public void mostrarDentistas() {
        if (!listaDentistas.isEmpty()) {
            for (Dentista d : listaDentistas) {
                d.mostrar();
            }
        } else {
            System.out.println("****No se tienen dentistas registrados****");
        }
    }

    public void agregarTratamiento() {
        int sw = 0;
        if (!listaPacientes.isEmpty() && !listaDentistas.isEmpty()) {
            System.out.print("Digite el CI del paciente: ");
            String ci = leer.nextLine();
            for (Paciente p : listaPacientes) {
                if (p.getCi().equalsIgnoreCase(ci)) {
                    sw = 1;
                    System.out.print("Digite el CI del dentista: ");
                    String ciDent = leer.nextLine();
                    for (Dentista d : listaDentistas) {
                        if (d.getCi().equalsIgnoreCase(ciDent)) {
                            Tratamiento t = new Tratamiento();
                            t.registrarTratamiento(d);
                            p.getHistorial().agregarTratamiento(t);
                        }
                    }
                }
            }
            if (sw == 0) {
                System.out.println("No se encontro al paciente");
            }
        } else {
            System.out.println("****Faltan pacientes o dentistas registrados****");
        }
    }

    public void registrarPago() {
        int sw = 0;
        if (!listaPacientes.isEmpty()) {
            System.out.print("Digite el CI del paciente: ");
            String ci = leer.nextLine();
            for (Paciente p : listaPacientes) {
                if (p.getCi().equalsIgnoreCase(ci)) {
                    sw = 1;
                    Pago pago = new Pago();
                    pago.registrarPago(p);
                    p.agregarPago(pago);
                }
            }
            if (sw == 0) {
                System.out.println("No se encontro al paciente");
            }
        } else {
            System.out.println("****No se tienen pacientes registrados****");
        }
    }

    public void registrarCita() {
        int sw = 0;
        if (!listaPacientes.isEmpty() && !listaDentistas.isEmpty()) {
            System.out.print("Digite el CI del paciente: ");
            String ci = leer.nextLine();
            for (Paciente p : listaPacientes) {
                if (p.getCi().equalsIgnoreCase(ci)) {
                    sw = 1;
                    System.out.print("Digite el CI del dentista: ");
                    String ciDent = leer.nextLine();
                    for (Dentista d : listaDentistas) {
                        if (d.getCi().equalsIgnoreCase(ciDent)) {
                            Cita c = new Cita();
                            c.registrarCita(p, d);
                            p.agregarCita(c);
                            listaCitas.add(c);
                        }
                    }
                }
            }
            if (sw == 0) {
                System.out.println("No se encontro al paciente");
            }
        } else {
            System.out.println("****Faltan pacientes o dentistas registrados****");
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

    public void verHistorial() {
        int sw = 0;
        if (!listaPacientes.isEmpty()) {
            System.out.print("Digite el CI del paciente: ");
            String ci = leer.nextLine();
            for (Paciente p : listaPacientes) {
                if (p.getCi().equalsIgnoreCase(ci)) {
                    sw = 1;
                    p.getHistorial().mostrarHistorial();
                }
            }
            if (sw == 0) {
                System.out.println("No se encontro al paciente");
            }
        } else {
            System.out.println("****No se tienen pacientes registrados****");
        }
    }
}
