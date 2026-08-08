package com.example;

public class Persona {
    //Atributos con modificador de acceso privado
    private String nombre;
    private String email;
    private int edad;

    public Product(string nombre, int edad, string email){
        this.edad = edad;
        this.nombre = nombre;
        this.email = email;
    }

//Metodos getter y setter 
//get devuelve obtiene valor de atributo y set modifica 
    public String getNombre() {
        return nombre;
    }
// parametro de un metodo es por ejemplo en este caso string nombre 
//  y cuando se usa se llama argumento, que es el valor que se le envia a un parametro 
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getedad() {
        return edad;
    }

    public void setedad(int edad){
        this.edad = edad;
    }

    public void setedad(int edad) {
        if (edad > 0 && edad <=120){
            this.edad = edad;
        }else{
            system.out.printIn("Edad no valida")
        }
    }

    //
    public void celebrarGol(){
        System.out.println();
    }
}
