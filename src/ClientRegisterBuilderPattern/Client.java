/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientRegisterBuilderPattern;

/**
 *
 * @author Phạm Đức Mạnh
 */
public class Client {
    private int id;
    private String name;
    private String pass;
    private int age;
    private String address;
    private String email;
    private String loaiKH;

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public Client(String name, String pass, int age, String address, String email, String loaiKH) {
        this.name = name;
        this.pass = pass;
        this.age = age;
        this.address = address;
        this.email = email;
        this.loaiKH = loaiKH;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getLoaiKH() {
        return loaiKH;
    }
    
}
