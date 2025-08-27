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
        System.out.println("Qual é seu jogo favorito");
        int jogo = inUser.nextInt();
        
        switch(jogo){
        case 1:
            System.out.println("Você é viciado em 2014, pois gosta de Minecraft");
            break;
            
        case 2:
            System.out.println("Você ama tanto futebol que gosta de FIFA");
            break;
            
        case 3:
            System.out.println("Você não faz nada, a não ser que seja ser tóxico no Fortnite");
            break;
          
        case 4:
            System.out.println("Você é muito bom em jogo de tiro ou só joga por causa dos seus amigos que amam Call of Duty");
            break;
            
            
        case 5:
            System.out.println("Você se preocupa mais em fazer uma casa no The Sims do que em arrumar sua casa");
            break;
            
        case 6:
            System.out.println("Você é viciado em estar em uma arena alta no Clash Royale");
            break;
            
        default:
            System.out.println("Não conheço seu jogo");
        }  
    }
}
