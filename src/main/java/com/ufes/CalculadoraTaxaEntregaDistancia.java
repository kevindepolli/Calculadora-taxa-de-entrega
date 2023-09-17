/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes;

/**
 *
 * @author Kevin
 */
public class CalculadoraTaxaEntregaDistancia implements ICalculadoraTaxaEntrega{
    private double fatorDistancia;
    private float distanciaMinima;

    public CalculadoraTaxaEntregaDistancia() {
    }

    public CalculadoraTaxaEntregaDistancia(double fatorDistancia) {
        this.fatorDistancia = fatorDistancia;
    }

    public double getFatorDistancia() {
        return fatorDistancia;
    }

    public void setFatorDistancia(double fatorDistancia) {
        this.fatorDistancia = fatorDistancia;
    }
    
    @Override
    public void calcularTaxaEntrega(Pedido pedido){
        if(pedido.getDistancia() >= distanciaMinima)
            pedido.setTaxaEntrega(distanciaMinima * fatorDistancia); 
    }
    
}
