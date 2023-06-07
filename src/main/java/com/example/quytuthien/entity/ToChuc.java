package com.example.quytuthien.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tochuc")
public class ToChuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "matochuc")
    private Long matochuc;

    @Column(name = "tentochuc")
    private String tentochuc;

    @Column(name = "mota")
    private String mota;

    @Column(name = "email")
    private String email;

    @Column(name = "trangthai")
    private String trangthai;
}
