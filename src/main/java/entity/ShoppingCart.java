package entity;

import lombok.Getter;
import lombok.ToString;
import util.AuthHolder;

@Getter
@ToString
public class ShoppingCart {
    private String name;
    private double price;
    private int quantity;
    private  User user;

    public ShoppingCart(String name, double price, int quantity, User user) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.user =user;
    }
}
