package org.example;

public class Player<T> implements Nameable{
    private T nombre;

    public void setName(T nombre){
        this.nombre = nombre;
    }

    public T getName(){
        return this.nombre;
    }
}
