package com.example.JsonParser;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Staff {

        private String name;
        private int age;
        private int experience;
        private String[] position;              //  Array
        private List<String> skills;            //  List
        private Map<String, BigDecimal> salary; //  Map

        // getters , setters, some boring stuff

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getExperience() {
        return experience;
    }

    public  void setExperience(int experience) {
        this.experience = experience;
    }
    public String[] getPosition() {
        return position;
    }

    public void setPosition(String[] position) {
        this.position = position;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public Map<String, BigDecimal> getSalary() {
        return salary;
    }

    public void setSalary(Map<String, BigDecimal> salary) {
        this.salary = salary;
    }
}

