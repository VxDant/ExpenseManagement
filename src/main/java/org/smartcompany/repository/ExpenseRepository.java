package org.smartcompany.repository;

import org.smartcompany.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    // Basic CRUD methods included automatically
}
