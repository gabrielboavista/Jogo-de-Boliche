/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodeboliche;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class JogoDeBoliche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o nome do jogar?");
        String nome = teclado.next();
        int cc = 1;
        int pontos = 0;
        int s = 0;
        int sm = 0;
        while (cc<=10) {
            System.out.println(pontos);
            System.out.println("RODADA " + cc);
            cc++;
            int c2 = 1;
            int m = 0;
            int ms = 0;
            int pinos = 0;
            if (s==1){
                m = 1;
            } else if (sm==1){
                ms = 1;
        }
            s = 0;
            sm = 0;
        while (c2<=2) {
            System.out.println("TENTATIVA " + c2);
            System.out.println("Quantos pinos foram derrubados por " + nome);
            int p = teclado.nextInt();
            pinos += p;
            if ((pinos==10) && (c2==1)){
                System.out.println("STRIKE!!");
                pontos += 10;
                s = 1;
                break;
            } else if ((pinos==10) && (c2==2)){
                System.out.println("(SPARE!!");
            } else if ((pinos!=10) && (c2==2)){
                pontos += pinos;
            }
            if ((ms == 1) && (c2==1) && (cc!=10)){
                pontos += pinos;
            }              
                           
            c2++;
        }
        if ((m==1) && (cc!=10)){
                pontos += pinos;
            } else if ((m==1) &&(cc==10)){
                int a = 1;
                while (a<=2){
                    System.out.println("ARREMESSO BONUS");
                    System.out.println("Quantos pinos foram derrubados por " + nome);
                    int p = teclado.nextInt();
                    pontos += p;
                    a++;
                }
            }
            if ((ms == 1) && (cc==10)){
                System.out.println("ARREMESSO BONUS");
                System.out.println("Quantos pinos foram derrubados por " + nome);
                int p = teclado.nextInt();
                pontos += p;
            }
        }
        System.out.print(nome);
        System.out.print(" Fez um total de " + pontos);
        System.out.print(" pontos");
    }
}
