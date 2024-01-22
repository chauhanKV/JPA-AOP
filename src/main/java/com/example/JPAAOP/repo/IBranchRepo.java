package com.example.JPAAOP.repo;


import com.example.JPAAOP.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBranchRepo extends JpaRepository<Branch, Long> {
}
