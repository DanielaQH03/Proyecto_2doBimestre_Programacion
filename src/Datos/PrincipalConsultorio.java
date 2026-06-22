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
public class PrincipalConsultorio {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        OperacionesConsultorio obj = new OperacionesConsultorio();
        boolean continuar = true;
        int opc;
        do {
            System.out.println("============================================");
            System.out.println("\tCLINICA DENTAL - MENU PRINCIPAL");
            System.out.println("============================================");
            System.out.println("1. Registrar Paciente");
            System.out.println("2. Registrar Dentista");
            System.out.println("3. Mostrar Pacientes");
            System.out.println("4. Mostrar Dentistas");
            System.out.println("5. Registrar Tratamiento");
            System.out.println("6. Registrar Pago");
            System.out.println("7. Registrar Cita");
            System.out.println("8. Mostrar Citas");
            System.out.println("9. Ver Historial de Paciente");
            System.out.println("10. Salir");
            System.out.println("============================================");
            System.out.print("Digite una opcion: ");
            opc = leer.nextInt();
            leer.nextLine();
            System.out.println("============================================");
            switch (opc) {
                case 1:
                    obj.registrarPaciente();
                    break;
                case 2:
                    obj.registrarDentista();
                    break;
                case 3:
                    obj.mostrarPacientes();
                    break;
                case 4:
                    obj.mostrarDentistas();
                    break;
                case 5:
                    obj.agregarTratamiento();
                    break;
                case 6:
                    obj.registrarPago();
                    break;
                case 7:
                    obj.registrarCita();
                    break;
                case 8:
                    obj.mostrarCitas();
                    break;
                case 9:
                    obj.verHistorial();
                    break;
                default:
                    continuar = false;
                    break;
            }
        } while (continuar);
    }
}
