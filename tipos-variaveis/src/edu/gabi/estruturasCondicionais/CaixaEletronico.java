package edu.gabi.estruturasCondicionais;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        //condicional simples
        System.out.println("Condicionais simples");

        if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;

        System.out.println("Novo saldo: " + saldo);


        //condicional composta
        System.out.println("Condicionais compostas");
        
        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);

        }else
          System.out.println("Saldo insuficiente");


          //condicional encadeada
          System.out.println("Condicionais encadeadas");

    }
        
}
