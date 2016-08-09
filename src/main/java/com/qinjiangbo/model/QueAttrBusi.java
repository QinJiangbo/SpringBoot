package com.qinjiangbo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the que_attr_busi database table.
 * 
 */
@Entity
@Table(name="que_attr_busi")
@NamedQuery(name="QueAttrBusi.findAll", query="SELECT q FROM QueAttrBusi q")
public class QueAttrBusi implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private QueAttrBusiPK id;

	@Column(name="time_update")
	private Timestamp timeUpdate;

	public QueAttrBusi() {
	}

	public QueAttrBusiPK getId() {
		return this.id;
	}

	public void setId(QueAttrBusiPK id) {
		this.id = id;
	}

	public Timestamp getTimeUpdate() {
		return this.timeUpdate;
	}

	public void setTimeUpdate(Timestamp timeUpdate) {
		this.timeUpdate = timeUpdate;
	}

}