package com.yx.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    public void setCoures(String[] coures) {
        this.coures = coures;
    }

    //    数组类型的属性
    private String[] coures;

    public void setList(List<String> list) {
        this.list = list;
    }

    //    创建list集合类型属性
    private List<String> list;

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    //    创建map映射类型属性
    private Map<String,String>maps;

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    //    创建set集合类型属性
    private Set<String>sets;



    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    private List<Course> courseList;

    public void output(){
        System.out.println(Arrays.toString(coures));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(sets);
        System.out.println(courseList.toString());
    }
}
