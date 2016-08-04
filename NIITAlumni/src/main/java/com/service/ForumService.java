package com.service;

import java.util.List;

import com.Model.Forum;

public interface ForumService {
	public void addForum(Forum u);

	public void updateForum(Forum u);

	public void deleteForum(Forum u);

	public Forum getForumbyId(int Forumid);

	public List<Forum> getForumList();
}
