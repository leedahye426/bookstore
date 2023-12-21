package com.ll.domain.product.cart.repository;

import com.ll.domain.member.member.entity.Member;
import com.ll.domain.product.cart.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemRepository  extends JpaRepository<CartItem, Long> {
    List<CartItem> findByBuyer(Member buyer);
}
