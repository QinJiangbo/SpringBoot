package com.qinjiangbo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the que_question database table.
 * 
 */
@Entity
@Table(name="que_question")
@NamedQueries({
	@NamedQuery(name="QueQuestion.findAll", query="SELECT q FROM QueQuestion q")
	})
public class QueQuestion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="que_id")
	private Long queId;

	private String ans;

	@Column(name="ans_order")
	private Integer ansOrder;

	@Column(name="ans_rule")
	private String ansRule;

	@Column(name="art_desc")
	private String artDesc;

	private String content;

	@Column(name="content_cn")
	private String contentCn;

	@Column(name="len_sec")
	private Integer lenSec;

	private Integer lev;

	@Column(name="lev_dk")
	private Integer levDk;

	@Column(name="note_below")
	private String noteBelow;

	@Column(name="note_head")
	private String noteHead;

	@Column(name="num_ans")
	private Integer numAns;

	@Column(name="num_file")
	private Integer numFile;

	@Column(name="num_right")
	private Integer numRight;

	@Column(name="org_id")
	private Long orgId;

	@Column(name="que_code")
	private String queCode;

	@Column(name="que_type")
	private Long queType;

	@Column(name="read_id")
	private Long readId;

	@Column(name="read_top")
	private Long readTop;

	private BigDecimal score;

	private Long src;

	private Integer status;

	private Long subject;

	@Column(name="test_type")
	private Long testType;

	@Column(name="time_create")
	private Timestamp timeCreate;

	@Column(name="time_publish")
	private Timestamp timePublish;

	@Column(name="time_update")
	private Timestamp timeUpdate;

	private String title;

	@Column(name="user_create")
	private Long userCreate;

	public QueQuestion() {
	}

	public Long getQueId() {
		return this.queId;
	}

	public void setQueId(Long queId) {
		this.queId = queId;
	}

	public String getAns() {
		return this.ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public Integer getAnsOrder() {
		return this.ansOrder;
	}

	public void setAnsOrder(Integer ansOrder) {
		this.ansOrder = ansOrder;
	}

	public String getAnsRule() {
		return this.ansRule;
	}

	public void setAnsRule(String ansRule) {
		this.ansRule = ansRule;
	}

	public String getArtDesc() {
		return this.artDesc;
	}

	public void setArtDesc(String artDesc) {
		this.artDesc = artDesc;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContentCn() {
		return this.contentCn;
	}

	public void setContentCn(String contentCn) {
		this.contentCn = contentCn;
	}

	public Integer getLenSec() {
		return this.lenSec;
	}

	public void setLenSec(Integer lenSec) {
		this.lenSec = lenSec;
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

	public Integer getNumAns() {
		return this.numAns;
	}

	public void setNumAns(Integer numAns) {
		this.numAns = numAns;
	}

	public Integer getNumFile() {
		return this.numFile;
	}

	public void setNumFile(Integer numFile) {
		this.numFile = numFile;
	}

	public Integer getNumRight() {
		return this.numRight;
	}

	public void setNumRight(Integer numRight) {
		this.numRight = numRight;
	}

	public Long getOrgId() {
		return this.orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public String getQueCode() {
		return this.queCode;
	}

	public void setQueCode(String queCode) {
		this.queCode = queCode;
	}

	public Long getQueType() {
		return this.queType;
	}

	public void setQueType(Long queType) {
		this.queType = queType;
	}

	public Long getReadId() {
		return this.readId;
	}

	public void setReadId(Long readId) {
		this.readId = readId;
	}

	public Long getReadTop() {
		return this.readTop;
	}

	public void setReadTop(Long readTop) {
		this.readTop = readTop;
	}

	public BigDecimal getScore() {
		return this.score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getUserCreate() {
		return this.userCreate;
	}

	public void setUserCreate(Long userCreate) {
		this.userCreate = userCreate;
	}

}