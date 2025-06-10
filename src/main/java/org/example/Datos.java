package org.example;

public class Datos {

        private String Nombre;
        private String Apellido;
        private String Correo;
        private String Telefono;

        public Datos(String nombre, String apellido, String correo, String telefono) {
            Nombre = nombre;
            Apellido = apellido;
            Correo = correo;
            Telefono = telefono;
        }
    @Override
    public String toString ()
    {
        return String.format("Nombre: %s, Apellido: %s, Correo: %s, Telefono: %s",this.Nombre,this.Apellido, this.Correo, this.Telefono);
    }
}

