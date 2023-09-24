package edu.gabi.estruturasExcepcionais;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
            //criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.println("Digite seu nome"); //Gabriela
            String nome = scanner.next();
            
            System.out.println("Digite seu sobrenome"); //Quadros
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade"); //37
            int idade = scanner.nextInt();
            
            System.out.println("Digite sua altura"); //1.67
            double altura = scanner.nextDouble();

            
            //imprimindo os dados obtidos pelo usuario
            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();   
        }
       
        catch(Exception e) {
        System.out.println("Os campos idade e altura precisam ser numericos!");
        
        }
    }
}