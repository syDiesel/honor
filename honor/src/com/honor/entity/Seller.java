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
 * Seller entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "seller", catalog = "honor")
public class Seller implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String password;
	private String store;
	private String email;
	private String tel;
	private String idCard;
	private String address;
	private Integer level;
	private String isActive;
	private String headImg;
	private String storeImg;
	private String sellerDesc;
	private Integer storeTypeId;
	private String isLocked;
	private Set<Orders> orderses = new HashSet<Orders>(0);

	// Constructors

	/** default constructor */
	public Seller() {
	}

	/** full constructor */
	public Seller(String name, String password, String store, String email,
			String tel, String idCard, String address, Integer level,
			String isActive, String headImg, String storeImg,
			String sellerDesc, Integer storeTypeId, String isLocked,
			Set<Orders> orderses) {
		this.name = name;
		this.password = password;
		this.store = store;
		this.email = email;
		this.tel = tel;
		this.idCard = idCard;
		this.address = address;
		this.level = level;
		this.isActive = isActive;
		this.headImg = headImg;
		this.storeImg = storeImg;
		this.sellerDesc = sellerDesc;
		this.storeTypeId = storeTypeId;
		this.isLocked = isLocked;
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

	@Column(name = "name", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "password", length = 100)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "store", length = 100)
	public String getStore() {
		return this.store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	@Column(name = "email", length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "tel", length = 11)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "id_card", length = 20)
	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	@Column(name = "address", length = 200)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "level")
	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	@Column(name = "is_active", length = 5)
	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	@Column(name = "head_img", length = 200)
	public String getHeadImg() {
		return this.headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	@Column(name = "store_img", length = 200)
	public String getStoreImg() {
		return this.storeImg;
	}

	public void setStoreImg(String storeImg) {
		this.storeImg = storeImg;
	}

	@Column(name = "seller_desc", length = 65535)
	public String getSellerDesc() {
		return this.sellerDesc;
	}

	public void setSellerDesc(String sellerDesc) {
		this.sellerDesc = sellerDesc;
	}

	@Column(name = "store_type_id")
	public Integer getStoreTypeId() {
		return this.storeTypeId;
	}

	public void setStoreTypeId(Integer storeTypeId) {
		this.storeTypeId = storeTypeId;
	}

	@Column(name = "is_locked", length = 5)
	public String getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(String isLocked) {
		this.isLocked = isLocked;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "seller")
	public Set<Orders> getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set<Orders> orderses) {
		this.orderses = orderses;
	}

}