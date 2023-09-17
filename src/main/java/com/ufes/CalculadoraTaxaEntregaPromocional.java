/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes;

/**
 *
 * @author Kevin
 */
public class CalculadoraTaxaEntregaPromocional implements ICalculadoraTaxaEntrega{
    private double fatorPromocional;

    public CalculadoraTaxaEntregaPromocional() {
    }

    public CalculadoraTaxaEntregaPromocional(double fatorPromocional) {
        this.fatorPromocional = fatorPromocional;
    }

    public double getFatorPromocional() {
        return fatorPromocional;
    }

    public void setFatorPromocional(double fatorPromocional) {
        this.fatorPromocional = fatorPromocional;
    }
    
    @Override
    public void calcularTaxaEntrega(Pedido pedido){
        if(pedido.isPromocao())
            pedido.setTaxaEntrega(fatorPromocional);
    }
    
}
