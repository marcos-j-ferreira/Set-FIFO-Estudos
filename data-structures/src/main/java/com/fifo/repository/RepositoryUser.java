/**
 * Esse arquivo tem como objetivo organizar o armazenamento dos dados em uma estrutura de dados.
 * Gerenciando o model, e armazenando em uma estrutura set
 * 
 * - Set: Estrutura que não permite itens duplicados
 *  
 */

package com.fifo.repository;

import java.util.HashSet;
import java.util.Set;

import com.fifo.model.User;

public class RepositoryUser{

    private Set<String> usuarios = new HashSet<>();

    public final void add(String value){

        if(value == null){
            System.out.println("Digite um valor valido");
        }else{
            usuarios.add(value);
            System.out.println("Foi");
        }
    }

    public final void exibir(){

        for(String u: usuarios ){
            System.out.println(u);
        }
    }


}