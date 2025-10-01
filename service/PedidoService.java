package com.pizzaria.service;

import com.pizzaria.model.Pedido;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    private Pedido pedidoAtual;

    public void salvarPedido(Pedido pedido) {
        this.pedidoAtual = pedido;
    }

    public Pedido getPedidoAtual() {
        return pedidoAtual;
    }

    public String finalizarPedido() {
        if (pedidoAtual == null) {
            return "Nenhum pedido para finalizar.";
        }
        return "Pedido finalizado com sucesso para " + pedidoAtual.getCliente();
    }
}
