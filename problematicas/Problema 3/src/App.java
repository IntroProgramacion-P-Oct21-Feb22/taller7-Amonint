public class App {
    public static void main(String[] args) throws Exception {
        int numeroinicial = 2;
        int limite = 37;
        int contador = 3;
        String cadenaFinal = "2";
        do{
            numeroinicial= numeroinicial + contador;
            cadenaFinal = String.format("%s %d", cadenaFinal, numeroinicial);
            contador= contador + 2;
        
        }while(numeroinicial<=limite);
        System.out.println(cadenaFinal);
    }
}
