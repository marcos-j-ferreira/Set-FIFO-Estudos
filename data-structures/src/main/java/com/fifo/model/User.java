package com.fifo.model;

public class User{
    private String nome;

    User(String nome){
        this.nome = nome;
    }

    public final void setNome(String value){
        if(value == null){
            System.out.println("Digita um nome valido");
        }
        nome = value;
    }

    public final String getNome(){
        return nome;
    }

}