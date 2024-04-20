

import Dispositivo.Dispositivo;

import javax.swing.plaf.synth.SynthUI;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static ArrayList<Dispositivo> lista = new ArrayList<Dispositivo>();

    public static void main(String[] args) {
        menuPrincipal();
    }

    static void menuPrincipal(){

        Scanner sn = new Scanner(System.in);
        int opcion;
        while(true){
            mostrarMenuPrincipal();
            try{
                opcion = sn.nextInt();
                sn.nextLine();

                if(opcion == 4) {
                    System.out.println("Saliendo...");
                    break;
                }

                switch (opcion){
                    case 1:
                        agregarProducto();
                        break;
                    case 2:
                        modificarProducto();
                        break;
                    case 3:
                        mostrarProductos();
                        break;
                    default:
                        System.out.println("\nPor favor, ingrese una opcion valida.\n");
                        break;
                }
            }catch (InputMismatchException e){
                sn.nextLine();
                System.out.println("\nPor favor, ingrese una opcion valida.\n");
            }
        }

    }


    private static void mostrarProductos() {
        //Recorriendo la lista de empleados hasta encontrar el empleado que buscamos
        for (int i = 0; i < lista.size(); i++) {

                System.out.println("Nombre "+);
                System.out.println("MOdelo: "+emp.getDUI());
                System.out.println("Precio: "+emp.getSexo());
                System.out.println("DEscripcion: "+emp.getCarnet());
                System.out.println("Salario base del empleado en USD: $"+emp.getSalarioBase());
                System.out.println("Salario neto del empleado en USD: $"+emp.obtenerSalario()+"\n");

                //Se finaliza la ejecucion ya que no hace falta seguir iterando
                return;
            }
        }
    }


    private static void modificarProducto() {
        Scanner sn = new Scanner(System.in);
        //Pidiendo el carnet del empleado a modificar
        System.out.println("Ingrese el nombre del dispositivo a modificar:");
        String name = sn.nextLine();

        //Recorriendo la lista de empleados hasta encontrar el empleado que buscamos
        for (int i = 0; i < lista.size(); i++) {
            //Evaluando si el empleado actual coincide con el carnet
            if (lista.get(i).getNombre().equals(name)){
                //Si coincide se solicita el nuevo salario concatenando el nombre del empleado
                System.out.print("\nIngrese el nuevo modelo de "+lista.get(i).getNombre());
                String nuevoMOdelo = sn.nextLine();

                //Se reasigna el salario
                lista.get(i).setModelo(nuevoMOdelo);

                //Se imprime
                System.out.println("\nModelo actualizado exitosamente...\n");

                //Se finaliza la ejecucion ya que no hace falta seguir iterando
                return;
            }
        }
    }

    private static void agregarProducto(){

        Dispositivo dispositivo = null;
        Scanner sn = new Scanner(System.in);

        //Pidiendo todos los datos personales
        System.out.println("Ingrese nombre dispositivo:");
        String nombre = sn.nextLine();
        System.out.println("Ingrese modelo del dispositivo:");
        String modelo = sn.nextLine();
        System.out.println("Ingrese cantidad de articulos:");
        int art = sn.nextInt();
        sn.nextLine();
        System.out.println("Ingrese descripcion del dispositivo:");
        String desc = sn.nextLine();
        System.out.println("Ingrese precio del dispositivo:");
        double precio = sn.nextDouble();
        lista.add(dispositivo);

    }

    private static int obtenerTipoEmpleado() {
        Scanner sn = new Scanner(System.in);
        int opcion;
        while(true) {
            try {
                System.out.println("Seleccione el tipo de empleado:\n"
                        + "\t1. Empleado a tiempo completo\n"
                        + "\t2. Empleado a tiempo parcial\n"
                        + "\t3. Empleado temporal"
                );
                System.out.print("Opcion > ");
                opcion = sn.nextInt();
                if(opcion >= 1 && opcion <= 3) return opcion;
                System.out.println("Ingrese una opcion valida");
            } catch (Exception e) {
                System.out.println("Ingrese una opcion valida");
            }
            sn.nextLine();
        }

    }

    static void mostrarMenuPrincipal(){
        System.out.println("Seleccione una opcion:\n"
                + "\t1. Agregar Dispositivo\n"
                + "\t2. Modificar Modelo de dispositivo\n"
                + "\t3. Mostrar datos\n"
                + "\t4. Salir\n"
        );
        System.out.print("Opcion: ");
    }
}