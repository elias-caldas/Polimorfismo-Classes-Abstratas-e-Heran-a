/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Pc Elias
 */
public class Aniversario extends CartãoWeb {
    
    Aniversario(String nome){
        this.destinatario = nome;
    }
    
    @Override
    public void showMessage(){
        System.out.printf("Feliz aniversário, %s", this.destinatario);
    }
}
