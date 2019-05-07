/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThemNhanVienFactoryPattern;

/**
 *
 * @author Phạm Đức Mạnh
 */
public class NhanVien {
    int accountId;
    String name;
    int addressId;
    String loaiNV;
    float thamNien;
    float heSoLuong;
    public boolean themNhanVien(){
        //code to do them nhan vien
        return false;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getLoaiNV() {
        return loaiNV;
    }

    public void setLoaiNV(String loaiNV) {
        this.loaiNV = loaiNV;
    }

    public float getThamNien() {
        return thamNien;
    }

    public void setThamNien(float thamNien) {
        this.thamNien = thamNien;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
}
