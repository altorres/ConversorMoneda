import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion=0;
        while (opcion!= 8){
            System.out.println("***************************************\n" +
            "Bienvenidos al Conversor de Monedas\n\n" +
            "Ingresa la conversion de moneda que deseas realizar\n\n" +
            "1. Euro a Peso Colombiano\n" +
            "2. Peso Colombiano a Euro\n" +
            "3. Peso Colombiano a Dollar\n" +
            "4. Dollar a peso Colombiano \n" +
            "5. Dollar a Real Brasilero\n" +
            "6. Real Brasilero a Dollar\n" +
            "7. Yen japonés a Peso Colombiano\n" +
            "8. Peso Colombiano a Yen japonés\n" +
            "9. Salir\n"+
            "***************************************\n"+
            "Digite la Opcion del 1 - 9");

        opcion = lectura.nextInt();
        lectura.nextLine();

        switch (opcion){
            case 1:
                ConvertirMoneda.convertir("EUR", "COP", consulta, lectura);
                break;
            case 2:
                ConvertirMoneda.convertir("COP", "EUR", consulta, lectura);
                break;
            case 3:
                ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                break;
            case 4:
                ConvertirMoneda.convertir("USD", "COP", consulta, lectura);
                break;
            case 5:
                ConvertirMoneda.convertir("USD", "BRL", consulta, lectura);
                break;
            case 6:
                ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                break;
            case 7:
                ConvertirMoneda.convertir("JPY", "COP", consulta, lectura);
                break;
            case 8:
                ConvertirMoneda.convertir("COP", "JPY", consulta, lectura);
                break;
            case 9:
                System.out.println("Muchas gracias por usar el convertidor Hasta Luego");
                break;

            default:
                System.out.println("Opcion no valida");
                break;
         }
        }
    }
}
