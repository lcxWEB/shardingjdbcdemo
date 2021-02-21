package com.atguigu.shardingjdbcdemo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author: lichunxia
 * @create: 2021-02-21 19:52
 */
@Data
public class Course {

    private Long cid;

    private String cname;

    private Long userId;

    private String cstatus;


}
