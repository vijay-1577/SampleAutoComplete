package org.sample.web.domain;

public class LangugageModel {

	public int id;
	public String tagName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public LangugageModel(int id, String tagName) {
		this.id = id;
		this.tagName = tagName;
	}

}