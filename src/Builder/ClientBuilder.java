/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Product.Client;

/**
 *
 * @author Phạm Đức Mạnh
 */
public interface ClientBuilder {

    /**
     *
     * @return
     */
    public ClientBuilder name(String name);
    public ClientBuilder email(String email);
    public ClientBuilder address(String address);
    public ClientBuilder pass(String pass);
    public ClientBuilder loaiKH(String loaiKH);
    public Client build();
}
