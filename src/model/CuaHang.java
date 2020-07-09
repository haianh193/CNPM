/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author HAIANHPC
 */
public class CuaHang implements Serializable{
    private int id;
    private String ten;
    private String diaChi;
    private String moTa;

    public CuaHang() {
    }

    public int getId() {
        return id;
    }

    public CuaHang(int id, String ten, String diaChi, String moTa) {
        this.id = id;
        this.ten = ten;
        this.diaChi = diaChi;
        this.moTa = moTa;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
}
