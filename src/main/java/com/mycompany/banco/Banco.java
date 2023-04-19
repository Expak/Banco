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
        System.out.println("Bem-vindo ao Banco!");
        ContaBanco c1 = new ContaBanco() ;

       
        c1.estadoAtual();
     
        c1.abrirConta("CP"); 
        //c1.depositar(1000);
        //c1.sacar(10000);
        //c1.getSaldo();
        //c1.pagarMensalidade();
        c1.estadoAtual();
    
    }
}
