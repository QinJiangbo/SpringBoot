package com.qinjiangbo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the que_answer database table.
 * 
 */
@Entity
@Table(name="que_answer")
@NamedQuery(name="QueAnswer.findAll", query="SELECT q FROM QueAnswer q")
public class QueAnswer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ans_id")
	private Long ansId;

	private String content;

	@Column(name="content_cn")
	private String contentCn;

	@Column(name="num_file")
	private Integer numFile;

	@Column(name="que_id")
	private Long queId;

	@Column(name="sort_no")
	private Integer sortNo;

	@Column(name="time_update")
	private Timestamp timeUpdate;

	public QueAnswer() {
	}

	public Long getAnsId() {
		return this.ansId;
	}

	public void setAnsId(Long ansId) {
		this.ansId = ansId;
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

	public Integer getNumFile() {
		return this.numFile;
	}

	public void setNumFile(Integer numFile) {
		this.numFile = numFile;
	}

	public Long getQueId() {
		return this.queId;
	}

	public void setQueId(Long queId) {
		this.queId = queId;
	}

	public Integer getSortNo() {
		return this.sortNo;
	}

	public void setSortNo(Integer sortNo) {
		this.sortNo = sortNo;
	}

	public Timestamp getTimeUpdate() {
		return this.timeUpdate;
	}

	public void setTimeUpdate(Timestamp timeUpdate) {
		this.timeUpdate = timeUpdate;
	}

}