package com.yx.autowire;

public class Emp {

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    private Dept dept;

    public void test(){
        System.out.println(dept);
    }
}
