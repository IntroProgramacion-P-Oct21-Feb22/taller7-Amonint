public class App {
    public static void main(String[] args) throws Exception {
        int numeroinicial = 2;
        int limite = 110;
        int incremento = 2; 
        int contador = 0;
        String cadenaFinal = " ";
        
        while(numeroinicial < limite){
              
        numeroinicial  = numeroinicial  + contador;
        incremento = incremento + 2;
        cadenaFinal  = String.format("%s %d", cadenaFinal , numeroinicial );
        contador = incremento;
        }
        System.out.println(cadenaFinal);
    }
}
