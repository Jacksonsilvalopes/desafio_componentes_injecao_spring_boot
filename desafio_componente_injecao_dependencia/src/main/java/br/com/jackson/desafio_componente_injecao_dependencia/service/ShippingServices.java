package br.com.jackson.desafio_componente_injecao_dependencia.service;

import br.com.jackson.desafio_componente_injecao_dependencia.entity.Order;
import br.com.jackson.desafio_componente_injecao_dependencia.service.shippingcalculations.*;
import org.springframework.stereotype.Service;

@Service
public class ShippingServices {
    public Double shipment(Order order) {
        Shipping result = new BelowAHundre(new AboveOneHundredBelowTwoHundred(new OverTwoHundred(new End(null))));
        return result.shipment(order);
    }
}
