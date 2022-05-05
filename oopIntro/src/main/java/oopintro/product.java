/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopintro;

/**
 *
 * @author HP
 */
public class product {

    private int id;
    private String name;
    private double price;
    private String detail;

    public product(int id, String name, double price, String detail) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.detail = detail;
    }
    public product(){
        
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

   

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * @param detail the detail to set
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }
}
