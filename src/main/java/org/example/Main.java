package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        Logic ObjLogic = new Logic();
        int Opcion;
        int id;
        String Datos;
        Opcion = 0;
        do {
            System.out.println("Bienvenido al sistema de Contactos");
            System.out.println("¿Que accion deseas realizar?");
            System.out.println("1. Agregar Contacto");
            System.out.println("2. Mostrar Contactos");
            System.out.println("3. Buscar Contacto por nombre");
            System.out.println("4. Eliminar Contacto");
            System.out.println("5. Salir");
            Opcion= Scan.nextInt();
            switch (Opcion)
            {
                case 1:
                    ObjLogic.anadircontactos();
                    break;
                case 2:
                    ObjLogic.mostrar();
                    break;
                case 3:
                    ObjLogic.buscar();
                    break;
                case 4:
                    ObjLogic.borrar();
                    break;
                case 5:
                    System.out.println("Adios :D");
                    break;
                default:
                    System.out.println("Opcion no disponible.");
                    break;
            }
        }
   while (Opcion !=5);
}
}