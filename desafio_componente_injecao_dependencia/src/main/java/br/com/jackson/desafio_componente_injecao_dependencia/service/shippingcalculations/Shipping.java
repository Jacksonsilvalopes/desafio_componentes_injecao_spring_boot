package br.com.jackson.desafio_componente_injecao_dependencia.service.shippingcalculations;

import br.com.jackson.desafio_componente_injecao_dependencia.entity.Order;

public abstract class Shipping {

    protected Shipping next;

    public Shipping(Shipping next) {
        this.next = next;
    }

    public abstract  Double shipment(Order order);
}
