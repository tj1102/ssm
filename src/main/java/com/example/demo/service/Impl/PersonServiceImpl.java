package com.example.demo.service.Impl;


import com.example.demo.mapper.PersonMapper;
import com.example.demo.service.PersonService;
import com.example.demo.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;
    //添加信息
    @Override
    public int addPerson(Person person) {
        return personMapper.insertPerson(person);
    }
    //删除信息
    @Override
    public int deletePerson(Integer id) {
        return  personMapper.deletePerson(id);
    }
    //查询某一条信息
    @Override
    public Person selectPerson(Integer id) {
        return personMapper.selectPerson(id);
    }
    //更新一条数据
    @Override
    public int updatePerson(Person person) {
        return personMapper.updatePerson(person);
    }
    //查询所有信息
    @Override
    public List<Person> findAll() {
        return personMapper.selectAll();
    }
}
