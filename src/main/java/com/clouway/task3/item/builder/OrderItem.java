package com.clouway.task3.item.builder;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class OrderItem implements ItemPlan {

    private String productName;
    private String measureUnit;
    private Double quantity;
    private Double price;


    @Override
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;

    }

    @Override
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public Double getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

}
