package com.qinjiangbo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the que_paper_que database table.
 * 
 */
@Entity
@Table(name="que_paper_que")
@NamedQuery(name="QuePaperQue.findAll", query="SELECT q FROM QuePaperQue q")
public class QuePaperQue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long qid;

	@Column(name="is_first")
	private Long isFirst;

	@Column(name="pap_id")
	private Long papId;

	@Column(name="que_id")
	private Long queId;

	@Column(name="read_id")
	private Long readId;

	@Column(name="sec_id")
	private Long secId;

	@Column(name="sort_pap")
	private Integer sortPap;

	@Column(name="sort_read")
	private Integer sortRead;

	@Column(name="sort_sec")
	private Integer sortSec;

	@Column(name="time_update")
	private Timestamp timeUpdate;

	public QuePaperQue() {
	}

	public Long getQid() {
		return this.qid;
	}

	public void setQid(Long qid) {
		this.qid = qid;
	}

	public Long getIsFirst() {
		return this.isFirst;
	}

	public void setIsFirst(Long isFirst) {
		this.isFirst = isFirst;
	}

	public Long getPapId() {
		return this.papId;
	}

	public void setPapId(Long papId) {
		this.papId = papId;
	}

	public Long getQueId() {
		return this.queId;
	}

	public void setQueId(Long queId) {
		this.queId = queId;
	}

	public Long getReadId() {
		return this.readId;
	}

	public void setReadId(Long readId) {
		this.readId = readId;
	}

	public Long getSecId() {
		return this.secId;
	}

	public void setSecId(Long secId) {
		this.secId = secId;
	}

	public Integer getSortPap() {
		return this.sortPap;
	}

	public void setSortPap(Integer sortPap) {
		this.sortPap = sortPap;
	}

	public Integer getSortRead() {
		return this.sortRead;
	}

	public void setSortRead(Integer sortRead) {
		this.sortRead = sortRead;
	}

	public Integer getSortSec() {
		return this.sortSec;
	}

	public void setSortSec(Integer sortSec) {
		this.sortSec = sortSec;
	}

	public Timestamp getTimeUpdate() {
		return this.timeUpdate;
	}

	public void setTimeUpdate(Timestamp timeUpdate) {
		this.timeUpdate = timeUpdate;
	}

}