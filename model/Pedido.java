package com.pizzaria.model;

import java.util.List;

public class Pedido {
    private String cliente;
    private String pizza;
    private List<String> adicionais;
    private double total;

    // Getters e Setters
    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }

    public String getPizza() { return pizza; }
    public void setPizza(String pizza) { this.pizza = pizza; }

    public List<String> getAdicionais() { return adicionais; }
    public void setAdicionais(List<String> adicionais) { this.adicionais = adicionais; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
}
