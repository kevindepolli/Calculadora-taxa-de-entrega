/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kevin
 */
public class ProcessadorPedido {
    private Pedido pedido;
    private List<ICalculadoraTaxaEntrega> calculadorasTaxaEntrega;
    private ICalculadoraDistancia calculadoraDistancia;

    public ProcessadorPedido(Pedido pedido, ICalculadoraDistancia calculadoraDistancia, double fatorPromocional, double fatorPadrao, double fatorDistancia) {
        this.pedido = pedido;
        calculadorasTaxaEntrega = new ArrayList<>();
        calculadorasTaxaEntrega.add(new CalculadoraTaxaEntregaPromocional(fatorPromocional));
        calculadorasTaxaEntrega.add(new CalculadoraTaxaEntregaPadrao(fatorPadrao));
        calculadorasTaxaEntrega.add(new CalculadoraTaxaEntregaDistancia(fatorDistancia));
        
        this.calculadoraDistancia = calculadoraDistancia;
        calculadoraDistancia.calcularDistancia(pedido);
    }
    
    public ProcessadorPedido(Pedido pedido, ICalculadoraDistancia calculadoraDistancia) {
        this.pedido = pedido;
        calculadorasTaxaEntrega = new ArrayList<>();
        calculadorasTaxaEntrega.add(new CalculadoraTaxaEntregaPromocional(5));
        calculadorasTaxaEntrega.add(new CalculadoraTaxaEntregaPadrao(10));
        calculadorasTaxaEntrega.add(new CalculadoraTaxaEntregaDistancia(1));
        
        this.calculadoraDistancia = calculadoraDistancia;
        calculadoraDistancia.calcularDistancia(pedido);
    }
    
    public ProcessadorPedido(Pedido pedido, float distanciaPadrao) {
        this.pedido = pedido;
        calculadorasTaxaEntrega = new ArrayList<>();
        calculadorasTaxaEntrega.add(new CalculadoraTaxaEntregaPromocional(5));
        calculadorasTaxaEntrega.add(new CalculadoraTaxaEntregaPadrao(10));
        calculadorasTaxaEntrega.add(new CalculadoraTaxaEntregaDistancia(1));
        
        calculadoraDistancia = new CalculadoraDistanciaPadrao(distanciaPadrao);
        calculadoraDistancia.calcularDistancia(pedido);
    }
    
    public void processar(){
        for(ICalculadoraTaxaEntrega calculadora : calculadorasTaxaEntrega)
            calculadora.calcularTaxaEntrega(pedido);
    }

}
