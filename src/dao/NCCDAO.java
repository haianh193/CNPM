/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.NCC;
import java.sql.*;

/**
 *
 * @author HAIANHPC
 */
public class NCCDAO extends DAO{

    public NCCDAO() {
    }
    
    public ArrayList<NCC> timNhaCC(String s){
        ArrayList<NCC> listNCC = new ArrayList<>();
        String sql = "SELECT * FROM qlnhaphang.tblnhacungcap where ten LIKE ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + s + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                NCC ncc = new NCC();
                ncc.setId(rs.getInt("id"));
                ncc.setTen(rs.getString("ten"));
                ncc.setSdt(rs.getString("sdt"));
                ncc.setDiachi(rs.getString("diachi"));
                listNCC.add(ncc);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return listNCC;
    }
    
    public int themMoiNCC(NCC ncc){
        String sql = "INSERT INTO tblnhacungcap(ten, sdt, diachi) VALUES(?,?,?)";
        int result = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ncc.getTen());
            ps.setString(2, ncc.getSdt());
            ps.setString(3, ncc.getDiachi());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return result;
    }
}
