package com.jxut.spring.dao;

import com.jxut.spring.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //添加的方法
    @Override
    public void add(Student student) {
        //创建sql语句
        String sql="insert into student values(?,?)";
        Object[] args={student.getName(), student.getPwd()};
        //调用方法实现
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    //更新的方法
    @Override
    public void updateStudent(Student student) {
        //创建sql语句
        String sql="update student set pwd=? where name=?";
        Object[] args={student.getPwd(),student.getName()};
        //调用方法实现
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    //删除的方法
    @Override
    public void delete(String name) {
        //创建sql语句
        String sql="delete from student where name=?";
        //调用方法实现
        int update = jdbcTemplate.update(sql,name);
        System.out.println(update);
    }

    //查询表记录数
    @Override
    public int selectCount() {
        String sql="select count(*) from student";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    //查询返回对象
    @Override
    public Student findStudentInfo(String name) {
        String sql="select * from student where name=?";
        //调用方法
        Student student = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Student>(Student.class), name);
        return student;
    }

    @Override
    public List<Student> findAllStudent() {
        String sql="select * from student";
        //调用方法
        List<Student> studentList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Student>(Student.class));
        return studentList;
    }
}
