package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOimpl implements IEmployeeDAO {
	private static final String EMP_INSERT_QUERY = "INSERT INTO REALTIMEDI_SPRING_EMPLOYEE(ENAME,DESG,BASICSALARY,GROSSSALARY,NETSALARY)VALUES(?,?,?,?,?)";
	int result ;
	private DataSource ds;
	
	 Connection con = null;
	 PreparedStatement ps= null;
	

	public EmployeeDAOimpl(DataSource ds) {
		super();
		this.ds = ds;
	}
	
	
	public int insertEmployee(EmployeeBO bo) throws Exception {
		
		try(Connection con=ds.getConnection();
				PreparedStatement ps =con.prepareStatement(EMP_INSERT_QUERY);
				){
			ps.setString(1,bo.geteName());
			ps.setString(2,bo.getDesg());
			ps.setFloat(3,bo.getBasicSalary());
			ps.setFloat(4,bo.getGrossSalary());
			ps.setFloat(5,bo.getNetSalary());
			
			 result = ps.executeUpdate();
			
		}
		catch (SQLException se) {
			se.printStackTrace();
			throw se;
		}
		return result;
	}

/* *
 * 	public int insertEmployee(EmployeeBO bo) throws Exception {
		try {
				con= ds.getConnection();
				ps = con.prepareStatement(EMP_INSERT_QUERY);
				ps.setString(1,bo.geteName());
				ps.setString(2,bo.getDesg());
				ps.setFloat(3,bo.getBasicSalary());
				ps.setFloat(4,bo.getGrossSalary());
				ps.setFloat(5,bo.getNetSalary());
				
				 result = ps.executeUpdate();
				
				
		} 
		catch (SQLException se) {
			se.printStackTrace();
			throw se;
		}catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		finally {
			try {
				if (ps!=null) {
					ps.close();
				}
				
			} catch ( SQLException e2) {
				e2.printStackTrace();
			}
			try {
				if (con!=null) {
					con.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			ps.close();
			con.close();
		}
		return result;
	}
 */

}
