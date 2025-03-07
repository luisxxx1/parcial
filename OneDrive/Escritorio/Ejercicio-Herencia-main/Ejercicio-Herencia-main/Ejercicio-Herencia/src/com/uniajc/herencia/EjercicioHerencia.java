/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.uniajc.herencia;

/**
 *
 * @author g.perezmoreno
 */
public class EjercicioHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // crear objeto de la clase cuenta
        Cuenta cuenta1 = new Cuenta(10000, 0);

        cuenta1.imprimir();
        System.out.println("\n");

        cuenta1.consignar(201);
        System.out.println("\n");
        cuenta1.imprimir();

        cuenta1.retirar(3000);
        System.out.println("");
        cuenta1.imprimir();

        cuenta1.retirar(15000);
        System.out.println("");
        cuenta1.imprimir();

        System.out.println("\n cuenta corriente");

        Cuenta cuenta2 = new Cuenta(0, 0);

        cuenta2.retiraCorriente(0);
        System.out.println("");
        cuenta2.imprimir();

        System.out.println("\n");

        cuenta2.sobregiro(2000);
        System.out.println("");
        cuenta2.imprimir();

    }

}
