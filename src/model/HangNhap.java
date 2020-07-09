/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author HAIANHPC
 */
public class HangNhap implements Serializable{
    private int id;
    private Date ngayNhapKho;
    private Date hsd;
    private MatHang matHang;
    private HoaDonNhap hoaDonNhap;

    public HangNhap() {
    }

    public HangNhap(int id, Date ngayNhapKho, Date hsd, MatHang matHang, HoaDonNhap hoaDonNhap) {
        this.id = id;
        this.ngayNhapKho = ngayNhapKho;
        this.hsd = hsd;
        this.matHang = matHang;
        this.hoaDonNhap = hoaDonNhap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }

    public Date getHsd() {
        return hsd;
    }

    public void setHsd(Date hsd) {
        this.hsd = hsd;
    }

    public MatHang getMatHang() {
        return matHang;
    }

    public void setMatHang(MatHang matHang) {
        this.matHang = matHang;
    }

    public HoaDonNhap getHoaDonNhap() {
        return hoaDonNhap;
    }

    public void setHoaDonNhap(HoaDonNhap hoaDonNhap) {
        this.hoaDonNhap = hoaDonNhap;
    }
    
    
    
}
