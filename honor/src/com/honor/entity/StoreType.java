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
 * StoreType entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "store_type", catalog = "honor")
public class StoreType implements java.io.Serializable {

	// Fields

	private Integer id;
	private String typeName;
	private Set<ProType> proTypes = new HashSet<ProType>(0);

	// Constructors

	/** default constructor */
	public StoreType() {
	}

	/** full constructor */
	public StoreType(String typeName, Set<ProType> proTypes) {
		this.typeName = typeName;
		this.proTypes = proTypes;
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

	@Column(name = "type_name", length = 20)
	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "storeType")
	public Set<ProType> getProTypes() {
		return this.proTypes;
	}

	public void setProTypes(Set<ProType> proTypes) {
		this.proTypes = proTypes;
	}

}