package com.portfolio.sunny.model;

public class Experience extends  Resume implements Comparable<Experience>{
    public Experience(String years, String subtitle, String title, String description) {
        super(years, subtitle, title, description);
    }

    @Override
    public int compareTo(Experience o) {
        return this.getSubtitle().compareTo(o.getSubtitle());
    }
}
