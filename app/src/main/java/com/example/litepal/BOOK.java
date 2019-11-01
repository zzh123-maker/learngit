package com.example.litepal;

import org.litepal.crud.DataSupport;

public class BOOK extends DataSupport {
    private int id;
    private int price;
    private String name;
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
    public int getPrice()
    {
        return price;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
}
