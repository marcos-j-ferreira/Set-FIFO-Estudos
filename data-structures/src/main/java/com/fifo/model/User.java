package com.fifo.model;

public class User{
    private String nome;

    public User(String nome){
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

    @Override
    public boolean equals(Object o){
        if (this == o)  return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return nome.equalsIgnoreCase(user.nome); 
    }

    @Override
    public int hashCode(){
        return nome.toLowerCase().hashCode();
    }

}