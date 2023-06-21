package com.example.practice2.dao;

import com.example.practice2.Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Studentdaoimpl implements Studentdao{
    private EntityManager em1;
    @Autowired
    public void Student(EntityManager em1){
      this.em1=em1;
    }
    @Override
     @Transactional
    public void create(com.example.practice2.Entity.Student theStudent) {
      em1.persist(theStudent);
    }
    @Override
     @Transactional
    public Student read(Integer id) {
      Student s1 = em1.find(Student.class,id);
      System.out.println(s1);
      return s1;
    }
    @Override
     @Transactional
    public void update(Student theStudent) {
      em1.merge(theStudent);
    }
    @Override
    @Transactional
    public void delete(Integer id) {
      Student s2 = em1.find(Student.class,id);
      em1.remove(s2);
    }
   
    
}

