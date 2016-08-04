package com.Model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Forum
{
	@Id
	@GeneratedValue
	private int forumid;
	public int getForumid() {
		return forumid;
	}
	public void setForumid(int forumid) {
		this.forumid = forumid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public Date getForumcreationdate() {
		return forumcreationdate;
	}
	public void setForumcreationdate(Date forumcreationdate) {
		this.forumcreationdate = forumcreationdate;
	}
	private String category;
	private String topic;
	private Date forumcreationdate;
}