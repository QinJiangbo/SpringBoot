package com.qinjiangbo.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the wk_practice database table.
 * 
 */
@Embeddable
public class WkPracticePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="user_id")
	private Long userId;

	private Long types;

	private String title;

	public WkPracticePK() {
	}
	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getTypes() {
		return this.types;
	}
	public void setTypes(Long types) {
		this.types = types;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof WkPracticePK)) {
			return false;
		}
		WkPracticePK castOther = (WkPracticePK)other;
		return 
			this.userId.equals(castOther.userId)
			&& this.types.equals(castOther.types)
			&& this.title.equals(castOther.title);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userId.hashCode();
		hash = hash * prime + this.types.hashCode();
		hash = hash * prime + this.title.hashCode();
		
		return hash;
	}
}