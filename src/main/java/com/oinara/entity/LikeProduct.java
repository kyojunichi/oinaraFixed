package com.oinara.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name = "like_item")
public class LikeProduct {

    @Id
    @GeneratedValue
    @Column(name = "like_product_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "like_id")
    private ProductLike productLike;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int count;
}