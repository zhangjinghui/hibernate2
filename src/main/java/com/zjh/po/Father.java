package com.zjh.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Father entity. @author MyEclipse Persistence Tools
 */

public class Father implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Set sonses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Father() {
	}

	/** minimal constructor */
	public Father(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Father(Integer id, String name, Set sonses) {
		this.id = id;
		this.name = name;
		this.sonses = sonses;
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

	public Set getSonses() {
		return this.sonses;
	}

	public void setSonses(Set sonses) {
		this.sonses = sonses;
	}

}