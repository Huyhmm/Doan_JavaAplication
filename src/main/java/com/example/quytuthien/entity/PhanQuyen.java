package com.example.quytuthien.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "phanquyen")
public class PhanQuyen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maphanquyen")
    private Long maphanquyen;

    @Column(name = "tenphanquyen")
    private String tenphanquyen;

    @Column(name = "mota")
    private String mota;
}
