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
public class NhanVienFactory {
    public NhanVien themNhanVien(String loaiNV){
        if(loaiNV == null){
            return null;
        }
        switch (loaiNV) {
            case "NVBH":
                return new NVBanHang();
            case "NVK":
                return new NVKho();
            case "NVGH":
                return new NVGiaoHang();
            default:
                return null;
        }

    }
}
