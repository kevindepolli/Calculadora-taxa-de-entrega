/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes;

/**
 *
 * @author Kevin
 */
public class Pedido 
{
    private String cliente;
    private String enderecoEntrega;
    private double valorTotal;
    private String status;
    private boolean promocao;
	
    public Pedido(String cliente, String enderecoEntrega, boolean promocao)
    {
	this.cliente = cliente;
        this.enderecoEntrega = enderecoEntrega;
        this.promocao = promocao;
        this.status = "Pendente";
    }
}
