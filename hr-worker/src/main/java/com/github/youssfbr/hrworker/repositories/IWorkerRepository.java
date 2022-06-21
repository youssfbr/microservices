package com.github.youssfbr.hrworker.repositories;

import com.github.youssfbr.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IWorkerRepository extends JpaRepository<Worker, Long> {
}
