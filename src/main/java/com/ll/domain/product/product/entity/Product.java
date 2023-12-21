package com.ll.domain.product.product.entity;

import com.ll.domain.book.book.entity.Book;
import com.ll.domain.member.member.entity.Member;
import com.ll.global.app.AppConfig;
import com.ll.global.jpa.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Builder
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
@Setter
@Getter
@ToString(callSuper = true)
public class Product extends BaseEntity {
    @ManyToOne
    private Member maker;
    private String relTypeCode;
    private long relId;
    private String name;
    private int price;

    public Book getBook() {
        return AppConfig.getEntityManager().getReference(Book.class, relId);
    }
}
