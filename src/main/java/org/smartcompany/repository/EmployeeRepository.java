package org.smartcompany.repository;

import org.smartcompany.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Basic CRUD methods included automatically
}
