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
public class ShoppingCartImpl implements ShoppingCart{
    List<Item> listItem = null;
    @Override
    public void addToCard(Sach sach) {
        //to do add sach to cart
        listItem.add(sach);

    }

    @Override
    public void addToCard(QuanAo quanAo) {
        //to do add quanAo to cart
        listItem.add(quanAo);
        
    }

    @Override
    public void addToCard(DoDienTu doDienTu) {
        //to do add dodientu to cart
        listItem.add(doDienTu);
       
    }

    @Override
    public float totalFree() {
        if(listItem == null) return 0;
        float free=0;
        for(int i=0;i<listItem.size();i++){
            free += listItem.get(i).giaBan;
        }
        return free;
    }

    @Override
    public int numberItem() {
        
        if(listItem == null) return 0;
        return listItem.size()+1;
    }
}
