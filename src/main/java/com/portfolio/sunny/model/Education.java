package com.portfolio.sunny.model;

public class Education extends Resume implements Comparable<Education>{
    public Education(String years, String subtitle, String title, String description) {
        super(years, subtitle, title, description);
    }


    @Override
    public int compareTo(Education o) {
        return this.getYears().compareTo(o.getYears());
    }
}
