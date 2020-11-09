package com.example.demo.controller;

import com.example.demo.pojo.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
    @Autowired
    private PersonService personService;
    //查找所有信息
    @RequestMapping(value = "/findAll")
    public List<Person> findAll(){
        return personService.findAll();
    }
    @RequestMapping(value =  "add")
    public int addPerson(){
        Person p=new Person(4,"小红",21);
        int stat= personService.addPerson(p);
    return stat;
    }
    //更新一条数据
    @RequestMapping(value = "update")
    public int updatePerson(){
        Person p=new Person(1,"小兰",18);
        int update= personService.updatePerson(p);
        return update;
    }
    //删除一条数据
    @RequestMapping(value = "delete")
    public int deletePerson(){
        return personService.deletePerson(4);
    }
    //查看某一条数据
    @RequestMapping(value = "select")
    public Person selectPerson(){
        return personService.selectPerson(3);
    }
}
