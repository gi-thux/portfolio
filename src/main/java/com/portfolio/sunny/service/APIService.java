package com.portfolio.sunny.service;
import com.portfolio.sunny.exception.ServiceNotFoundException;
import com.portfolio.sunny.model.PortfolioService;
import com.portfolio.sunny.repository.PortfolioServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class APIService {
    @Autowired
    private PortfolioServiceRepository portfolioServiceRepository;

    public List<PortfolioService> getAllServices() {
        List<PortfolioService> services = new ArrayList<>();
        portfolioServiceRepository.findAll().forEach(services::add);
        return services;
    }

    public PortfolioService saveService(PortfolioService portfolioService) {
        return portfolioServiceRepository.save(portfolioService);
    }

    public PortfolioService updateService(Integer id, PortfolioService portfolioService) {
        Optional<PortfolioService> optionalService = portfolioServiceRepository.findById(id);
        if (optionalService.isPresent()) {
            PortfolioService updateableService = optionalService.get();
            updateableService.setServiceName(portfolioService.getServiceName());
            updateableService.setServiceDescription((portfolioService.getServiceDescription()));
            updateableService.setServiceLogo((portfolioService.getServiceLogo()));
            return portfolioServiceRepository.save(portfolioService);
        } else {
            throw new ServiceNotFoundException("This id your are trying to update does not exist");
        }
    }
    public void deleteService(Integer id) {

        try {
            portfolioServiceRepository.deleteById(id);
        } catch (EmptyResultDataAccessException ex){
            throw new ServiceNotFoundException("This data that you are trying to delete is not available ");
    }
    }
}