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
public class Manager {
    public static void main(String[] args) {
        new NhanVienFactory().themNhanVien("NVBH");
        new NhanVienFactory().themNhanVien("NVK");
        new NhanVienFactory().themNhanVien("NVGH");
    }
}
