package com.qinjiangbo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the bas_class database table.
 * 
 */
@Entity
@Table(name="bas_class")
@NamedQuery(name="BasClass.findAll", query="SELECT b FROM BasClass b")
public class BasClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="class_id")
	private Long classId;

	@Column(name="class_code")
	private String classCode;

	@Column(name="class_name")
	private String className;

	@Column(name="class_nmid")
	private Long classNmid;

	@Column(name="class_tpid")
	private Long classTpid;

	@Column(name="id_code")
	private String idCode;

	@Column(name="is_join")
	private Integer isJoin;

	private Long manager;

	@Column(name="num_hours")
	private Integer numHours;

	@Column(name="num_stu")
	private Integer numStu;

	@Column(name="org_id")
	private Long orgId;

	private Integer status;

	@Column(name="test_type")
	private Long testType;

	@Column(name="time_create")
	private Timestamp timeCreate;

	@Column(name="time_end")
	private Timestamp timeEnd;

	@Column(name="time_start")
	private Timestamp timeStart;

	@Column(name="time_update")
	private Timestamp timeUpdate;

	@Column(name="user_create")
	private Long userCreate;

	public BasClass() {
	}

	public Long getClassId() {
		return this.classId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public String getClassCode() {
		return this.classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Long getClassNmid() {
		return this.classNmid;
	}

	public void setClassNmid(Long classNmid) {
		this.classNmid = classNmid;
	}

	public Long getClassTpid() {
		return this.classTpid;
	}

	public void setClassTpid(Long classTpid) {
		this.classTpid = classTpid;
	}

	public String getIdCode() {
		return this.idCode;
	}

	public void setIdCode(String idCode) {
		this.idCode = idCode;
	}

	public Integer getIsJoin() {
		return this.isJoin;
	}

	public void setIsJoin(Integer isJoin) {
		this.isJoin = isJoin;
	}

	public Long getManager() {
		return this.manager;
	}

	public void setManager(Long manager) {
		this.manager = manager;
	}

	public Integer getNumHours() {
		return this.numHours;
	}

	public void setNumHours(Integer numHours) {
		this.numHours = numHours;
	}

	public Integer getNumStu() {
		return this.numStu;
	}

	public void setNumStu(Integer numStu) {
		this.numStu = numStu;
	}

	public Long getOrgId() {
		return this.orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
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

	public Long getUserCreate() {
		return this.userCreate;
	}

	public void setUserCreate(Long userCreate) {
		this.userCreate = userCreate;
	}

}