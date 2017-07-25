package com.niit.dao;
import com.niit.model.Friend;
import com.niit.model.User;
import java.util.*;
public interface FriendDao {
public List<Friend> getMyFriend(String userID);
	
	public Friend get(String userID, String friendID);

		public boolean save(Friend friends);
		public boolean update(Friend friends);
		public boolean delete(String userID, String friendID);
		public List<Friend> getNewFriendRequests(String userID);
		public List<User> showNewUsers(String userID);
		public void setOnline(String userID);
public void setOffLine(String loggedInUserID);
}
