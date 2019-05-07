/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PayStrategyPattern;

import java.util.Date;

/**
 *
 * @author Phạm Đức Mạnh
 */
public class PayDelivery extends Payment{
    Date ngayTra;

    @Override
    public void Pay(Order order) {
        super.Pay(order); //To change body of generated methods, choose Tools | Templates.
    }
}
