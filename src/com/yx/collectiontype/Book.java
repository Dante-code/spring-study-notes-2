package com.yx.collectiontype;

import java.util.List;

public class Book {

    public void setList(List<String> list) {
        this.list = list;
    }

    private List<String> list;

    public void test(){
        System.out.println(list);
    }
}
