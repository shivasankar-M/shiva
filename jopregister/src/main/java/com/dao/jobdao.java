package com.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.dbconnection.jobdb;

import com.model.jobrecord;

public class jobdao {
	
	Statement stmt;
    PreparedStatement ps;
    ResultSet rs;
    Connection dbcon;
    int count=0;
    
    public jobdao() {


    	try {
            dbcon = jobdb.getConnection();
            if (dbcon == null) {
                throw new SQLException("Database connection is null. Check your DBconnection class.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
    
    
   
    public int addUser(jobrecord jr) {
        if (dbcon == null) {
            System.out.println("Database connection is not initialized.");
            return 0;
        }
        try {
            ps = dbcon.prepareStatement("INSERT INTO candidatedata (name,email,mobile,collegename,degree,yearofgraduation,applyrole,experience,currentctc,expctc,noticeperiod,skillset,address,nativedist,state,nationality) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
            
            ps.setString(1, jr.getName());
            ps.setString(2, jr.getEmail());
            ps.setString(3, jr.getMobile());
            ps.setString(4, jr.getCollegename());
            ps.setString(5, jr.getDegree());
            ps.setInt(6, jr.getYearofgraduation());
            ps.setString(7, jr.getApplyrole());
            ps.setInt(8, jr.getExperience());
            ps.setInt(9, jr.getCurrentctc());
            ps.setInt(10, jr.getExpctc());
            ps.setString(11, jr.getNoticeperiod());
            ps.setString(12, jr.getSkillset());
            ps.setString(13, jr.getAddress());
            ps.setString(14, jr.getNativedist());
            ps.setString(15, jr.getState());
            ps.setString(16, jr.getNationality());

            count = ps.executeUpdate();
            System.out.println("Query executed successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    
}
