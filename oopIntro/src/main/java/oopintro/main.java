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
public class main {
    public static void main(String[] args) {
        product product1 = new product();
        product1.setId(1);
        product1.setDetail("very nice pc");
        product1.setName("HP PAVILION");
        product1.setPrice(6000);
        product[] products ={product1};
        System.out.println(products.length); 
        System.out.println(product1.getName());
        String a = product1.getDetail();
        System.out.println(a);
         
         
    }
   
   
}
