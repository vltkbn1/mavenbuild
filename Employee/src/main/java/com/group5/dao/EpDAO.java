package com.group5.dao;



import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;


import com.group5.model.EpModel;
import com.group5.util.DBConnection;
import com.mysql.jdbc.PreparedStatement;

public class EpDAO {
	public static ArrayList<EpModel> getEmploys(){
		Connection conn = DBConnection.getConnect();
		ArrayList<EpModel> employs = new ArrayList<EpModel>();
		
		try {
			ResultSet rs = (ResultSet) conn.prepareStatement("SELECT * FROM `qlnv`").executeQuery();
			while(rs.next()) {
				EpModel employ= new EpModel();
				employ.setId(rs.getInt("id"));
				employ.setManv(rs.getString("manv"));
				employ.setTennv(rs.getString("tennv"));
				employ.setDc(rs.getString("dc"));
				employ.setSdt(rs.getInt("sdt"));
				employs.add(employ);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employs;
	}
	public static boolean addEmploys(EpModel employ) {
		Connection conn = DBConnection.getConnect();
		try {
			String sql = "INSERT INTO `qlnv`(`id`, `manv`, `tennv`, `dc`, `sdt`) VALUES ('"+employ.getId()+"','"+employ.getManv()+"','"+employ.getTennv()+"','"+employ.getDc()+"','"+employ.getSdt()+"')";
			PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
			statement.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	public static EpModel getEmployById(int  id){
		Connection conn = DBConnection.getConnect();
		EpModel employ= new EpModel();
		
		try {
			ResultSet rs = (ResultSet) conn.prepareStatement("SELECT * FROM `qlnv` WHERE id="+id).executeQuery();
			while(rs.next()) {
				
				employ.setId(rs.getInt("id"));
				employ.setManv(rs.getString("manv"));
				employ.setTennv(rs.getString("tennv"));
				employ.setDc(rs.getString("dc"));
				employ.setSdt(rs.getInt("sdt"));
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employ;
	}
public static boolean editEmploys(EpModel employ) {
		Connection conn = DBConnection.getConnect();
		try {
			String sql = "UPDATE `qlnv` SET `id`='"+employ.getId()+"',`manv`='"+employ.getManv()+"',`tennv`='"+employ.getTennv()+"',`dc`='"+employ.getDc()+"',`sdt`='"+employ.getSdt()+"' WHERE `id`='"+employ.getId()+"' ";
			
			PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
			statement.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
public static boolean deleteEmploys(EpModel employ) {
	Connection conn = DBConnection.getConnect();
	try {
		String sql = "DELETE FROM `qlnv` WHERE `id`='"+employ.getId()+"' ";
		
		PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
		statement.executeUpdate();
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Size cua mang: "+getEmploys().size());
		System.out.println();
	}
}

