package model;

import java.io.Serializable;

public class NhanVien implements Serializable{
	private int id;
	private String tendangnhap;
	private String matkhau;
	private String ten;
	private String chucvu;
        private CuaHang cuaHang;

    public NhanVien() {
    }

    public NhanVien(int id, String tendangnhap, String matkhau, String ten, String chucvu, CuaHang cuaHang) {
        this.id = id;
        this.tendangnhap = tendangnhap;
        this.matkhau = matkhau;
        this.ten = ten;
        this.chucvu = chucvu;
        this.cuaHang = cuaHang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public CuaHang getCuaHang() {
        return cuaHang;
    }

    public void setCuaHang(CuaHang cuaHang) {
        this.cuaHang = cuaHang;
    }
    
    
}
