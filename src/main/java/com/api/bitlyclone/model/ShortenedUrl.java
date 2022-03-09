package com.api.bitlyclone.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shortened_urls")
public class ShortenedUrl {
	
	@Id
	@GeneratedValue
	private Long id;

	private String longURL;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLongURL() {
		return longURL;
	}

	public void setLongURL(String longURL) {
		this.longURL = longURL;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((longURL == null) ? 0 : longURL.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShortenedUrl other = (ShortenedUrl) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (longURL == null) {
			if (other.longURL != null)
				return false;
		} else if (!longURL.equals(other.longURL))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ShortenedUrl [id=" + id + ", longURL=" + longURL + "]";
	}
}
