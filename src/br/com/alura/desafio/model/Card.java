package br.com.alura.desafio.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Card {

    private double balance;

    private List<Item> shopping = new ArrayList();

    private boolean positiveBalance = true;

    private String message;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setShopping(Item item) {
        this.shopping.add(item);
    }

    public boolean isPositiveBalance() {
        return positiveBalance;
    }

    public void debitBalance(double value) {
        if (value > this.balance) {
            this.positiveBalance = false;
        } else {
            this.balance -= value;
            this.positiveBalance = true;
        }
    }

    @Override
    public String toString() {
        this.message = "";
        if (!this.positiveBalance) {
            this.message += "Saldo insuficiente!\n\n";
        }
        this.message += "COMPRAS REALIZADAS:\n\n";
        Collections.sort(this.shopping, Collections.reverseOrder());
        this.shopping.forEach(item -> {
            this.message += item.toString() + "\n\n";
        });
        this.message += "Saldo do cartão: " + this.getBalance();
        return this.message;
    }
}
