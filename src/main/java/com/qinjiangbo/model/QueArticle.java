package com.qinjiangbo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the que_article database table.
 * 
 */
@Entity
@Table(name="que_article")
@NamedQuery(name="QueArticle.findAll", query="SELECT q FROM QueArticle q")
public class QueArticle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="art_id")
	private Long artId;

	@Column(name="art_code")
	private String artCode;

	private String content;

	@Column(name="content_cn")
	private String contentCn;

	@Column(name="note_below")
	private String noteBelow;

	@Column(name="note_head")
	private String noteHead;

	@Column(name="read_id")
	private Long readId;

	@Column(name="sort_no")
	private Integer sortNo;

	private String source;

	private String theme;

	@Column(name="time_update")
	private Timestamp timeUpdate;

	private String title;

	@Column(name="title_cn")
	private String titleCn;

	public QueArticle() {
	}

	public Long getArtId() {
		return this.artId;
	}

	public void setArtId(Long artId) {
		this.artId = artId;
	}

	public String getArtCode() {
		return this.artCode;
	}

	public void setArtCode(String artCode) {
		this.artCode = artCode;
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

	public Long getReadId() {
		return this.readId;
	}

	public void setReadId(Long readId) {
		this.readId = readId;
	}

	public Integer getSortNo() {
		return this.sortNo;
	}

	public void setSortNo(Integer sortNo) {
		this.sortNo = sortNo;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTheme() {
		return this.theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
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

	public String getTitleCn() {
		return this.titleCn;
	}

	public void setTitleCn(String titleCn) {
		this.titleCn = titleCn;
	}

}