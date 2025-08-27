/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.frutas;

import java.util.Scanner;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Frutas {

    public static void main(String[] args) {
        Scanner inUser = new Scanner(System.in);
        System.out.println("Qual é sua fruta favorita");
        int fruta = inUser.nextInt();
        
        switch(fruta){
            case 1:
            System.out.println("Você gosta de maçã");
            break;
            
            case 2:
            System.out.println("Você gosta de banana");
            break;
            
            case 3:
            System.out.println("Você gosta de laranja");
            break;
            
            case 4:
            System.out.println("Você gosta de kiwi");
            break;
            
            case 5:
            System.out.println("Você gosta de uva");
            break;
            
            case 6:
            System.out.println("Você gosta de manga");
            break;
            
            case 7:
            System.out.println("Você gosta de melão");
            break;
            
            case 8:
            System.out.println("Você gosta de abacaxi");
            break;
            
            default:
            System.out.println("Você ama tomate");
        }
    }
}
