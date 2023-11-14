package br.com.jackson.desafio_componente_injecao_dependencia.service.shippingcalculations;

import br.com.jackson.desafio_componente_injecao_dependencia.entity.Order;

public class AboveOneHundredBelowTwoHundred extends Shipping {
    public AboveOneHundredBelowTwoHundred(Shipping next) {
        super(next);
    }

    @Override
    public Double shipment(Order order) {
        if(order.getBasic() > 100.0 & order.getBasic() < 200.0){
            return 12.0;
        }
        return next.shipment(order);
    }


}
