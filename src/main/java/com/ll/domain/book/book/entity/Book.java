package com.ll.domain.book.book.entity;

import com.ll.domain.member.member.entity.Member;
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
public class Book extends BaseEntity {
    @ManyToOne
    private Member author;
    private String title;
    private String body;
    private int price;
}