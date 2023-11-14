package br.com.jackson.desafio_componente_injecao_dependencia.service;

import br.com.jackson.desafio_componente_injecao_dependencia.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingServices shippingServices;


    public double total(Order order) {

        Double total = order.getBasic()
                - (order.getBasic() * order.getDiscount() / 100)
                + shippingServices.shipment(order);
        return total;

    }
}
