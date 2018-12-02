package com.auth0.samples.authapi.springbootauthupdated.task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface TaskRepository extends JpaRepository<Task, Long> {
}