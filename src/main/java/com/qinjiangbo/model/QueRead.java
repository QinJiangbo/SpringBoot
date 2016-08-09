package com.qinjiangbo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the que_read database table.
 * 
 */
@Entity
@Table(name="que_read")
@NamedQuery(name="QueRead.findAll", query="SELECT q FROM QueRead q")
public class QueRead implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="read_id")
	private Long readId;

	@Column(name="note_below")
	private String noteBelow;

	@Column(name="note_head")
	private String noteHead;

	@Column(name="num_art")
	private Integer numArt;

	@Column(name="sort_no")
	private Long sortNo;

	private Long subject;

	@Column(name="test_type")
	private Long testType;

	@Column(name="time_update")
	private Timestamp timeUpdate;

	private String title;

	@Column(name="up_id")
	private Long upId;

	public QueRead() {
	}

	public Long getReadId() {
		return this.readId;
	}

	public void setReadId(Long readId) {
		this.readId = readId;
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

	public Integer getNumArt() {
		return this.numArt;
	}

	public void setNumArt(Integer numArt) {
		this.numArt = numArt;
	}

	public Long getSortNo() {
		return this.sortNo;
	}

	public void setSortNo(Long sortNo) {
		this.sortNo = sortNo;
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

	public Long getUpId() {
		return this.upId;
	}

	public void setUpId(Long upId) {
		this.upId = upId;
	}

}