package com.qinjiangbo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the bas_organize database table.
 * 
 */
@Entity
@Table(name="bas_organize")
@NamedQuery(name="BasOrganize.findAll", query="SELECT b FROM BasOrganize b")
public class BasOrganize implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="org_id")
	private Long orgId;

	private String domain;

	private String guids;

	private String introduction;

	@Column(name="is_online")
	private Integer isOnline;

	@Column(name="is_outline")
	private Integer isOutline;

	private Integer lev;

	@Column(name="manager_id")
	private Long managerId;

	private String mobile;

	@Column(name="org_address")
	private String orgAddress;

	@Column(name="org_code")
	private String orgCode;

	@Column(name="org_key")
	private String orgKey;

	@Column(name="org_name")
	private String orgName;

	@Column(name="reg_city")
	private String regCity;

	@Column(name="reg_county")
	private String regCounty;

	@Column(name="reg_prov")
	private String regProv;

	private String remark;

	private String slogan;

	private Integer sort;

	private Integer status;

	private String tel;

	@Column(name="time_create")
	private Timestamp timeCreate;

	@Column(name="time_end")
	private Timestamp timeEnd;

	@Column(name="time_start")
	private Timestamp timeStart;

	@Column(name="time_update")
	private Timestamp timeUpdate;

	@Column(name="tree_code")
	private String treeCode;

	@Column(name="up_id")
	private Long upId;

	@Column(name="url_comm")
	private String urlComm;

	@Column(name="url_logo")
	private String urlLogo;

	@Column(name="user_create")
	private Long userCreate;

	public BasOrganize() {
	}

	public Long getOrgId() {
		return this.orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getGuids() {
		return this.guids;
	}

	public void setGuids(String guids) {
		this.guids = guids;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public Integer getIsOnline() {
		return this.isOnline;
	}

	public void setIsOnline(Integer isOnline) {
		this.isOnline = isOnline;
	}

	public Integer getIsOutline() {
		return this.isOutline;
	}

	public void setIsOutline(Integer isOutline) {
		this.isOutline = isOutline;
	}

	public Integer getLev() {
		return this.lev;
	}

	public void setLev(Integer lev) {
		this.lev = lev;
	}

	public Long getManagerId() {
		return this.managerId;
	}

	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOrgAddress() {
		return this.orgAddress;
	}

	public void setOrgAddress(String orgAddress) {
		this.orgAddress = orgAddress;
	}

	public String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOrgKey() {
		return this.orgKey;
	}

	public void setOrgKey(String orgKey) {
		this.orgKey = orgKey;
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getRegCity() {
		return this.regCity;
	}

	public void setRegCity(String regCity) {
		this.regCity = regCity;
	}

	public String getRegCounty() {
		return this.regCounty;
	}

	public void setRegCounty(String regCounty) {
		this.regCounty = regCounty;
	}

	public String getRegProv() {
		return this.regProv;
	}

	public void setRegProv(String regProv) {
		this.regProv = regProv;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSlogan() {
		return this.slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public Integer getSort() {
		return this.sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Timestamp getTimeCreate() {
		return this.timeCreate;
	}

	public void setTimeCreate(Timestamp timeCreate) {
		this.timeCreate = timeCreate;
	}

	public Timestamp getTimeEnd() {
		return this.timeEnd;
	}

	public void setTimeEnd(Timestamp timeEnd) {
		this.timeEnd = timeEnd;
	}

	public Timestamp getTimeStart() {
		return this.timeStart;
	}

	public void setTimeStart(Timestamp timeStart) {
		this.timeStart = timeStart;
	}

	public Timestamp getTimeUpdate() {
		return this.timeUpdate;
	}

	public void setTimeUpdate(Timestamp timeUpdate) {
		this.timeUpdate = timeUpdate;
	}

	public String getTreeCode() {
		return this.treeCode;
	}

	public void setTreeCode(String treeCode) {
		this.treeCode = treeCode;
	}

	public Long getUpId() {
		return this.upId;
	}

	public void setUpId(Long upId) {
		this.upId = upId;
	}

	public String getUrlComm() {
		return this.urlComm;
	}

	public void setUrlComm(String urlComm) {
		this.urlComm = urlComm;
	}

	public String getUrlLogo() {
		return this.urlLogo;
	}

	public void setUrlLogo(String urlLogo) {
		this.urlLogo = urlLogo;
	}

	public Long getUserCreate() {
		return this.userCreate;
	}

	public void setUserCreate(Long userCreate) {
		this.userCreate = userCreate;
	}

}