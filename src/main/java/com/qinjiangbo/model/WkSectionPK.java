package com.qinjiangbo.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the wk_section database table.
 * 
 */
@Embeddable
public class WkSectionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="wk_id")
	private Long wkId;

	@Column(name="sec_id")
	private Long secId;

	public WkSectionPK() {
	}
	public Long getWkId() {
		return this.wkId;
	}
	public void setWkId(Long wkId) {
		this.wkId = wkId;
	}
	public Long getSecId() {
		return this.secId;
	}
	public void setSecId(Long secId) {
		this.secId = secId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof WkSectionPK)) {
			return false;
		}
		WkSectionPK castOther = (WkSectionPK)other;
		return 
			this.wkId.equals(castOther.wkId)
			&& this.secId.equals(castOther.secId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.wkId.hashCode();
		hash = hash * prime + this.secId.hashCode();
		
		return hash;
	}
}