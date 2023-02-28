package com.isidro.xml;

import java.time.LocalDate;
import java.util.Objects;

public class NoticiaSensacine {

	private String category;
	private String title;
	private String description;
	private String author;
	private String guid;
	private LocalDate pubDate;
	
	public NoticiaSensacine() {
		
	}

	public NoticiaSensacine(String title, String description, String category, String author, LocalDate pubDate,
			String guid) {
		super();
		this.title = title;
		this.description = description;
		this.category = category;
		this.author = author;
		this.pubDate = pubDate;
		this.guid = guid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDate getPubDate() {
		return pubDate;
	}

	public void setPubDate(LocalDate pubDate) {
		this.pubDate = pubDate;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	@Override
	public String toString() {
		return "NoticiaSensacine [title=" + title + ", description=" + description + ", category=" + category
				+ ", author=" + author + ", pubDate=" + pubDate + ", guid=" + guid + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(guid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NoticiaSensacine other = (NoticiaSensacine) obj;
		return Objects.equals(guid, other.guid);
	}
	
	
}
