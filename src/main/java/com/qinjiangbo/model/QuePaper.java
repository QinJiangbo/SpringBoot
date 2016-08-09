package com.qinjiangbo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the que_paper database table.
 * 
 */
@Entity
@Table(name="que_paper")
@NamedQuery(name="QuePaper.findAll", query="SELECT q FROM QuePaper q")
public class QuePaper implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pap_id")
	private Long papId;

	@Column(name="len_min")
	private Integer lenMin;

	private Integer lev;

	@Column(name="lev_dk")
	private Integer levDk;

	@Column(name="num_que")
	private Integer numQue;

	@Column(name="num_sec")
	private Integer numSec;

	@Column(name="org_id")
	private Long orgId;

	@Column(name="pap_code")
	private String papCode;

	@Column(name="pap_name")
	private String papName;

	@Column(name="pap_name_cn")
	private String papNameCn;

	@Column(name="reg_code")
	private String regCode;

	@Column(name="reg_continent")
	private String regContinent;

	@Column(name="reg_country")
	private String regCountry;

	private String remark;

	private Long src;

	private Integer status;

	@Column(name="test_type")
	private Long testType;

	@Column(name="time_create")
	private Timestamp timeCreate;

	@Column(name="time_publish")
	private Timestamp timePublish;

	@Column(name="time_update")
	private Timestamp timeUpdate;

	@Column(name="user_create")
	private Long userCreate;

	public QuePaper() {
	}

	public Long getPapId() {
		return this.papId;
	}

	public void setPapId(Long papId) {
		this.papId = papId;
	}

	public Integer getLenMin() {
		return this.lenMin;
	}

	public void setLenMin(Integer lenMin) {
		this.lenMin = lenMin;
	}

	public Integer getLev() {
		return this.lev;
	}

	public void setLev(Integer lev) {
		this.lev = lev;
	}

	public Integer getLevDk() {
		return this.levDk;
	}

	public void setLevDk(Integer levDk) {
		this.levDk = levDk;
	}

	public Integer getNumQue() {
		return this.numQue;
	}

	public void setNumQue(Integer numQue) {
		this.numQue = numQue;
	}

	public Integer getNumSec() {
		return this.numSec;
	}

	public void setNumSec(Integer numSec) {
		this.numSec = numSec;
	}

	public Long getOrgId() {
		return this.orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public String getPapCode() {
		return this.papCode;
	}

	public void setPapCode(String papCode) {
		this.papCode = papCode;
	}

	public String getPapName() {
		return this.papName;
	}

	public void setPapName(String papName) {
		this.papName = papName;
	}

	public String getPapNameCn() {
		return this.papNameCn;
	}

	public void setPapNameCn(String papNameCn) {
		this.papNameCn = papNameCn;
	}

	public String getRegCode() {
		return this.regCode;
	}

	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}

	public String getRegContinent() {
		return this.regContinent;
	}

	public void setRegContinent(String regContinent) {
		this.regContinent = regContinent;
	}

	public String getRegCountry() {
		return this.regCountry;
	}

	public void setRegCountry(String regCountry) {
		this.regCountry = regCountry;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getSrc() {
		return this.src;
	}

	public void setSrc(Long src) {
		this.src = src;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getTestType() {
		return this.testType;
	}

	public void setTestType(Long testType) {
		this.testType = testType;
	}

	public Timestamp getTimeCreate() {
		return this.timeCreate;
	}

	public void setTimeCreate(Timestamp timeCreate) {
		this.timeCreate = timeCreate;
	}

	public Timestamp getTimePublish() {
		return this.timePublish;
	}

	public void setTimePublish(Timestamp timePublish) {
		this.timePublish = timePublish;
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