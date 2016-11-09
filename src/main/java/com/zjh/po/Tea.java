package com.zjh.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Tea entity. @author MyEclipse Persistence Tools
 */

public class Tea implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Set stus = new HashSet(0);

	// Constructors

	/** default constructor */
	public Tea() {
	}

	/** minimal constructor */
	public Tea(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Tea(Integer id, String name, Set stus) {
		this.id = id;
		this.name = name;
		this.stus = stus;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getStus() {
		return this.stus;
	}

	public void setStus(Set stus) {
		this.stus = stus;
	}

}