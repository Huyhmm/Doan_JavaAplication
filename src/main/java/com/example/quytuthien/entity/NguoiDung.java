package com.example.quytuthien.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "nguoidung")
public class NguoiDung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manguoidung")
    private Long manguoidung;

    @Column(name = "tendangnhap")
    private String tendangnhap;

    @Column(name = "matkhau")
    private String matkhau;

    @Column(name = "vaitro")
    private String vaitro;

    @Column(name = "hoten")
    private String hoten;

    @Column(name = "sdt")
    private String sdt;

    @Column(name = "email")
    private String email;

    @Column(name = "diachi")
    private String diachi;

    @Column(name = "trangthai")
    private String trangthai;
}
