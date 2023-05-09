package org.example;

public class Character implements Nameable {
    private String nombre;

    public void setName(String nombre){
        this.nombre = nombre;
    }

    public String getName(){
        return this.nombre;
    }
}
