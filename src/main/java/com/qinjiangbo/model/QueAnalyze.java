package com.qinjiangbo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the que_analyze database table.
 * 
 */
@Entity
@Table(name="que_analyze")
@NamedQuery(name="QueAnalyze.findAll", query="SELECT q FROM QueAnalyze q")
public class QueAnalyze implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ana_id")
	private Long anaId;

	@Column(name="ana_type")
	private Long anaType;

	@Column(name="busi_id")
	private Long busiId;

	private String content;

	@Column(name="org_id")
	private Long orgId;

	@Column(name="sort_no")
	private Integer sortNo;

	private Integer status;

	@Column(name="time_update")
	private Timestamp timeUpdate;

	public QueAnalyze() {
	}

	public Long getAnaId() {
		return this.anaId;
	}

	public void setAnaId(Long anaId) {
		this.anaId = anaId;
	}

	public Long getAnaType() {
		return this.anaType;
	}

	public void setAnaType(Long anaType) {
		this.anaType = anaType;
	}

	public Long getBusiId() {
		return this.busiId;
	}

	public void setBusiId(Long busiId) {
		this.busiId = busiId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getOrgId() {
		return this.orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public Integer getSortNo() {
		return this.sortNo;
	}

	public void setSortNo(Integer sortNo) {
		this.sortNo = sortNo;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Timestamp getTimeUpdate() {
		return this.timeUpdate;
	}

	public void setTimeUpdate(Timestamp timeUpdate) {
		this.timeUpdate = timeUpdate;
	}

}