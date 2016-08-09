package com.qinjiangbo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the que_section database table.
 * 
 */
@Entity
@Table(name="que_section")
@NamedQuery(name="QueSection.findAll", query="SELECT q FROM QueSection q")
public class QueSection implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sec_id")
	private Long secId;

	private String content;

	@Column(name="is_must")
	private Integer isMust;

	@Column(name="len_min")
	private Integer lenMin;

	@Column(name="lev_sec")
	private Integer levSec;

	@Column(name="note_below")
	private String noteBelow;

	@Column(name="note_head")
	private String noteHead;

	@Column(name="num_que")
	private Integer numQue;

	@Column(name="num_valid")
	private Integer numValid;

	@Column(name="pap_id")
	private Long papId;

	private String remark;

	@Column(name="sec_name")
	private String secName;

	@Column(name="sec_name_cn")
	private String secNameCn;

	@Column(name="sort_pap")
	private Integer sortPap;

	private Long[] subjects;

	@Column(name="time_update")
	private Timestamp timeUpdate;

	public QueSection() {
	}

	public Long getSecId() {
		return this.secId;
	}

	public void setSecId(Long secId) {
		this.secId = secId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getIsMust() {
		return this.isMust;
	}

	public void setIsMust(Integer isMust) {
		this.isMust = isMust;
	}

	public Integer getLenMin() {
		return this.lenMin;
	}

	public void setLenMin(Integer lenMin) {
		this.lenMin = lenMin;
	}

	public Integer getLevSec() {
		return this.levSec;
	}

	public void setLevSec(Integer levSec) {
		this.levSec = levSec;
	}

	public String getNoteBelow() {
		return this.noteBelow;
	}

	public void setNoteBelow(String noteBelow) {
		this.noteBelow = noteBelow;
	}

	public String getNoteHead() {
		return this.noteHead;
	}

	public void setNoteHead(String noteHead) {
		this.noteHead = noteHead;
	}

	public Integer getNumQue() {
		return this.numQue;
	}

	public void setNumQue(Integer numQue) {
		this.numQue = numQue;
	}

	public Integer getNumValid() {
		return this.numValid;
	}

	public void setNumValid(Integer numValid) {
		this.numValid = numValid;
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

	public String getSecName() {
		return this.secName;
	}

	public void setSecName(String secName) {
		this.secName = secName;
	}

	public String getSecNameCn() {
		return this.secNameCn;
	}

	public void setSecNameCn(String secNameCn) {
		this.secNameCn = secNameCn;
	}

	public Integer getSortPap() {
		return this.sortPap;
	}

	public void setSortPap(Integer sortPap) {
		this.sortPap = sortPap;
	}

	public Long[] getSubjects() {
		return this.subjects;
	}

	public void setSubjects(Long[] subjects) {
		this.subjects = subjects;
	}

	public Timestamp getTimeUpdate() {
		return this.timeUpdate;
	}

	public void setTimeUpdate(Timestamp timeUpdate) {
		this.timeUpdate = timeUpdate;
	}

}