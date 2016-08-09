package com.qinjiangbo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the sys_user database table.
 * 
 */
@Entity
@Table(name="sys_user")
@NamedQuery(name="SysUser.findAll", query="SELECT s FROM SysUser s")
public class SysUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_id")
	private Long userId;

	@Column(name="ac_email")
	private String acEmail;

	@Column(name="ac_mobile")
	private String acMobile;

	@Column(name="ac_qq")
	private String acQq;

	@Column(name="ac_wxmobile")
	private String acWxmobile;

	@Column(name="ac_wxweb")
	private String acWxweb;

	private String address;

	@Temporal(TemporalType.DATE)
	private Date birthday;

	private String desp;

	private Integer gender;

	private String guids;

	private String idcard;

	@Column(name="is_admin")
	private Integer isAdmin;

	@Column(name="is_org")
	private Integer isOrg;

	@Column(name="is_par")
	private Integer isPar;

	@Column(name="is_stu")
	private Integer isStu;

	@Column(name="is_tech")
	private Integer isTech;

	@Column(name="is_visitor")
	private Integer isVisitor;

	private String lang;

	@Column(name="name_china")
	private String nameChina;

	@Column(name="name_eng")
	private String nameEng;

	@Column(name="name_nick")
	private String nameNick;

	@Column(name="name_spell")
	private String nameSpell;

	@Column(name="name_spellf")
	private String nameSpellf;

	@Column(name="photo_id")
	private String photoId;

	private String pwd;

	private String qq;

	@Column(name="reg_city")
	private String regCity;

	@Column(name="reg_code")
	private String regCode;

	@Column(name="reg_county")
	private String regCounty;

	@Column(name="reg_path")
	private String regPath;

	@Column(name="reg_pro")
	private String regPro;

	private Integer state;

	private String tel;

	@Column(name="time_regist")
	private Timestamp timeRegist;

	@Column(name="time_update")
	private Timestamp timeUpdate;

	@Column(name="user_create")
	private Long userCreate;

	private String wxid;

	public SysUser() {
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getAcEmail() {
		return this.acEmail;
	}

	public void setAcEmail(String acEmail) {
		this.acEmail = acEmail;
	}

	public String getAcMobile() {
		return this.acMobile;
	}

	public void setAcMobile(String acMobile) {
		this.acMobile = acMobile;
	}

	public String getAcQq() {
		return this.acQq;
	}

	public void setAcQq(String acQq) {
		this.acQq = acQq;
	}

	public String getAcWxmobile() {
		return this.acWxmobile;
	}

	public void setAcWxmobile(String acWxmobile) {
		this.acWxmobile = acWxmobile;
	}

	public String getAcWxweb() {
		return this.acWxweb;
	}

	public void setAcWxweb(String acWxweb) {
		this.acWxweb = acWxweb;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getDesp() {
		return this.desp;
	}

	public void setDesp(String desp) {
		this.desp = desp;
	}

	public Integer getGender() {
		return this.gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getGuids() {
		return this.guids;
	}

	public void setGuids(String guids) {
		this.guids = guids;
	}

	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public Integer getIsAdmin() {
		return this.isAdmin;
	}

	public void setIsAdmin(Integer isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Integer getIsOrg() {
		return this.isOrg;
	}

	public void setIsOrg(Integer isOrg) {
		this.isOrg = isOrg;
	}

	public Integer getIsPar() {
		return this.isPar;
	}

	public void setIsPar(Integer isPar) {
		this.isPar = isPar;
	}

	public Integer getIsStu() {
		return this.isStu;
	}

	public void setIsStu(Integer isStu) {
		this.isStu = isStu;
	}

	public Integer getIsTech() {
		return this.isTech;
	}

	public void setIsTech(Integer isTech) {
		this.isTech = isTech;
	}

	public Integer getIsVisitor() {
		return this.isVisitor;
	}

	public void setIsVisitor(Integer isVisitor) {
		this.isVisitor = isVisitor;
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getNameChina() {
		return this.nameChina;
	}

	public void setNameChina(String nameChina) {
		this.nameChina = nameChina;
	}

	public String getNameEng() {
		return this.nameEng;
	}

	public void setNameEng(String nameEng) {
		this.nameEng = nameEng;
	}

	public String getNameNick() {
		return this.nameNick;
	}

	public void setNameNick(String nameNick) {
		this.nameNick = nameNick;
	}

	public String getNameSpell() {
		return this.nameSpell;
	}

	public void setNameSpell(String nameSpell) {
		this.nameSpell = nameSpell;
	}

	public String getNameSpellf() {
		return this.nameSpellf;
	}

	public void setNameSpellf(String nameSpellf) {
		this.nameSpellf = nameSpellf;
	}

	public String getPhotoId() {
		return this.photoId;
	}

	public void setPhotoId(String photoId) {
		this.photoId = photoId;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getRegCity() {
		return this.regCity;
	}

	public void setRegCity(String regCity) {
		this.regCity = regCity;
	}

	public String getRegCode() {
		return this.regCode;
	}

	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}

	public String getRegCounty() {
		return this.regCounty;
	}

	public void setRegCounty(String regCounty) {
		this.regCounty = regCounty;
	}

	public String getRegPath() {
		return this.regPath;
	}

	public void setRegPath(String regPath) {
		this.regPath = regPath;
	}

	public String getRegPro() {
		return this.regPro;
	}

	public void setRegPro(String regPro) {
		this.regPro = regPro;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Timestamp getTimeRegist() {
		return this.timeRegist;
	}

	public void setTimeRegist(Timestamp timeRegist) {
		this.timeRegist = timeRegist;
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

	public String getWxid() {
		return this.wxid;
	}

	public void setWxid(String wxid) {
		this.wxid = wxid;
	}

}