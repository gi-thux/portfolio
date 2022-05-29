package com.portfolio.sunny.model;

import lombok.*;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name="portfolio_service")
@Table
public class PortfolioService implements Comparable<PortfolioService>{
    public PortfolioService(String serviceName, String serviceDescription, String serviceLogo) {
        this.serviceName = serviceName;
        this.serviceDescription = serviceDescription;
        this.serviceLogo = serviceLogo;
    }
 @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
 @Getter
    private Integer id;
    @Getter
    @Setter
    @Column(name="service_name")
    @NotEmpty(message="service name cannot be empty")
    private String serviceName;
    @Getter
    @Setter
    @Column(name="service_description")
    @NotEmpty(message="service description cannot be empty")
    private String serviceDescription;
    @Getter
    @Setter
    @Column(name="service_logo")
    @NotEmpty(message="service logo cannot be empty")
    private String serviceLogo;

    @Override
    public int compareTo(PortfolioService o) {
        return  this.serviceName.compareTo(o.serviceName);
    }

    @Override
    public String toString() {
        return "PortfolioService{" +
                "id=" + id +
                ", serviceName='" + serviceName + '\'' +
                ", serviceDescription='" + serviceDescription + '\'' +
                ", serviceLogo='" + serviceLogo + '\'' +
                '}';
    }
/* @Getter
    private String serviceName;

    @Getter
    private String serviceDes cription;

   @Getter
    private String serviceLogo;*/




}
