package com.qinjiangbo.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the que_attr_busi database table.
 * 
 */
@Embeddable
public class QueAttrBusiPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="busi_id")
	private Long busiId;

	@Column(name="attr_id")
	private Long attrId;

	public QueAttrBusiPK() {
	}
	public Long getBusiId() {
		return this.busiId;
	}
	public void setBusiId(Long busiId) {
		this.busiId = busiId;
	}
	public Long getAttrId() {
		return this.attrId;
	}
	public void setAttrId(Long attrId) {
		this.attrId = attrId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof QueAttrBusiPK)) {
			return false;
		}
		QueAttrBusiPK castOther = (QueAttrBusiPK)other;
		return 
			this.busiId.equals(castOther.busiId)
			&& this.attrId.equals(castOther.attrId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.busiId.hashCode();
		hash = hash * prime + this.attrId.hashCode();
		
		return hash;
	}
}