package com.honor.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "product", catalog = "honor")
public class Product implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer sellerId;
	private String name;
	private Float priceN;
	private Float priceO;
	private Integer stock;
	private Integer proTypeId;
	private String proDesc;
	private String img1;
	private String img2;
	private String img3;
	private String img4;
	private String img5;
	private Set<Collect> collects = new HashSet<Collect>(0);
	private Set<Cart> carts = new HashSet<Cart>(0);
	private Set<Orders> orderses = new HashSet<Orders>(0);

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** full constructor */
	public Product(Integer sellerId, String name, Float priceN, Float priceO,
			Integer stock, Integer proTypeId, String proDesc, String img1,
			String img2, String img3, String img4, String img5,
			Set<Collect> collects, Set<Cart> carts, Set<Orders> orderses) {
		this.sellerId = sellerId;
		this.name = name;
		this.priceN = priceN;
		this.priceO = priceO;
		this.stock = stock;
		this.proTypeId = proTypeId;
		this.proDesc = proDesc;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		this.img4 = img4;
		this.img5 = img5;
		this.collects = collects;
		this.carts = carts;
		this.orderses = orderses;
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

	@Column(name = "seller_id")
	public Integer getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	@Column(name = "name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "price_n", precision = 12, scale = 0)
	public Float getPriceN() {
		return this.priceN;
	}

	public void setPriceN(Float priceN) {
		this.priceN = priceN;
	}

	@Column(name = "price_o", precision = 12, scale = 0)
	public Float getPriceO() {
		return this.priceO;
	}

	public void setPriceO(Float priceO) {
		this.priceO = priceO;
	}

	@Column(name = "stock")
	public Integer getStock() {
		return this.stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Column(name = "pro_type_id")
	public Integer getProTypeId() {
		return this.proTypeId;
	}

	public void setProTypeId(Integer proTypeId) {
		this.proTypeId = proTypeId;
	}

	@Column(name = "pro_desc", length = 65535)
	public String getProDesc() {
		return this.proDesc;
	}

	public void setProDesc(String proDesc) {
		this.proDesc = proDesc;
	}

	@Column(name = "img1", length = 200)
	public String getImg1() {
		return this.img1;
	}

	public void setImg1(String img1) {
		this.img1 = img1;
	}

	@Column(name = "img2", length = 200)
	public String getImg2() {
		return this.img2;
	}

	public void setImg2(String img2) {
		this.img2 = img2;
	}

	@Column(name = "img3", length = 200)
	public String getImg3() {
		return this.img3;
	}

	public void setImg3(String img3) {
		this.img3 = img3;
	}

	@Column(name = "img4", length = 200)
	public String getImg4() {
		return this.img4;
	}

	public void setImg4(String img4) {
		this.img4 = img4;
	}

	@Column(name = "img5", length = 200)
	public String getImg5() {
		return this.img5;
	}

	public void setImg5(String img5) {
		this.img5 = img5;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "product")
	public Set<Collect> getCollects() {
		return this.collects;
	}

	public void setCollects(Set<Collect> collects) {
		this.collects = collects;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "product")
	public Set<Cart> getCarts() {
		return this.carts;
	}

	public void setCarts(Set<Cart> carts) {
		this.carts = carts;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "product")
	public Set<Orders> getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set<Orders> orderses) {
		this.orderses = orderses;
	}

}