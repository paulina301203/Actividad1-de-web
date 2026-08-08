package com.example;

public class Auto {
    private String marca;
    private String modelo;

    //contructor se llama igual que la clase, no tiene retorno,
    // el objetivo es recibir argumentos que quiero que lleguen a los atributos 
    //se le da el valor inicial en la instancia 
    //cuando se crea un constructor el vacio se elimina por defecto, pero podemos crear un contructor vacio 
    //este es un contructor parametrizado, los paremetros son marca y modelo 
    public Auto(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    //netodo get
    public string getMarca{
        return marca;
    }

    public String getModelo{
        return modelo;
    }
}
