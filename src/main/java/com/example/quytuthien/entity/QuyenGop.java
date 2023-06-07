package com.example.quytuthien.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "quyengop")
public class QuyenGop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maquyengop")
    private Long maquyengop;

    @Column(name = "sotienquyengop")
    private Long sotienquyengop;

    @Column(name = "noidungquyengop")
    private String noidungquyengop;

    @Column(name = "ngayquyengop")
    private Date ngayquyengop;
}
