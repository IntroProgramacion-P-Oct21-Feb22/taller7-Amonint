public class App {
    public static void main(String[] args) throws Exception {
        int limite = 15;
        String signoresta = "-";
        String signosuma = "+";
        int numerador = 1;
        int denominador = 3; 
        int denominador2 = 5;
        int numero = 1;
        int contador = 3;
        int denominadorAux = 3;
        String signo;
        String cadenaAcumuladora = " ";
        String cadenaFinal = " ";
       
        do {
            if (denominadorAux == contador) {
                signo = signoresta;
                
                cadenaAcumuladora  = String.format("%s%d/%d ",
                        signo,
                        numerador,
                        denominador);
                
                denominadorAux = denominadorAux + 4;
                denominador = denominador + 2;

            } else {
                if (denominador2 == contador) {
                    signo = signosuma;
                    
                    cadenaAcumuladora  = String.format("%s%d/%d ",
                            signo,
                            numerador,
                            denominador);
                    
                    denominador2 = denominador2 + 4;
                    denominador = denominador + 2;

                }
            }
            cadenaFinal = String.format("%s%s", cadenaFinal, cadenaAcumuladora );
            contador = contador + 2;
        } while (contador <= limite);
        System.out.printf("%s%s", numero, cadenaFinal);
    }
}
