package com.geekstechpoint.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author Priyanka Singh
 *
 */
 
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
		SpringApplication.run(App.class, args);
        System.out.println( "Hello World!" );
    }
}
