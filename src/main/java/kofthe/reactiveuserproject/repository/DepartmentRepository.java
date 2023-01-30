package kofthe.reactiveuserproject.repository;

import kofthe.reactiveuserproject.model.Department;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface DepartmentRepository extends ReactiveCrudRepository<Department, Integer> {
}
