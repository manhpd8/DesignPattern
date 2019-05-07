/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShoppingCartVisitorPattern;

/**
 *
 * @author Phạm Đức Mạnh
 */
public class ShoppingCartVisittorPattern {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCartImpl();
        System.out.println("tong so san pham trong gio:"+ shoppingCart.numberItem());
        System.out.println("tong so tien:"+shoppingCart.totalFree());
    }
}
