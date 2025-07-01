package com.fifo;

import com.fifo.repository.RepositoryUser;
import com.fifo.service.UserService;

public class App {


    public static void main( String[] args ){

        RepositoryUser repository = new RepositoryUser(); 
        UserService userService = new UserService(repository);

       String result = userService.addUser("marcos");
       String r = userService.addUser("marcos");


       System.out.println(result);

        //System.out.println(sim);

    }
}
