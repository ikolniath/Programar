/*
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
package Guia8.E1.CuentaBancariaServicio;
import Guia8.E1.CuentaBancaria.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public CuentaBancaria crearCuenta() {

        System.out.println("Ingrese el número de cuenta");
        int numero = input.nextInt();

        System.out.println("Ingrese DNI del cliente");
        int dni = input.nextInt();

        System.out.println("Ingrese el saldo de la cuenta");
        double saldo = input.nextDouble();

        return new CuentaBancaria(numero, dni, saldo);
    }

    public double ingresarBancaria(double saldo) {

        System.out.println("Ingrese el saldo a depositar");
        double ingresar = input.nextDouble();
        return ingresar + saldo;
    }

    public void ingresar(CuentaBancaria cuenta1) {

        System.out.println("Ingrese el saldo a depositar");
        double ingresar = input.nextDouble();
        double saldo = cuenta1.getSaldoActual();
        cuenta1.setSaldoActual(saldo + ingresar);
        System.out.println("Su saldo actual es: $" + (cuenta1.getSaldoActual()));
    }

    public double retirarBancaria(double saldo) {

        System.out.println("Ingrese el saldo a retirar");
        double retiro = input.nextDouble();
        if (retiro - saldo > 0) {
            return saldo;
        } else {
            return saldo - retiro;
        }
    }

    public void retirar(CuentaBancaria cuenta1) {

        System.out.println("Ingrese el saldo a retirar");
        double retiro = input.nextDouble();
        double saldo = cuenta1.getSaldoActual();
        if (retiro - saldo > 0) {
            System.out.println("El retiro pedido es mayor al dinero disponible");
        } else {
            cuenta1.setSaldoActual(saldo - retiro);
            System.out.println("Su saldo actual es: $" + cuenta1.getSaldoActual());
        }
    }

    public double extraccionrapidaBancaria(double saldo) {

        System.out.println("Ingrese el saldo a extracción rápida (Máximo puede retirar un 20% de su disponible)");
        double retiro = input.nextDouble();
        if (retiro > (saldo*0.20)) {
            return saldo;
        } else {
            return saldo - retiro;
        }
    }

    public void extracionRapida(CuentaBancaria cuenta1) {

        System.out.println("Ingrese el saldo a extracción rápida (Máximo puede retirar un 20% de su disponible)");
        double retiro = input.nextDouble();
        double saldo = cuenta1.getSaldoActual();
        if (retiro > (saldo*0.20)) {
            System.out.println("El retiro pedido es mayor al 20% del dinero disponible");
        } else {
            cuenta1.setSaldoActual(saldo - retiro);
            System.out.println("Su saldo actual es: $" + cuenta1.getSaldoActual());
        }
    }
    
    public void mostrarSaldo(CuentaBancaria cuenta1){
        
        System.out.println("Su saldo es $"+cuenta1.getSaldoActual());
    }
    
    public void mostrarDatos(CuentaBancaria cuenta1){
        
        System.out.println(cuenta1.toString());
    }
}
