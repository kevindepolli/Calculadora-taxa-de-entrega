/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes;

/**
 *
 * @author Kevin
 */
public class CalculadoraDistanciaPadrao implements ICalculadoraDistancia {
    private float distanciaPadrao;

    public CalculadoraDistanciaPadrao(float distanciaPadrao) {
        this.distanciaPadrao = distanciaPadrao;
    }
    
    @Override
    public void calcularDistancia(Pedido pedido){
        pedido.setDistancia(distanciaPadrao);
    }
}
