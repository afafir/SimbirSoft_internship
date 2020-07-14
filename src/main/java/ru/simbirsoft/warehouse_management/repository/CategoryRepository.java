package ru.simbirsoft.warehouse_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.simbirsoft.warehouse_management.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}