package com.atguigu.shardingjdbcdemo.mapper;

import com.atguigu.shardingjdbcdemo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * @author: lichunxia
 * @create: 2021-02-22 08:29
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
