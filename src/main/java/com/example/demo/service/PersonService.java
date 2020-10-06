package com.example.demo.service;

import com.example.demo.pojo.Person;

import java.util.List;

public interface PersonService {
    //添加信息
    int addPerson(Person person);
    //删除信息
    int deletePerson(Integer id);
    //查询某一条信息
    Person selectPerson(Integer id);
    //更新一条信息
    int updatePerson(Person person);
    //查看所有的信息
    List<Person> findAll();
}
