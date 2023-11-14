package br.com.jackson.desafio_componente_injecao_dependencia;

import br.com.jackson.desafio_componente_injecao_dependencia.entity.Order;
import br.com.jackson.desafio_componente_injecao_dependencia.service.OrderService;
import br.com.jackson.desafio_componente_injecao_dependencia.service.ShippingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DesafioComponenteInjecaoDependenciaApplication implements CommandLineRunner {


    @Autowired
    private OrderService orderService;

    @Autowired
    private ShippingServices shippingServices;


    public static void main(String[] args) {
        SpringApplication.run(DesafioComponenteInjecaoDependenciaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println(" ");

        System.out.printf("Codigo:");
        Integer codigo = sc.nextInt();

        System.out.printf("Valor Básico:");
        Double basic = sc.nextDouble();

        System.out.printf("Desconto:");
        Double discount = sc.nextDouble();

        Order order = new Order(codigo, basic, discount);

        Double total = orderService.total(order);

        System.out.println(" ");

        System.out.println("Pedido código " + order.getCode());
        System.out.printf("Valor total: R$ %.2f", total);

    }
}
