package model;

import java.util.ArrayList;

public class Cofrinho {
    private final ArrayList<Moeda> listaMoedas = new ArrayList<>();

    public void adicionar(Moeda moeda){
        this.listaMoedas.add(moeda);
    }

    public boolean remover(Moeda moeda){
        return this.listaMoedas.remove(moeda);
    }

    public void listagemMoedas(){
        if (listaMoedas.isEmpty()){
            System.out.println("O cofrinho está vazio.");
        }
        for (Moeda moeda : listaMoedas){
            System.out.println(moeda.info());
        }
    }

    public double totalConvertido(){
        return this.listaMoedas.stream()
                .mapToDouble(Moeda::converter)
                .sum();
    }
}