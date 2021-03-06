package ru.simbirsoft.warehouse_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.simbirsoft.warehouse_management.model.OrderItem;
import ru.simbirsoft.warehouse_management.model.pk.OrderItemPk;

/** Jpa repository for OrderItem entity */
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {
}
