package com.southwind.repository;

import com.southwind.entity.Student;

import java.util.Collection;

/**
 * @program: aispringcloud
 * @description:
 * @author: Jiakun
 * @create: 2020-02-21 12:55
 **/
public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(Long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}