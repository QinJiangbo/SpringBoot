package com.qinjiangbo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the wk_job database table.
 * 
 */
@Entity
@Table(name="wk_job")
@NamedQuery(name="WkJob.findAll", query="SELECT w FROM WkJob w")
public class WkJob implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="job_id")
	private Long jobId;

	@Column(name="class_id")
	private Long classId;

	@Column(name="job_name")
	private String jobName;

	@Column(name="job_set")
	private String jobSet;

	@Column(name="len_sec")
	private Integer lenSec;

	@Column(name="org_id")
	private Long orgId;

	@Column(name="que_num")
	private Long queNum;

	private String remark;

	private Integer status;

	private Long[] subjects;

	@Column(name="test_types")
	private Long[] testTypes;

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

	@Column(name="user_type")
	private Integer userType;

	@Column(name="wk_rule")
	private Long wkRule;

	@Column(name="wk_type")
	private Long wkType;

	public WkJob() {
	}

	public Long getJobId() {
		return this.jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public Long getClassId() {
		return this.classId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobSet() {
		return this.jobSet;
	}

	public void setJobSet(String jobSet) {
		this.jobSet = jobSet;
	}

	public Integer getLenSec() {
		return this.lenSec;
	}

	public void setLenSec(Integer lenSec) {
		this.lenSec = lenSec;
	}

	public Long getOrgId() {
		return this.orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public Long getQueNum() {
		return this.queNum;
	}

	public void setQueNum(Long queNum) {
		this.queNum = queNum;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long[] getSubjects() {
		return this.subjects;
	}

	public void setSubjects(Long[] subjects) {
		this.subjects = subjects;
	}

	public Long[] getTestTypes() {
		return this.testTypes;
	}

	public void setTestTypes(Long[] testTypes) {
		this.testTypes = testTypes;
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

	public Integer getUserType() {
		return this.userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Long getWkRule() {
		return this.wkRule;
	}

	public void setWkRule(Long wkRule) {
		this.wkRule = wkRule;
	}

	public Long getWkType() {
		return this.wkType;
	}

	public void setWkType(Long wkType) {
		this.wkType = wkType;
	}

}