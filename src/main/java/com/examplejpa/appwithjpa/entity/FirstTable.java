package com.examplejpa.appwithjpa.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "testing")
@Data
public class FirstTable {

    public FirstTable(long id, String name, String secName, String sec) {
        this.id = id;
        this.name = name;
        this.secName = secName;
        this.sec = sec;
    }

    public FirstTable() {
    }

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "second_name")
    private String secName;

    @Column(name = "sex")
    private String sec;

    @Override
    public String toString() {
        return "FirstTable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secName='" + secName + '\'' +
                ", sec='" + sec + '\'' +
                '}';
    }
}