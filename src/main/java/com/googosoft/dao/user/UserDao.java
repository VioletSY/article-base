package com.googosoft.dao.user;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.googosoft.pojo.User;

public interface UserDao {
 
	@Insert("INSERT INTO USER ( id, NAME ) VALUES ( #{id}, #{name} )")
	public int addUser(User user);

	@Delete("DELETE FROM USER WHERE	id = #{id}")
	public int deleteUser(@Param("id")String id);

	@Select("select id,name from user")
	public List<User> getUserList();

	@Update("update user set name=#{name} where id=#{id}")
	public int updateUser(@Param("id")String id,@Param("name")String name);

}
