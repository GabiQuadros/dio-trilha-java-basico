package edu.gabi.estruturasCondicionais;


public class PlanoOperadora {
	public static void main(String[] args) {
		String plano = "B"; //M / T
		
        System.out.println("--IF ELSE--");
        // Modo condicional convencional
		if(plano == "B") {
			System.out.println("100 minutos de ligação");

		}else if(plano == "M") {
			System.out.println("100 minutos de ligação");

			System.out.println("Whats e Instagram grátis");	

		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");

			System.out.println("Whats e Intagram grátis");

			System.out.println("5Gb Youtube");	
		}


        System.out.println("--SWITCH CASE--");
        // Modo condicional switch/case

        String planoExemplo = "T"; //M / B
        switch (planoExemplo) {
			case "T": {
				System.out.println("5Gb Youtube");
                System.out.println("Whats e Intagram grátis");
                System.out.println("5Gb Youtube");
                break;
			}
			case "M": {
				System.out.println("Whats e Intagram grátis");
                break;
			}
			case "B": {
				System.out.println("100 minutos de ligação");
                break;
			}
        }
	}
}

