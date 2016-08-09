package com.qinjiangbo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the wk_practice database table.
 * 
 */
@Entity
@Table(name="wk_practice")
@NamedQuery(name="WkPractice.findAll", query="SELECT w FROM WkPractice w")
public class WkPractice implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private WkPracticePK id;

	@Column(name="num_all")
	private Integer numAll;

	@Column(name="num_attr")
	private Integer numAttr;

	@Column(name="num_done")
	private Integer numDone;

	@Column(name="que_content")
	private String queContent;

	private String remark;

	@Column(name="time_lastupdated")
	private Timestamp timeLastupdated;

	@Column(name="wk_id")
	private Long wkId;

	public WkPractice() {
	}

	public WkPracticePK getId() {
		return this.id;
	}

	public void setId(WkPracticePK id) {
		this.id = id;
	}

	public Integer getNumAll() {
		return this.numAll;
	}

	public void setNumAll(Integer numAll) {
		this.numAll = numAll;
	}

	public Integer getNumAttr() {
		return this.numAttr;
	}

	public void setNumAttr(Integer numAttr) {
		this.numAttr = numAttr;
	}

	public Integer getNumDone() {
		return this.numDone;
	}

	public void setNumDone(Integer numDone) {
		this.numDone = numDone;
	}

	public String getQueContent() {
		return this.queContent;
	}

	public void setQueContent(String queContent) {
		this.queContent = queContent;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Timestamp getTimeLastupdated() {
		return this.timeLastupdated;
	}

	public void setTimeLastupdated(Timestamp timeLastupdated) {
		this.timeLastupdated = timeLastupdated;
	}

	public Long getWkId() {
		return this.wkId;
	}

	public void setWkId(Long wkId) {
		this.wkId = wkId;
	}

}