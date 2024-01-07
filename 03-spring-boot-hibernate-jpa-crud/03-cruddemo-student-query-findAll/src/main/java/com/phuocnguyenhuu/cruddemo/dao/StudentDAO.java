package com.phuocnguyenhuu.cruddemo.dao;

import com.phuocnguyenhuu.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

}
