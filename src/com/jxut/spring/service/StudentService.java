package com.jxut.spring.service;

import com.jxut.spring.dao.StudentDao;
import com.jxut.spring.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service
public class StudentService {
    //注入dao
    @Autowired
    private StudentDao studentDao;

    //添加的方法
    public void addStudent(Student student){
        studentDao.add(student);
    }

    //更新的方法
    public void updateStudent(Student student){
        studentDao.updateStudent(student);
    }

    //删除的方法
    public void deleteStudent(String name){
        studentDao.delete(name);
    }

    //查询表记录数
    public int findCount(){
        return studentDao.selectCount();
    }

    //查询返回对象
    public Student findOne(String name){
        return studentDao.findStudentInfo(name);
    }

    //查询返回集合
    public List<Student> findAll(){
        return studentDao.findAllStudent();
    }
}
