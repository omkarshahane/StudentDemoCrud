package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.bean.Student;

public interface StudentDao extends JpaRepository<Student,Integer> {

}
