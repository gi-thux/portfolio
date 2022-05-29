package com.portfolio.sunny.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
//@NoArgsConstructor
//@AllArgsConstructor
@Entity(name="resume")
@Table

public  abstract class Resume {
    public Resume(String years, String title, String subtitle, String description) {
        this.years = years;
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    @Getter
    private String years;
    @Column
    @Getter
    private String title;
    @Column
    @Getter
    private String subtitle;
    @Column
    @Getter
    private String description;


}
