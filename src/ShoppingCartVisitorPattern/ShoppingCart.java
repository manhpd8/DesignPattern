/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShoppingCartVisitorPattern;

import java.util.List;


/**
 *
 * @author Phạm Đức Mạnh
 */
public interface ShoppingCart {
    public void addToCard(Sach sach);
    public void addToCard(QuanAo quanAo);
    public void addToCard(DoDienTu doDienTu);
    public float totalFree();
    public int numberItem();
}
