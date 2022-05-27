package com.zeek.shardingjdbcdemo.mapper;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zeek.shardingjdbcdemo.entity.Course;

@Repository
public interface CourseMapper extends BaseMapper<Course> {
}
