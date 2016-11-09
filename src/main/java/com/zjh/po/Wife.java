package com.zjh.po;

/**
 * Wife entity. @author MyEclipse Persistence Tools
 */

public class Wife implements java.io.Serializable {

	// Fields

	private Integer id;
	private Hus hus;
	private String name;

	// Constructors

	/** default constructor */
	public Wife() {
	}

	/** minimal constructor */
	public Wife(Integer id, Hus hus) {
		this.id = id;
		this.hus = hus;
	}

	/** full constructor */
	public Wife(Integer id, Hus hus, String name) {
		this.id = id;
		this.hus = hus;
		this.name = name;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Hus getHus() {
		return this.hus;
	}

	public void setHus(Hus hus) {
		this.hus = hus;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}