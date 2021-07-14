package com.cykj.mapper;

import com.cykj.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/9 16:17
 * @desc:
 */
@Repository
public interface HelloMapper {

    User findUser(@Param("userName") String uName, @Param("password") String pwd);

    int insertUser(@Param("userName") String uName, @Param("password") String pwd);
}
