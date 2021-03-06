package com.example.demo.common.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import static com.example.demo.common.models.Common_Values.null_time;

@Embeddable
public class Point {

    @Column(columnDefinition = "double default 0")
    public double price;
    @Column(columnDefinition = "varchar(5) default '00:00'")
    public String time;
    @Column(columnDefinition = "varchar(100) default 'none'")
    public String significance;

    public Point(){
        price = 0;
        time = null_time;
        significance = "";
    }

    public String toString(){
        return  "price: "+price+"\n"+
                "time: "+time+"\n"+
                "significance: "+significance+"\n";
    }
}
