package org.example;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Logic {
    TreeMap<Integer,Datos> Contactos = new TreeMap<Integer,Datos>();
    Scanner Scan = new Scanner(System.in);

     public  void anadircontactos()
    {

        System.out.println("Ingrese ID:");
        int id = Scan.nextInt();
        System.out.println("Ingrese Datos:");
        System.out.println("Ingrese Nombre:");
        String Nombre = Scan.next();
        System.out.println("Ingrese Apellido:");
        String Apellido = Scan.next();
        System.out.println("Ingrese Correo:");
        String Correo = Scan.next();
        System.out.println("Ingrese Telefono:");
        String Telefono = Scan.next();
        Contactos.put(id,new Datos(Nombre,Apellido,Correo,Telefono));
    }
    public void  mostrar()
    {
        System.out.println("Contactos: " + Contactos.toString());
//        for (Map.Entry<Integer,String> entrada : Contactos.entrySet())
//        {
//            System.out.println("Datos Capturados:");
//            System.out.println("ID: " + entrada.getKey() + ". Datos: " + entrada.getClass());
//        }
    }
    public  void buscar()
    {
        System.out.println("A seleccionado buscar:");
        System.out.println("Ingrese ID de quien busca:");
        int busco = Scan.nextInt();
        System.out.println("Resultado Encontrado: " + Contactos.get(busco).toString());
    }
    public void borrar()
    {
        System.out.println("Vas a elimnar a: (Ingrese ID): ");
        int Borrar = Scan.nextInt();
        Contactos.remove(Borrar);
        System.out.println("Usuario Borrado");
    }
}
