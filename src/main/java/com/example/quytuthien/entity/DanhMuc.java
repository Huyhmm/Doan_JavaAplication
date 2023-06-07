package com.example.quytuthien.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "danhmuc")
public class DanhMuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "madanhmuc")
    private Long madanhmuc;

    @Column(name = "tendanhmuc")
    private String tendanhmuc;

    @Column(name = "mota")
    private String mota;

    @Column(name = "trangthai")
    private String trangthai;

}
