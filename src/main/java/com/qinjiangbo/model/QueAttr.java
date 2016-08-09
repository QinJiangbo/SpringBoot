package com.qinjiangbo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the que_attr database table.
 * 
 */
@Entity
@Table(name="que_attr")
@NamedQuery(name="QueAttr.findAll", query="SELECT q FROM QueAttr q")
public class QueAttr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="attr_id")
	private Long attrId;

	@Column(name="attr_code")
	private String attrCode;

	@Column(name="attr_type")
	private Long attrType;

	@Column(name="attr_up")
	private Long attrUp;

	private Integer lev;

	private String name;

	@Column(name="name_cn")
	private String nameCn;

	@Column(name="name_short")
	private String nameShort;

	@Column(name="org_id")
	private Long orgId;

	private String remark;

	@Column(name="sort_no")
	private Integer sortNo;

	private Long subject;

	@Column(name="test_type")
	private Long testType;

	@Column(name="time_update")
	private Timestamp timeUpdate;

	@Column(name="user_create")
	private Long userCreate;

	public QueAttr() {
	}

	public Long getAttrId() {
		return this.attrId;
	}

	public void setAttrId(Long attrId) {
		this.attrId = attrId;
	}

	public String getAttrCode() {
		return this.attrCode;
	}

	public void setAttrCode(String attrCode) {
		this.attrCode = attrCode;
	}

	public Long getAttrType() {
		return this.attrType;
	}

	public void setAttrType(Long attrType) {
		this.attrType = attrType;
	}

	public Long getAttrUp() {
		return this.attrUp;
	}

	public void setAttrUp(Long attrUp) {
		this.attrUp = attrUp;
	}

	public Integer getLev() {
		return this.lev;
	}

	public void setLev(Integer lev) {
		this.lev = lev;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameCn() {
		return this.nameCn;
	}

	public void setNameCn(String nameCn) {
		this.nameCn = nameCn;
	}

	public String getNameShort() {
		return this.nameShort;
	}

	public void setNameShort(String nameShort) {
		this.nameShort = nameShort;
	}

	public Long getOrgId() {
		return this.orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getSortNo() {
		return this.sortNo;
	}

	public void setSortNo(Integer sortNo) {
		this.sortNo = sortNo;
	}

	public Long getSubject() {
		return this.subject;
	}

	public void setSubject(Long subject) {
		this.subject = subject;
	}

	public Long getTestType() {
		return this.testType;
	}

	public void setTestType(Long testType) {
		this.testType = testType;
	}

	public Timestamp getTimeUpdate() {
		return this.timeUpdate;
	}

	public void setTimeUpdate(Timestamp timeUpdate) {
		this.timeUpdate = timeUpdate;
	}

	public Long getUserCreate() {
		return this.userCreate;
	}

	public void setUserCreate(Long userCreate) {
		this.userCreate = userCreate;
	}

}