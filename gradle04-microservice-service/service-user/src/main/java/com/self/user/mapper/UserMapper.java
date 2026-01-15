package com.self.user.mapper;

import com.self.bean.User;
import org.apache.ibatis.annotations.Select;


public interface UserMapper {

    @Select("select id,username,email,gender from \"user\" where id = #{id}")
    public User getUserInfo(Integer id);
}
