package nchu.software.soccer.dao;

import nchu.software.soccer.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    @Insert("insert into user values(#{name},#{age})")
    Integer addUser(User user);
   //@Select("select * from user")
    List<User> selectUser();
}
