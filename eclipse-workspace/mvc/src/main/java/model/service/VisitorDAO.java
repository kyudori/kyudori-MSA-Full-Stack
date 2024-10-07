package model.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.domain.VisitorDTO;

public class VisitorDAO {
	public List<VisitorDTO> listAll() {
		Connection conn = MySQLConnect.connect();
		List<VisitorDTO> list = new ArrayList<>();
		try (Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery
				("select id, name, date_format(writedate, '%Y년 %m월 %d일') writedate, memo from visitor order by writedate desc");) {
			VisitorDTO vo;
			while(rs.next()) {
				vo = new VisitorDTO();
				vo.setId(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setWriteDate(rs.getString(3));
				vo.setMemo(rs.getString(4));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MySQLConnect.close(conn);
		}
		return list;
	}
	
	public VisitorDTO one(int id) {
		Connection conn = MySQLConnect.connect();
		VisitorDTO vo = null;
		try (Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery
				("select id, name, date_format(writedate, '%Y년 %m월 %d일') writedate, memo  from visitor where id = "+id);) {			
			if(rs.next()) {
				vo = new VisitorDTO();
				vo.setId(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setWriteDate(rs.getString(3));
				vo.setMemo(rs.getString(4));				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MySQLConnect.close(conn);
		}
		return vo;
	}
	public List<VisitorDTO> search(String keyword) {
		Connection conn = MySQLConnect.connect();
		List<VisitorDTO> list = new ArrayList<>();
		try (Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery
				("select id, name, date_format(writedate, '%Y년 %m월 %d일') writedate, memo "
						+"from visitor where memo like '%"+keyword+"%'");) {
			VisitorDTO vo;
			while(rs.next()) {
				vo = new VisitorDTO();
				vo.setId(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setWriteDate(rs.getString(3));
				vo.setMemo(rs.getString(4));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MySQLConnect.close(conn);
		}
		return list;
	}
	public boolean insert(VisitorDTO vo) {
		Connection conn = MySQLConnect.connect();
		boolean result = true;		
		try (PreparedStatement pstmt = conn.prepareStatement(
						"insert into visitor (name, writedate, memo) values (?, now(), ?)");) {  // now()
			pstmt.setString(1, vo.getName());
			pstmt.setString(2,  vo.getMemo());			
			pstmt.executeUpdate();			
		} catch (SQLException e) {
			result = false;
			e.printStackTrace();
		} finally {
			MySQLConnect.close(conn);
		}
		return result;
	}
	public boolean delete(int id) {
		Connection conn = MySQLConnect.connect();
		boolean result = true;		
		try (PreparedStatement pstmt = conn.prepareStatement(
						"delete from visitor where id = ?");) {
			pstmt.setInt(1, id); 
			int deleteNum = pstmt.executeUpdate();
			if(deleteNum != 1)
				result =false;
		} catch (SQLException e) {
			result = false;
			e.printStackTrace();
		} finally {
			MySQLConnect.close(conn);
		}
		return result;
	}
	public boolean update(VisitorDTO vo) {	
		Connection conn = MySQLConnect.connect();
		boolean result = true;
		try (PreparedStatement pstmt = conn.prepareStatement(
						"update visitor set name = ?, memo = ? where id = ?");) {
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getMemo());
			pstmt.setInt(3,  vo.getId());
			pstmt.executeUpdate();			
		} catch (SQLException e) {
			result = false;
			e.printStackTrace();
		} finally {
			MySQLConnect.close(conn);
		}
		return result;
	}
}


