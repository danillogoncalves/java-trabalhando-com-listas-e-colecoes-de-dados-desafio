package br.com.alura.desafio.main;

import br.com.alura.desafio.model.Card;
import br.com.alura.desafio.model.Item;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double limit = 0;
        String name;
        double price;
        int question = 1;
        Card newCard = new Card();
        System.out.print("Digite o limite do cartão: ");
        limit = input.nextDouble();
        newCard.setBalance(limit);
        while (question != 0) {
            Item newItem = new Item();
            System.out.print("Digite a descrição da compra: ");
            name = input.next();
            newItem.setName(name);
            System.out.print("Digite o valor da compra: ");
            price = input.nextDouble();
            newCard.debitBalance(price);
            if (!newCard.isPositiveBalance()) {
                System.out.println(newCard);
                break;
            }
            newItem.setPrice(price);
            newCard.setShopping(newItem);
            System.out.println("Compra realizada!");
            System.out.println("Digite 0 para sair ou 1 para continuar");
            question = input.nextInt();
        }
        if (newCard.isPositiveBalance()) {
            System.out.println(newCard);
        }
    }
}
