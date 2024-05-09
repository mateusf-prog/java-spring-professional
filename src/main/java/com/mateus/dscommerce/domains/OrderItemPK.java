package com.mateus.dscommerce.domains;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

/**
 * Essa é uma abordagem quando se tem um duas FK que forma a PK de uma entidade.
 * Neste caso, essa classe representa a associação entre Order e Product;
 * Na tabela do banco irá ser criada as colunas "order_id e product_id" cada uma com as PK's  de suas tabelas
 * A anotação @Embeddable é usada para indicar que essa classe é uma classe incorporável, o que significa que seus atributos(Order e Product)
 * podem ser incorporados em outras entidades
 */

@Embeddable
public class OrderItemPK {

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public OrderItemPK() {
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderItemPK that = (OrderItemPK) o;
        return Objects.equals(order, that.order) && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(order);
        result = 31 * result + Objects.hashCode(product);
        return result;
    }
}
