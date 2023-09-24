package edu.gabi.estruturasCondicionais;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        System.out.println("--Condicionais compostas--");
        //condicionais compostas
        if(nota>= 7)
        System.out.println("APROVADO");
        
        else
        System.out.println("REPROVADO");


        System.out.println("--Condicionais encadeadas-");
        //condicionais encadeadas
        if(nota>= 7)
        System.out.println("APROVADO");

        else if(nota >=5 && nota<7)
        System.out.println(" EM RECUPERAÇÃO!");

        else
        System.out.println("REPROVADO");



        System.out.println("--Condições ternárias-");
        //condicionais ternárias
        int notaExemplo = 7;
        String resultado = notaExemplo >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
  

         //condicionais ternárias composta
        int notaExemplo2 = 5;
        String resultado2 = notaExemplo2 >=7 ? "Aprovado" : notaExemplo2 >= 5 && notaExemplo2 < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado2);
     
        
    }
}
