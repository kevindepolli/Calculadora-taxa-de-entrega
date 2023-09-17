/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes;

/**
 *
 * @author Kevin
 */
public class CalculadoraDistanciaAPI implements ICalculadoraDistancia {
    @Override
    public void calcularDistancia(Pedido pedido){
        //aqui seria feita uma requisição, para um serviço que calcula distancia entre endereços, passando o endereço de entrega e o endereço do restaurante. O retorno seria passado para o atributo distancia do pedido.
        var retornoAPI = 1000;
        pedido.setDistancia(retornoAPI);
    }
}
