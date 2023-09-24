package edu.gabi.estruturasExcepcionais;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");//retirar um numero para forçar erro
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            
             e.printStackTrace();//erro generico
             System.out.println("O cep não está no formato correto!");//erro com instrução
        }
        
    }

    static String formatarCep(String cep) throws CepInvalidoException{
            if(cep.length() != 8)
              throw new CepInvalidoException();
            
              //simulando um cep formatado
              return "23.765-064";
        }
}
