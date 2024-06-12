package entity;

import enumerator.ProductType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Warehouse {
    private Integer code;
    private String name;
    private ProductType productType;
    private double price;
    private Integer quantity;
}
