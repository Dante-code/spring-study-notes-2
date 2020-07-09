package com.yx.test;

import com.yx.autowire.Emp;
import com.yx.collectiontype.Book;
import com.yx.collectiontype.Course;
import com.yx.collectiontype.Stu;
import com.yx.factoryBean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testBean1 {
    @Test
    public void testdemo1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);

        stu.output();
    }

    @Test
    public void testdemo2(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        Book book1 = context.getBean("book",Book.class);
        Book book2 = context.getBean("book",Book.class);
//        book1.test();
        System.out.println(book1);
        System.out.println(book2);
    }

    @Test
    public void testdemo3(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean3.xml");
        Course mybean = context.getBean("mybean",Course.class);
        System.out.println(mybean);

    }

    @Test
    public void testdemo4(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean4.xml");
        Emp emp = context.getBean("emp",Emp.class);
        System.out.println(emp);
    }
}
