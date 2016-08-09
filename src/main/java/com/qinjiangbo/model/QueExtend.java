package com.qinjiangbo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the que_extend database table.
 * 
 */
@Entity
@Table(name="que_extend")
@NamedQuery(name="QueExtend.findAll", query="SELECT q FROM QueExtend q")
public class QueExtend implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ext_id")
	private Long extId;

	@Column(name="busi_id")
	private Long busiId;

	@Column(name="ext_key")
	private Long extKey;

	@Column(name="ext_value")
	private String extValue;

	@Column(name="sort_no")
	private Integer sortNo;

	@Column(name="time_update")
	private Timestamp timeUpdate;

	public QueExtend() {
	}

	public Long getExtId() {
		return this.extId;
	}

	public void setExtId(Long extId) {
		this.extId = extId;
	}

	public Long getBusiId() {
		return this.busiId;
	}

	public void setBusiId(Long busiId) {
		this.busiId = busiId;
	}

	public Long getExtKey() {
		return this.extKey;
	}

	public void setExtKey(Long extKey) {
		this.extKey = extKey;
	}

	public String getExtValue() {
		return this.extValue;
	}

	public void setExtValue(String extValue) {
		this.extValue = extValue;
	}

	public Integer getSortNo() {
		return this.sortNo;
	}

	public void setSortNo(Integer sortNo) {
		this.sortNo = sortNo;
	}

	public Timestamp getTimeUpdate() {
		return this.timeUpdate;
	}

	public void setTimeUpdate(Timestamp timeUpdate) {
		this.timeUpdate = timeUpdate;
	}

}