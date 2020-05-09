package br.com.bootcamp.jogo.br.com.boot;

import java.util.Random;
import java.util.Scanner;

public class Forca {

    public static void main(String[] args){
            System.out.println("Bem vindo ao jogo!");
            Scanner in = new Scanner(System.in);
            System.out.print("Qual a dificuldade do jogo?: F(Fácil); N(Normal); D(Dificíl"))
            String dificuldadeJogo in.next();

            switch (dificuldadeJogo){
                case "F":
                    System.out.println(listaPalavrasFacil)();
                    break;
                case "N":
                    System.out.println(listaPalavrasNormal)();
                    break;
                case "D":
                    System.out.println(listaPalavrasFacil)();
                    break;
                default:
                    System.out.println("Nenhuma tecla valida");
            }

    public static String listaPalavrasDificil(){
        String[] palavras = {"carambola","lichia","jatoba"};
        Random  random = new Random();
        return palavras[random.nextInt(palavras.length-1)];
    }
        public static String listaPalavrasNormal(){
            String[] palavras = {"abacaxi","melancia","melao"};
            Random  random = new Random();
            return palavras[random.nextInt(palavras.length-1)];
        }
        public static String listaPalavrasFacil(){
                String[] palavras = {"banana","uva","maca"};
                Random  random = new Random();
                return palavras[random.nextInt(palavras.length-1)];
            }
}

