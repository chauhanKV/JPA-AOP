package com.example.JPAAOP.repo;


import com.example.JPAAOP.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Long> {
    Employee findByEmail(String email);
}
