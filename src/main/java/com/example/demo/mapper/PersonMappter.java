package com.example.demo.mapper;

import com.example.demo.pojo.Person;

import java.util.List;

public interface PersonMappter {
    //添加信息
    int insertPerson(Person person);
    //删除信息
    int deletePerson(Integer id);
    //查看某一条信息
    Person selectPerson(Integer id);
    //更新一条信息
    int updatePerson(Person person);
    //查看所有的信息
    List<Person> selectAll();
}
