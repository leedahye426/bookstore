package com.ll.domain.book.book.entity;

import com.ll.domain.member.member.entity.Member;
import com.ll.domain.product.product.entity.Product;
import com.ll.global.jpa.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.*;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Builder
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
@Setter
@Getter
@ToString(callSuper = true)
public class Book extends BaseEntity {
    @OneToOne
    private Product product;
    @ManyToOne
    private Member author;
    private String title;
    private String body;
    private int price;
}