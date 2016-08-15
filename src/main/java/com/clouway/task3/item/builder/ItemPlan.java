package com.clouway.task3.item.builder;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public interface ItemPlan {

    void setProductName(String name);
    void setMeasureUnit(String unit);
    void setQuantity(double quantity);
    void setPrice(double price);

}
