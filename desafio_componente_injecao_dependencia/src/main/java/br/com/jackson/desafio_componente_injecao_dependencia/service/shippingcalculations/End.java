package br.com.jackson.desafio_componente_injecao_dependencia.service.shippingcalculations;

import br.com.jackson.desafio_componente_injecao_dependencia.entity.Order;

public class End extends Shipping {
    public End(Shipping next) {
        super(null);
    }

    @Override
    public Double shipment(Order order) {
        return 1.0;
    }
}
