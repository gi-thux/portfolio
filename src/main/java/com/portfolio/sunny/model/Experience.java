package com.portfolio.sunny.model;

import lombok.Getter;

import javax.persistence.*;

//@Entity
//@Table(name="tbl_experience")
public class Experience extends  Resume implements Comparable<Experience>{
    public Experience(String years, String subtitle, String title, String description) {
        super(years, subtitle, title, description);
    }

   /* @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Integer id;
    @Column
    @Getter
    private String years=super.getYear();
*/


    @Override
    public int compareTo(Experience o) {
        return this.getSubtitle().compareTo(o.getSubtitle());
    }
}
