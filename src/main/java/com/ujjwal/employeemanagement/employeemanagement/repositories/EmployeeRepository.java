package com.ujjwal.employeemanagement.employeemanagement.repositories;

import com.ujjwal.employeemanagement.employeemanagement.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
