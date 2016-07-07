package bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import global.Constants;
import global.DatabaseFactory;
import global.Vendor;

/**
 * @date   : 2016. 7. 6.
 * @author : 신재현
 * @file   : AccountDAO.java
 * @story   :
 */

public class AccountDAO {

	private static AccountDAO instance = new AccountDAO();
	private	Connection con;
	private	ResultSet rs;
	private	PreparedStatement pstmt;
	private AccountDAO() {
				con = DatabaseFactory.createDatabase(Vendor.ORACLE, 
					Constants.USER_ID, 
					Constants.USER_PW).getConnection();
		}
	public static AccountDAO getInstance() {
	return instance;
}
	
	public int insertAccount(AccountBean acc) {
		// 계좌개설
		int result = 0;
		String sql = "insert into account (id, account_no, money) "
				+ "values(?,?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, acc.getId());
			pstmt.setInt(2, acc.getAccountNo());
			pstmt.setInt(3, acc.getMoney());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return result;
	}
	
	public int getRestMoney(int accountNo) {
		String sql = "select money from account where account_no = ?";
		int money = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, accountNo);
			rs = pstmt.executeQuery();
			if(rs.next()){
				money = rs.getInt("MONEY");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return money;
	}
	
	public void deposit(AccountBean bean) {
		// 입급
		
		String sql = "update account set money=? where account_no = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bean.getMoney());
			pstmt.setInt(2, bean.getAccountNo());
			 pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void withdraw(AccountBean acc) {
		// 출금
		this.deposit(acc);
		}

	
	public int selectMoney(int accNo) {
		int money = 0;
		String sql = "select money from account where account_no=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, accNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				money = rs.getInt("MONEY");
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return money;
	}
	public int deleteAccount(int accountNo) {
		// TODO Auto-generated method stub
		int result = 0;
		String sql = "delete from account where account_no=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, accountNo);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	public int count() {
		// 전체통장수
		int result = 0;
		String sql = "select count(*) as count from account_member";
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
		if (rs.next()) {
			result = rs.getInt("count");
		}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return result;
	}
	
	
}
