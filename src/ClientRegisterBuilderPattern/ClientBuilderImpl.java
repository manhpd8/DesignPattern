/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientRegisterBuilderPattern;

import ClientRegisterBuilderPattern.ClientBuilder;

/**
 *
 * @author Phạm Đức Mạnh
 */
public class ClientBuilderImpl implements ClientBuilder{
    private int id;
    private String name;
    private String pass;
    private int age;
    private String address;
    private String email;
    private String loaiKH;
    
    @Override
    public ClientBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public ClientBuilder email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public ClientBuilder address(String address) {
        this.address = address;
        return this;
    }

    @Override
    public ClientBuilder pass(String pass) {
        this.pass = pass;
        return this;
    }

    @Override
    public ClientBuilder loaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
        return this;
    }

    @Override
    public Client build() {
        return new Client(name, pass, age, address, email, loaiKH);
    }

}
