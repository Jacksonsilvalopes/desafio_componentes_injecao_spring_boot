package br.com.jackson.desafio_componente_injecao_dependencia.service.shippingcalculations;

import br.com.jackson.desafio_componente_injecao_dependencia.entity.Order;

public class BelowAHundre extends Shipping {
    public BelowAHundre(Shipping next) {
        super(next);
    }

    @Override
    public Double shipment(Order order) {
        if(order.getBasic() < 100.00){
            return 20.00;
        }
        return next.shipment(order);
    }
}
