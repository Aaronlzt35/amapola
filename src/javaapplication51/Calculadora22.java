/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication51;


import java.util.Scanner;

public class Calculadora22 {

    private int num1;
    private int num2;
    
    public Calculadora22(int a, int b){
        num1=a;
        num2=b;
    }
public int suma(){
    int resul=num1+num2;
    return resul;
} 
public int multiplicar(){
    int resul=num1*num2;
        return resul;
}    
public int dividir(){
    int resul=num1/num2;
    return resul;
}
  public static void main(String[] args){
        int a, b, operacion;
        Scanner teclado=new Scanner(System.in);                         
        a=teclado.nextInt();
        b=teclado.nextInt();
        Calculadora22 objeto=new Calculadora22(a,b);
}
}