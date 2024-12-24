package com.capellax.monitoring.repository;

import com.capellax.monitoring.model.MonitoredService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonitoredServiceRepository extends JpaRepository<MonitoredService, Long> {
}
