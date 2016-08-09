package com.qinjiangbo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the wk_section database table.
 * 
 */
@Entity
@Table(name="wk_section")
@NamedQuery(name="WkSection.findAll", query="SELECT w FROM WkSection w")
public class WkSection implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private WkSectionPK id;

	@Column(name="len_sec")
	private Integer lenSec;

	@Column(name="num_not")
	private Integer numNot;

	@Column(name="num_que")
	private Integer numQue;

	@Column(name="num_right")
	private Integer numRight;

	@Column(name="num_wrong")
	private Integer numWrong;

	@Column(name="pap_id")
	private Long papId;

	@Column(name="time_end")
	private Timestamp timeEnd;

	@Column(name="time_start")
	private Timestamp timeStart;

	@Column(name="time_update")
	private Timestamp timeUpdate;

	@Column(name="user_id")
	private Long userId;

	public WkSection() {
	}

	public WkSectionPK getId() {
		return this.id;
	}

	public void setId(WkSectionPK id) {
		this.id = id;
	}

	public Integer getLenSec() {
		return this.lenSec;
	}

	public void setLenSec(Integer lenSec) {
		this.lenSec = lenSec;
	}

	public Integer getNumNot() {
		return this.numNot;
	}

	public void setNumNot(Integer numNot) {
		this.numNot = numNot;
	}

	public Integer getNumQue() {
		return this.numQue;
	}

	public void setNumQue(Integer numQue) {
		this.numQue = numQue;
	}

	public Integer getNumRight() {
		return this.numRight;
	}

	public void setNumRight(Integer numRight) {
		this.numRight = numRight;
	}

	public Integer getNumWrong() {
		return this.numWrong;
	}

	public void setNumWrong(Integer numWrong) {
		this.numWrong = numWrong;
	}

	public Long getPapId() {
		return this.papId;
	}

	public void setPapId(Long papId) {
		this.papId = papId;
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

}