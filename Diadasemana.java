/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jogofavorito;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class JogoFavorito {

    public static void main(String[] args) {
        Scanner inUser = new Scanner(System.in);
        System.out.println("Qual é a sua personalidade de acordo com seu dia favorito?");
        int jogo = inUser.nextInt();
        
        switch(jogo){
        case 1:
            System.out.println("Você está infeliz que o seu Domingo está acabando");
            break;
            
        case 2:
            System.out.println("Você é uma pessoa que pensa que a Segunda-feira é um recomeço");
            break;
            
        case 3:
            System.out.println("Você é uma pessoa triste ao gostar de uma Terça-feira");
            break;
          
        case 4:
            System.out.println("Você é uma pessoa que não tem um dia favorito e aí só colocou que é Quarta-feira");
            break;
            
            
        case 5:
            System.out.println("Você é uma pessoa excêntrica ao gostar de uma Quinta-feira");
            break;
            
        case 6:
            System.out.println("Você é alguém que está cansado ao chegar na Sexta-feira");
            break;
        
        case 7:
            System.out.println("Você finalmente teve o seu descanso merecido no Sábado")

        default:
            System.out.println("Dia inválido");
        }  
    }
}
