package com.github.youssfbr.hrworker.resources;

import com.github.youssfbr.hrworker.entities.Worker;
import com.github.youssfbr.hrworker.repositories.IWorkerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("workers")
public class WorkerResource {

    private IWorkerRepository workerRepository;

    public WorkerResource(IWorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    @GetMapping
    public List<Worker> findAll() {
        return workerRepository.findAll();
    }

    @GetMapping("{workerId}")
    public Worker findById(@PathVariable Long workerId) {
        return workerRepository.findById(workerId).orElse(null);
    }
}
