package com.fifo;

import com.fifo.repository.RepositoryUser;


/**
 * Hello world!
 *
 */
public class App {


    public static void main( String[] args )
    {
        RepositoryUser repo = new RepositoryUser();
        repo.add("marcos");
        repo.exibir();

        
    }
}
