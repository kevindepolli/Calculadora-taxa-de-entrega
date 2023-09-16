package com.ufes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kevin
 */
public class calculadoraTaxaEntregaPromocional implements ICalculadoraTaxaEntrega{
    private double fatorPromocional;

    public calculadoraTaxaEntregaPromocional(double fatorPromocional) {
        this.fatorPromocional = fatorPromocional;
    }

    public double getFatorPromocional() {
        return fatorPromocional;
    }

    public void setFatorPromocional(double fatorPromocional) {
        this.fatorPromocional = fatorPromocional;
    }

    @Override
    public void calcularTaxaEntrega(Pedido pedido)
    {
        if(pedido.isPromocao())
            pedido.setTaxaEntrega(fatorPromocional);
    }
    
}
