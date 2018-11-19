package com.l2r.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.l2r.entity.User;

/**
 * 用户Respository接口
 * @author 郭鹏
 *
 */
public interface UserRepository extends JpaRepository<User, Integer>{
	
	/**
	 * 根据用户名查找实体
	 * @param userName
	 * @return
	 */
	@Query(value="select * from t_user where user_name=?1",nativeQuery=true)
	public User findByUserName(String userName);

}
