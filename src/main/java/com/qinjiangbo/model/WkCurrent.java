package com.qinjiangbo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the wk_current database table.
 * 
 */
@Entity
@Table(name="wk_current")
@NamedQuery(name="WkCurrent.findAll", query="SELECT w FROM WkCurrent w")
public class WkCurrent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="wk_id")
	private Long wkId;

	@Column(name="pap_id")
	private Long papId;

	@Column(name="que_id")
	private Long queId;

	@Column(name="sec_id")
	private Long secId;

	@Column(name="time_end")
	private Timestamp timeEnd;

	@Column(name="user_id")
	private Long userId;

	@Column(name="wk_type")
	private Long wkType;

	public WkCurrent() {
	}

	public Long getWkId() {
		return this.wkId;
	}

	public void setWkId(Long wkId) {
		this.wkId = wkId;
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

	public Long getSecId() {
		return this.secId;
	}

	public void setSecId(Long secId) {
		this.secId = secId;
	}

	public Timestamp getTimeEnd() {
		return this.timeEnd;
	}

	public void setTimeEnd(Timestamp timeEnd) {
		this.timeEnd = timeEnd;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getWkType() {
		return this.wkType;
	}

	public void setWkType(Long wkType) {
		this.wkType = wkType;
	}

}