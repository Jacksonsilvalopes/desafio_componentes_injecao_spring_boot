package br.com.jackson.desafio_componente_injecao_dependencia.service.shippingcalculations;

import br.com.jackson.desafio_componente_injecao_dependencia.entity.Order;

public  class OverTwoHundred extends Shipping{
    public OverTwoHundred(Shipping next) {
        super(next);
    }

    @Override
    public Double shipment(Order order) {
        if(order.getBasic() > 200.00){
            return 0.00;
        }
        return next.shipment(order);
    }
}
