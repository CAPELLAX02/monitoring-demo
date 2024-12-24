package com.capellax.monitoring.controller;

import com.capellax.monitoring.model.MonitoredService;
import com.capellax.monitoring.service.MonitoredServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/monitored-services")
@RequiredArgsConstructor
public class MonitoredServiceController {

    private final MonitoredServiceService service;

    @GetMapping
    public ResponseEntity<List<MonitoredService>> getAllServices() {
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping
    public ResponseEntity<MonitoredService> addService(
            @RequestBody MonitoredService monitoredService
    ) {
        return ResponseEntity.ok(service.save(monitoredService));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteService(
            @PathVariable Long id
    ) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
