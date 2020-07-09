package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.NhanVien;

public class UserDAO extends DAO{
	
	public UserDAO() {
		super();
	}
	
	public boolean checkLogin(NhanVien user) {
		boolean result = false;
		String sql = "SELECT ten,chucvu FROM tblnhanvien WHERE tendangnhap = ? AND matkhau = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getTendangnhap());
			ps.setString(2, user.getMatkhau());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				user.setTen(rs.getString("ten"));
				user.setChucvu(rs.getString("chucvu"));
				result = true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
