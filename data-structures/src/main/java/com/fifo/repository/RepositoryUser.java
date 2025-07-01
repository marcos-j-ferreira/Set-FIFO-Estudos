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
import java.util.ArrayList;
import java.util.List;

import com.fifo.model.*;

public class RepositoryUser{

    private Set<User> usuarios = new HashSet<>();

    public boolean add(User user){
        return usuarios.add(user);
    }

    public boolean remove(User user){
        return usuarios.remove(user);
    }

    public List<User> getAll(){
        return new ArrayList<>(usuarios);
    }
}