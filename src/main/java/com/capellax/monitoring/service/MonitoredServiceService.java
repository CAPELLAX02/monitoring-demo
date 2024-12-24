package com.capellax.monitoring.service;

import com.capellax.monitoring.model.MonitoredService;
import com.capellax.monitoring.repository.MonitoredServiceRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MonitoredServiceService {

    private final MonitoredServiceRepository repository;

    public List<MonitoredService> findAll() {
        return repository.findAll();
    }

    public MonitoredService findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Monitored service with id " + id + " not found"));
    }

    @Transactional
    public MonitoredService save(MonitoredService monitoredService) {
        return repository.save(monitoredService);
    }

    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
