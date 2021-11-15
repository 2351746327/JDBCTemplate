package com.jxut.spring.dao;

import com.jxut.spring.entity.Student;

import java.util.List;

public interface StudentDao {
    //添加的方法
    void add(Student student);

    //更新的方法
    void updateStudent(Student student);

    //删除的方法
    void delete(String name);

    //查询表记录数
    int selectCount();

    //查询返回对象
    Student findStudentInfo(String name);

    List<Student> findAllStudent();
}
