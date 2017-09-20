package com.jc.bbs;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
public class Article {
	
	private int id;
	private int pid;
	private int rootId;
	private String title;
	private String cont;
	private Timestamp pdate;
	private boolean isLeaf;
	private int grade;
	
	public int getGrade() {
		return this.grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return this.pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getRootId() {
		return this.rootId;
	}
	public void setRootId(int rootId) {
		this.rootId = rootId;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCont() {
		return this.cont;
	}
	public void setCont(String cont) {
		this.cont = cont;
	}
	public Timestamp getPdate() {
		return this.pdate;
	}
	public void setPdate(Timestamp timestamp) {
		this.pdate = timestamp;
	}
	public boolean isLeaf() {
		return this.isLeaf;
	}
	public void setLeaf(boolean isLeaf) {
		this.isLeaf = isLeaf;
	}
	
	public void initFromRs(ResultSet rs) {
		try {
			setId(rs.getInt("id"));
		    setPid(rs.getInt("pid"));
		    setRootId(rs.getInt("rootid"));
		    setTitle(rs.getString("title"));
		    setLeaf(rs.getInt("isleaf") == 0);
		    setPdate(rs.getTimestamp("pdate"));
		    setCont(rs.getString("cont"));
		    setGrade(0);
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
