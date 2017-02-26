package com.honor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ProType entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "pro_type", catalog = "honor")
public class ProType implements java.io.Serializable {

	// Fields

	private Integer id;
	private StoreType storeType;
	private String typeName;

	// Constructors

	/** default constructor */
	public ProType() {
	}

	/** minimal constructor */
	public ProType(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public ProType(Integer id, StoreType storeType, String typeName) {
		this.id = id;
		this.storeType = storeType;
		this.typeName = typeName;
	}

	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "store_type_id")
	public StoreType getStoreType() {
		return this.storeType;
	}

	public void setStoreType(StoreType storeType) {
		this.storeType = storeType;
	}

	@Column(name = "type_name", length = 20)
	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}