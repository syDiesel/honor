package com.honor.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Report entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "report", catalog = "honor")
public class Report implements java.io.Serializable {

	// Fields

	private Integer id;
	private String msg;
	private Timestamp msgTime;

	// Constructors

	/** default constructor */
	public Report() {
	}

	/** minimal constructor */
	public Report(Timestamp msgTime) {
		this.msgTime = msgTime;
	}

	/** full constructor */
	public Report(String msg, Timestamp msgTime) {
		this.msg = msg;
		this.msgTime = msgTime;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "msg", length = 65535)
	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Column(name = "msg_time", nullable = false, length = 19)
	public Timestamp getMsgTime() {
		return this.msgTime;
	}

	public void setMsgTime(Timestamp msgTime) {
		this.msgTime = msgTime;
	}

}