package edu.gabi.introducaoJava;
public class MinhaClasse {
    
    public static void main (String [] args){

        // System.out.print("Hello world");

        String primeiroNome = "Gabriela";
        String segundoNome = "Quadros";

        String nomeCompleto = nomeCompleto( primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}


