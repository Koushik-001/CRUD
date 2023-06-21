package com.example.practice2.dao;

import com.example.practice2.Entity.Student;

public interface Studentdao {
void create(Student theStudent);
Student read(Integer id);
void update(Student theStudent);
void delete(Integer id);
}
