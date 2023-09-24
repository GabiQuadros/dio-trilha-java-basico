package edu.gabi.estruturasCondicionais;

public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "M";

          System.out.println("--IF ELSE--");
        // com if else
        if(sigla == "P")
            System.out.println("PEQUENO");
        else if(sigla == "M")
            System.out.println("MEDIO");
        else if (sigla == "G")
            System.out.println("GRANDE");
        else 
            System.out.println("INDEFINIDO");


        //Com switch case
          System.out.println("--SWITCH CASE--");

          String siglaExemplo = "A";

        switch (siglaExemplo) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }
    }
}
