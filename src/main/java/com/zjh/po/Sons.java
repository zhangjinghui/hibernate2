package com.zjh.po;

/**
 * Sons entity. @author MyEclipse Persistence Tools
 */

public class Sons implements java.io.Serializable {

	// Fields

	private Integer id;
	private Father father;
	private String name;

	// Constructors

	/** default constructor */
	public Sons() {
	}

	/** minimal constructor */
	public Sons(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Sons(Integer id, Father father, String name) {
		this.id = id;
		this.father = father;
		this.name = name;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Father getFather() {
		return this.father;
	}

	public void setFather(Father father) {
		this.father = father;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}