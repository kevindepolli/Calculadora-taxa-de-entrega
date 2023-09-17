/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes;

/**
 *
 * @author Kevin
 */
public class CalculadoraTaxaEntregaPadrao implements ICalculadoraTaxaEntrega{
    private double fatorPadrao;

    public CalculadoraTaxaEntregaPadrao(double fatorPadrao) {
        this.fatorPadrao = fatorPadrao;
    }

    public double getFatorPadrao() {
        return fatorPadrao;
    }

    public void setFatorPadrao(double fatorPadrao) {
        this.fatorPadrao = fatorPadrao;
    }
    
    @Override
    public void calcularTaxaEntrega(Pedido pedido){
        if(pedido.getTaxaEntrega() == -1)
            pedido.setTaxaEntrega(fatorPadrao);
    }
}
