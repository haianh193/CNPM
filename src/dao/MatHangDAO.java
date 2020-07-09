/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.MatHang;
import model.NCC;
import java.sql.*;


/**
 *
 * @author HAIANHPC
 */
public class MatHangDAO extends DAO{
    public MatHangDAO(){
        super();
    }
    
    public ArrayList<MatHang> layMatHang(int id, String key){
        ArrayList<MatHang> listMatHang = new ArrayList<>();
        String sql = "SELECT * FROM qlnhaphang.tblmathang where tblnccId = ? and ten LIKE ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, "%" + key + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                MatHang matHang = new MatHang();
                matHang.setId(rs.getInt("id"));
                matHang.setTen(rs.getString("ten"));
                matHang.setMota(rs.getString("mota"));
                matHang.setGiaMatHang(rs.getDouble("giamathang"));
                listMatHang.add(matHang);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return listMatHang;
    }
    
    public int themMoiMH(MatHang matHang){
        String sql = "INSERT INTO tblmathang(ten,cuahangid, tblnccId,mota,giamathang) VALUES(?,?,?,?,?)";
        int result = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, matHang.getTen());
            ps.setInt(2, 1);
            ps.setInt(3, matHang.getNhaCC().getId());
            ps.setString(4, matHang.getMota());
            ps.setDouble(5, matHang.getGiaMatHang());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return result;
    }
}
