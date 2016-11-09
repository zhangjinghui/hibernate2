package com.zjh.po;

/**
 * Hus entity. @author MyEclipse Persistence Tools
 */

public class Hus implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Wife wife;

	// Constructors

	/** default constructor */
	public Hus() {
	}

	/** minimal constructor */
	public Hus(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Hus(Integer id, String name, Wife wife) {
		this.id = id;
		this.name = name;
		this.wife = wife;
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

	public Wife getWife() {
		return this.wife;
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}

}