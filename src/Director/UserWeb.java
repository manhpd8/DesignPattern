/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Director;

import ConcreteBuilder.ClientBuilderImpl;
import Product.Client;

/**
 *
 * @author Phạm Đức Mạnh
 */
public class UserWeb {
    public void main1(){
        Client client = new ClientBuilderImpl().name("nguyen van a").address("address1").email("email").build();
    }
}
