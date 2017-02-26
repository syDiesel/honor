package com.honor.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "orders", catalog = "honor")
public class Orders implements java.io.Serializable {

	// Fields

	private Integer id;
	private Seller seller;
	private Product product;
	private Buyer buyer;
	private Address address;
	private String code;
	private Timestamp time;
	private String assess;
	private Integer assessLevel;
	private Integer num;
	private Integer status;
	private Timestamp receTime;

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** minimal constructor */
	public Orders(Timestamp time, Timestamp receTime) {
		this.time = time;
		this.receTime = receTime;
	}

	/** full constructor */
	public Orders(Seller seller, Product product, Buyer buyer, Address address,
			String code, Timestamp time, String assess, Integer assessLevel,
			Integer num, Integer status, Timestamp receTime) {
		this.seller = seller;
		this.product = product;
		this.buyer = buyer;
		this.address = address;
		this.code = code;
		this.time = time;
		this.assess = assess;
		this.assessLevel = assessLevel;
		this.num = num;
		this.status = status;
		this.receTime = receTime;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "seller_id")
	public Seller getSeller() {
		return this.seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id")
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "buyer_id")
	public Buyer getBuyer() {
		return this.buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "address_id")
	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Column(name = "code", length = 100)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "time", nullable = false, length = 19)
	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	@Column(name = "assess", length = 65535)
	public String getAssess() {
		return this.assess;
	}

	public void setAssess(String assess) {
		this.assess = assess;
	}

	@Column(name = "assess_level")
	public Integer getAssessLevel() {
		return this.assessLevel;
	}

	public void setAssessLevel(Integer assessLevel) {
		this.assessLevel = assessLevel;
	}

	@Column(name = "num")
	public Integer getNum() {
		return this.num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Column(name = "rece_time", nullable = false, length = 19)
	public Timestamp getReceTime() {
		return this.receTime;
	}

	public void setReceTime(Timestamp receTime) {
		this.receTime = receTime;
	}

}