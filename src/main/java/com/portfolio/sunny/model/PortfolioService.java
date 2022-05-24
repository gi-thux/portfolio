package com.portfolio.sunny.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class PortfolioService {

    @Getter
    private String serviceName;
    @Getter
    private String serviceDescription;
    @Getter
    private String serviceLogo;

}
