package com.eiv.factorial;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Ingese un nro");
        Scanner s = new Scanner(System.in);
        String sNumero=s.nextLine();
        int numero=Integer.valueOf(sNumero);
        
        
        CalculoFactorial factorial=new CalculoFactorialImpl();
        long resultado=factorial.calcular(numero);
        System.out.println("El resultado del factorial de " + numero +" es " + resultado);
s.close();
    }

}
