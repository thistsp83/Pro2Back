package com.niit.dao;
import java.util.*;
public interface BlogDao {
	public void saveOrUpdateBlog(BlogDao blog);

	public BlogDao getBlogById(String blogId);

	public List<BlogDao> getAllBlogs();
	
	public boolean delete(String blogId);
}
