/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniajc.herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author g.perezmoreno
 */
public class Cuenta {

    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual; //procentaje
    protected float comisionMensual = 0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Numero de consignaciones: " + numeroConsignaciones);
        System.out.println("Numero de retiros: " + numeroRetiros);
        System.out.println("Tasa Anual: " + tasaAnual);
        System.out.println("Comision Mensual: " + comisionMensual);
    }

    public void consignar(float cantidad) {
        saldo = saldo + cantidad;
    }

    public void retirar(float cantidad) {
        float nuevoSaldoTemporal = saldo - cantidad;

        if (nuevoSaldoTemporal >= 0) {
            saldo = saldo - cantidad;
        } else {
            System.out.println("La cantidad a retirar excede el saldo actual.");
        }

    }

    public void retiraCorriente(float cantidad) {
        if (cantidad >= 0) {
            saldo = cantidad - saldo;
            System.out.println("Debes en la tarjeta:" + saldo);
        }

    }

    public void sobregiro(float cantidad) {
        saldo = cantidad - saldo;

    }
    
}
