package com.zjh.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Stu entity. @author MyEclipse Persistence Tools
 */

public class Stu implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Set teas = new HashSet(0);

	// Constructors

	/** default constructor */
	public Stu() {
	}

	/** minimal constructor */
	public Stu(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Stu(Integer id, String name, Set teas) {
		this.id = id;
		this.name = name;
		this.teas = teas;
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

	public Set getTeas() {
		return this.teas;
	}

	public void setTeas(Set teas) {
		this.teas = teas;
	}

}