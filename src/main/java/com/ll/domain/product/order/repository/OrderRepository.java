package com.ll.domain.product.order.repository;

import com.ll.domain.product.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
