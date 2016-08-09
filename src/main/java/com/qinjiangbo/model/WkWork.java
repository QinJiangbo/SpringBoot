package com.qinjiangbo.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Type;

import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the wk_work database table.
 * 
 */
@Entity
@Table(name="wk_work")
@NamedQuery(name="WkWork.findAll", query="SELECT w FROM WkWork w")
public class WkWork implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="wk_id")
	private Long wkId;

	@Column(name="class_id")
	private Long classId;

	private String comment;

	@Column(name="job_id")
	private Long jobId;

	@Column(name="len_sec")
	private Integer lenSec;

	@Column(name="org_id")
	private Long orgId;

	@Column(name="pap_id")
	private Long papId;

	private String remark;

	private BigDecimal score;

	@Column(name="score_tech")
	private BigDecimal scoreTech;

	private Integer status;
	
	@Type(type = "com.qinjiangbo.model.custom.LongArrayUserType")
	@Column(name = "subjects")
	private Long[] subjects;

	@Column(name="tech_id")
	private Long techId;

	@Type(type = "com.qinjiangbo.model.custom.LongArrayUserType")
	@Column(name="test_types")
	private Long[] testTypes;

	@Column(name="time_end")
	private Timestamp timeEnd;

	@Column(name="time_start")
	private Timestamp timeStart;

	@Column(name="time_update")
	private Timestamp timeUpdate;

	@Column(name="user_id")
	private Long userId;

	@Column(name="wk_rule")
	private Long wkRule;

	@Column(name="wk_type")
	private Long wkType;

	public WkWork() {
	}

	public Long getWkId() {
		return this.wkId;
	}

	public void setWkId(Long wkId) {
		this.wkId = wkId;
	}

	public Long getClassId() {
		return this.classId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Long getJobId() {
		return this.jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
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

	public Long getPapId() {
		return this.papId;
	}

	public void setPapId(Long papId) {
		this.papId = papId;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public BigDecimal getScore() {
		return this.score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

	public BigDecimal getScoreTech() {
		return this.scoreTech;
	}

	public void setScoreTech(BigDecimal scoreTech) {
		this.scoreTech = scoreTech;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Object getSubjects() {
		return this.subjects;
	}

	public void setSubjects(Long[] subjects) {
		this.subjects = subjects;
	}

	public Long getTechId() {
		return this.techId;
	}

	public void setTechId(Long techId) {
		this.techId = techId;
	}

	public Object getTestTypes() {
		return this.testTypes;
	}

	public void setTestTypes(Long[] testTypes) {
		this.testTypes = testTypes;
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

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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