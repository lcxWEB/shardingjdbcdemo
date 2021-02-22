package com.atguigu.shardingjdbcdemo;

import com.atguigu.shardingjdbcdemo.entity.Course;
import com.atguigu.shardingjdbcdemo.entity.User;
import com.atguigu.shardingjdbcdemo.mapper.CourseMapper;
import com.atguigu.shardingjdbcdemo.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ShardingjdbcdemoApplicationTests {


    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private UserMapper userMapper;


    @Test
    void addUser() {
        User user = new User();
        user.setUsername("lucky");
        user.setUstatus("enable");
        userMapper.insert(user);
    }

    @Test
    void findUser() {
        LambdaQueryWrapper<User> queryWrapper = Wrappers.<User>lambdaQuery().eq(User::getUserId, 570597786043547648L);
        User user = userMapper.selectOne(queryWrapper);
        System.out.println(user);
    }

    @Test
    void addCourse() {
        for (int i = 0; i < 10; i++) {
            Course course = new Course();
            course.setCname("java" + i);
            course.setUserId((long) (i + 1));
            course.setCstatus("Normal");
            courseMapper.insert(course);
        }
    }

    @Test
    void findCourse() {
        LambdaQueryWrapper<Course> queryWrapper = Wrappers.<Course>lambdaQuery().eq(Course::getCid, 570358098166808577L);
        Course course = courseMapper.selectOne(queryWrapper);
        System.out.println(course);

        LambdaQueryWrapper<Course> queryWrapper1 = Wrappers.<Course>lambdaQuery().like(Course::getCname, "java");
        List<Course> courses = courseMapper.selectList(queryWrapper1);
        System.out.println(courses);
    }

}
