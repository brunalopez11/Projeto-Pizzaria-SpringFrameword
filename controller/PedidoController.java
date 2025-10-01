package com.pizzaria.controller;

import com.pizzaria.model.Pedido;
import com.pizzaria.service.PedidoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedido")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping("/enviar")
    public String enviarPedido(@RequestBody Pedido pedido) {
        pedidoService.salvarPedido(pedido);
        return "Pedido recebido com sucesso!";
    }

    @GetMapping("/resumo")
    public Pedido resumoPedido() {
        return pedidoService.getPedidoAtual();
    }

    @PostMapping("/checkout")
    public String checkout() {
        return pedidoService.finalizarPedido();
    }
}
