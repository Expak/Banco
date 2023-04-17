/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco;

/**
 *
 * @author Latitude
 */
public class Banco {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ContaBanco c1 = new ContaBanco() ;
        
        c1.estadoAtual();
        c1.abrirConta("CP");
        c1.depositar(1000);
        System.out.println(c1.sacar(10000));
        System.out.println(c1.getSaldo());
        c1.estadoAtual();
        
                
                
                }
}
