package edu.chl.hajo.shop.core;

import edu.chl.hajo.shop.persistence.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 A Product

 @author hajo
 */
@Entity
public class Product extends AbstractEntity {

    @Getter
    @Setter
    @Column(nullable = false)
    private String name;
    @Getter
    @Setter
    @Column(nullable = false)
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(Long id, String name, double price) {
        super(id);
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + getId() + ", name=" + name + ", price=" + price + '}';
    }
}
