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
public class HoaDonNhap implements Serializable{
    private int id;
    private Date ngayNhapKho;

    public HoaDonNhap() {
    }

    public HoaDonNhap(int id, Date ngayNhapKho) {
        this.id = id;
        this.ngayNhapKho = ngayNhapKho;
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
    
}
