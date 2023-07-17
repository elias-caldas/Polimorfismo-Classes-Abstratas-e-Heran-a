/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author Pc Elias
 */
public class Main {

    public static void main(String[] args) {
        
        CartãoWeb [] cartao = new CartãoWeb[3];
        DiaDosNamorados cartaoNamorados = new DiaDosNamorados ("Elias");
        cartao[0] = cartaoNamorados;
        Natal cartaoNatal = new Natal("Joana");
        cartao[1] = cartaoNatal;
        Aniversario cartaoAniversario = new Aniversario("Mateus");
        cartao[2] = cartaoAniversario;
 
        int valor = 0;
        
        for (int i = 0; i< cartao.length; i++){
            cartao[valor].showMessage();
        }
    }
}
