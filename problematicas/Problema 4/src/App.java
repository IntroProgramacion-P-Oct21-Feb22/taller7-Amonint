public class App {
    public static void main(String[] args) throws Exception {
        int limite = 15;
        String signoresta = "-";
        String signosuma = "+";
        int numerador = 1;
        int denominador1 = 3;
        int denominador2 = 5;
        int numero = 1;
        int contador = 3;
        int denominador = 3;
        String signo;
        String acumuladora = " ";    
        String cadenaFinal = " ";
        
        while (contador <= limite) {
            if (denominador == contador) {
                signo = signoresta;
                
                acumuladora= String.format("%s%d/%d ",
                        signo,
                        numerador,
                        denominador1);
                
                denominador = denominador + 4;
                denominador1 = denominador1 + 2;

            } else {
                if (denominador2 == contador) {
                    signo = signosuma;
                    
                    acumuladora = String.format("%s%d/%d ",
                            signo,
                            numerador,
                            denominador1);
                    denominador2 = denominador2 + 4;
                    denominador1 = denominador1 + 2;

                }
            }
            cadenaFinal = String.format("%s%s", cadenaFinal, acumuladora);
            contador = contador + 2;
        }
        System.out.printf("%s%s", numero, cadenaFinal);
    }
}
