package model;

import java.io.Serializable;
import java.sql.Date;

public class MatHang implements Serializable{
	private int id;
	private String ten;
        private String mota;
        private double giaMatHang;
        private CuaHang cuaHang;
        private NCC nhaCC;

    public MatHang() {
    }

    public MatHang(int id, String ten, String mota, double giaMatHang, CuaHang cuaHang, NCC nhaCC) {
        this.id = id;
        this.ten = ten;
        this.mota = mota;
        this.giaMatHang = giaMatHang;
        this.cuaHang = cuaHang;
        this.nhaCC = nhaCC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public double getGiaMatHang() {
        return giaMatHang;
    }

    public void setGiaMatHang(double giaMatHang) {
        this.giaMatHang = giaMatHang;
    }

    public CuaHang getCuaHang() {
        return cuaHang;
    }

    public void setCuaHang(CuaHang cuaHang) {
        this.cuaHang = cuaHang;
    }

    public NCC getNhaCC() {
        return nhaCC;
    }

    public void setNhaCC(NCC nhaCC) {
        this.nhaCC = nhaCC;
    }
    
    public Object[] toObject(){
        return new Object[]{getId(), getTen(), getMota(), getGiaMatHang(), getNhaCC().getTen()};
    }
}

