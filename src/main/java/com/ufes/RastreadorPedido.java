/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes;

/**
 *
 * @author Kevin
 */
public class RastreadorPedido {
    private Pedido pedido;

    public RastreadorPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public void atualizarParaEmTransito(){
        pedido.setStatus("Em transito");
    }
    
    public void atualizarParaEntregue(){
        pedido.setStatus("Entregue");
    }
}
