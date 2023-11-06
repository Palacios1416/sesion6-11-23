import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static int opc;
    public static double depositar, retirar, saldoDisponible;
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("---------BANCO EN LINEA---------");
        System.out.println("Que transaccion quiere realizar? \n"+
                            "1 para Depositar\n"+
                            "2 para Retirar\n"+
                            "3 para Salir");
        try {
            do {
            opc = scan.nextInt();
            } while (opc < 1 || opc > 3);
        } catch (InputMismatchException e) {
            System.out.println("Valor incorrecto, ejecute otra vez");
        }
        
        switch (opc) {
            case 1: 
                System.out.println("Cuanto desea depositar?");
        
                do {
                    depositar = scan.nextDouble();
                    
                } while (depositar < 100);

                CuentaBancaria transaccion = new CuentaBancaria();
                double newCredit = transaccion.DepositarFondos(depositar);
                System.out.println("El nuevo saldo es: "+newCredit);
                break;

            case 2:
                System.out.println("Cuanto saldo tiene su cuenta?");
                do {
                    saldoDisponible = scan.nextDouble();
                } while (saldoDisponible < 1 || saldoDisponible > 99999);

                System.out.println("Cuanto dinero desea retirar?");
                do {
                    retirar = scan.nextDouble(); 
                    if (retirar < 100) {
                        System.out.println("No puede retirar menos de 100");
                        System.out.println("Cuanto desea retirar?");
                    }
                } while (retirar < 100 );
            break;
            default:
                break;
        }
    }
}
