package ch13.domain.userinfo.dao;

import ch13.domain.userinfo.UserInfo;

public interface UserInfoDao {
	
	void insertUserInfo(UserInfo userInfo);
	void updatetUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
}
