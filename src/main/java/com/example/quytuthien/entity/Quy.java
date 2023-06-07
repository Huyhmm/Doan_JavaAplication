package com.example.quytuthien.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "quy")
public class Quy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maquy")
    private Long maquy;

    @Column(name = "tenquy")
    private String tenquy;

    @Column(name = "mota")
    private String mota;

    @Column(name = "chude")
    private String chude;

    @Column(name = "hinhanh")
    private String hinhanh;

    @Column(name = "keyquamongdoi")
    private String ketquamongdoi;

    @Column(name = "trangthai")
    private String trangthai;

    @Column(name = "ngaybatdau")
    private Date ngaybatdau;

    @Column(name = "ngayketthuc")
    private Date ngayketthuc;
}
