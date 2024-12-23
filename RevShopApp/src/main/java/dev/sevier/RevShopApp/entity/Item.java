package dev.sevier.RevShopApp.entity;
import jakarta.persistence.*;

@Entity
public class Item {
    @Id
    private Integer item_id;
    private String item_name;
    private Character item_size;
    private Integer item_quantity;
    private Double item_price;
    private String item_description;
    private String item_image;
    public Item(){

    }

    public Item(Integer item_id, String item_name, Character item_size,
                Integer item_quantity, Double item_price, String item_description, String item_image){
        this.item_id = item_id;
        this.item_name = item_name;
        this.item_size = item_size;
        this.item_quantity = item_quantity;
        this.item_price = item_price;
        this.item_description = item_description;
        this.item_image = item_image;
    }

    public String getItemImage() {
        return item_image;
    }

    public void setItemImage(String itemImage) {
        this.item_image = itemImage;
    }
    public Integer getItem_id() {
        return item_id;
    }

    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public Character getItem_size() {
        return item_size;
    }

    public void setItem_size(Character item_size) {
        this.item_size = item_size;
    }

    public Integer getItem_quantity() {
        return item_quantity;
    }

    public void setItem_quantity(Integer item_quantity) {
        this.item_quantity = item_quantity;
    }

    public Double getItem_price() {
        return item_price;
    }

    public void setItem_price(Double item_price) {
        this.item_price = item_price;
    }

    public String getItem_description() {
        return item_description;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }
    @Override
    public String toString() {
        return "Item{" +
                "item_id=" + item_id +
                ", item_name='" + item_name + '\'' +
                ", item_size='" + item_size + '\'' +
                ", item_quantity='" + item_quantity + '\'' +
                ", item_price='" + item_price + '\'' +
                ", item_description='" + item_description + '\'' +
                ", item_image='" + item_image + '\'' +
                '}';
    }

}
