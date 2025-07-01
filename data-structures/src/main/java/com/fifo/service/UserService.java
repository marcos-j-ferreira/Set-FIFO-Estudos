package com.fifo.service;

import com.fifo.repository.RepositoryUser;
import com.fifo.model.User;

import java.util.List;

public class UserService {
    private RepositoryUser repository;

    public UserService(RepositoryUser repository) {
        this.repository = repository;
    }

    public String addUser(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            return "Nome inválido!";
        }

        User novoUser = new User(nome);
        if (!repository.add(novoUser)) {
            return "Usuário já existe!";
        }

        return "Usuário adicionado com sucesso!";
    }
}