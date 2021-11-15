package com.jxut.spring.test;

import com.jxut.spring.entity.Student;
import com.jxut.spring.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    @Test
    public void testJdbcTemplate(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        StudentService studentService=context.getBean("studentService",StudentService.class);

//        //添加的方法
//        Student student=new Student();
//        student.setName("张三");
//        student.setPwd("1234");
//        studentService.addStudent(student);

//        //更新的方法
//        Student student=new Student();
//        student.setName("张三");
//        student.setPwd("5678");
//        studentService.updateStudent(student);

//        //删除的方法
//        studentService.deleteStudent("张三");

//        //查询返回某个值
//        int count = studentService.findCount();
//        System.out.println(count);

//        //查询返回对象
//        Student student = studentService.findOne("张三");
//        System.out.println(student);

        //
    }
}
