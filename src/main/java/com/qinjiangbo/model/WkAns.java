package com.qinjiangbo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the wk_ans database table.
 * 
 */
@Entity
@Table(name="wk_ans")
@NamedQuery(name="WkAns.findAll", query="SELECT w FROM WkAns w")
public class WkAns implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ans_id")
	private Long ansId;

	@Column(name="ans_type")
	private Integer ansType;

	private String answer;

	@Column(name="is_fill")
	private Integer isFill;

	@Column(name="len_ans")
	private Integer lenAns;

	@Column(name="len_sec")
	private Integer lenSec;

	@Column(name="num_file")
	private Integer numFile;

	@Column(name="num_words")
	private Integer numWords;

	@Column(name="que_id")
	private Long queId;

	private String remark;

	@Column(name="score_intel")
	private BigDecimal scoreIntel;

	@Column(name="score_teach")
	private BigDecimal scoreTeach;

	@Column(name="sort_no")
	private Integer sortNo;

	private Integer status;

	@Column(name="tech_comment")
	private String techComment;

	@Column(name="tech_note")
	private String techNote;

	@Column(name="time_correct")
	private Timestamp timeCorrect;

	@Column(name="time_end")
	private Timestamp timeEnd;

	@Column(name="time_start")
	private Timestamp timeStart;

	@Column(name="time_update")
	private Timestamp timeUpdate;

	@Column(name="user_id")
	private Long userId;

	@Column(name="wk_id")
	private Long wkId;

	public WkAns() {
	}

	public Long getAnsId() {
		return this.ansId;
	}

	public void setAnsId(Long ansId) {
		this.ansId = ansId;
	}

	public Integer getAnsType() {
		return this.ansType;
	}

	public void setAnsType(Integer ansType) {
		this.ansType = ansType;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Integer getIsFill() {
		return this.isFill;
	}

	public void setIsFill(Integer isFill) {
		this.isFill = isFill;
	}

	public Integer getLenAns() {
		return this.lenAns;
	}

	public void setLenAns(Integer lenAns) {
		this.lenAns = lenAns;
	}

	public Integer getLenSec() {
		return this.lenSec;
	}

	public void setLenSec(Integer lenSec) {
		this.lenSec = lenSec;
	}

	public Integer getNumFile() {
		return this.numFile;
	}

	public void setNumFile(Integer numFile) {
		this.numFile = numFile;
	}

	public Integer getNumWords() {
		return this.numWords;
	}

	public void setNumWords(Integer numWords) {
		this.numWords = numWords;
	}

	public Long getQueId() {
		return this.queId;
	}

	public void setQueId(Long queId) {
		this.queId = queId;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public BigDecimal getScoreIntel() {
		return this.scoreIntel;
	}

	public void setScoreIntel(BigDecimal scoreIntel) {
		this.scoreIntel = scoreIntel;
	}

	public BigDecimal getScoreTeach() {
		return this.scoreTeach;
	}

	public void setScoreTeach(BigDecimal scoreTeach) {
		this.scoreTeach = scoreTeach;
	}

	public Integer getSortNo() {
		return this.sortNo;
	}

	public void setSortNo(Integer sortNo) {
		this.sortNo = sortNo;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getTechComment() {
		return this.techComment;
	}

	public void setTechComment(String techComment) {
		this.techComment = techComment;
	}

	public String getTechNote() {
		return this.techNote;
	}

	public void setTechNote(String techNote) {
		this.techNote = techNote;
	}

	public Timestamp getTimeCorrect() {
		return this.timeCorrect;
	}

	public void setTimeCorrect(Timestamp timeCorrect) {
		this.timeCorrect = timeCorrect;
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

	public Long getWkId() {
		return this.wkId;
	}

	public void setWkId(Long wkId) {
		this.wkId = wkId;
	}

}