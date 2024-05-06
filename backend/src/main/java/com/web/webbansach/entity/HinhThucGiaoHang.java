package com.web.webbansach.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="hinh_thuc_giao_hang")
public class HinhThucGiaoHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_hinh_thuc_giao_hang")
    private int maHinhThucGiaoHang;
    @Column(name = "ten_hinh_thuc_giao_hang")
    private String tenHinhThucGiaoHang;
    @Column(name = "mo_ta")
    private String moTa;
    @Column(name = "chi_phi_giao_hang")
    private double chiPhiGiaoHang;

    @OneToMany(mappedBy = "hinhThucGiaoHang",fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    private List<DonHang> danhSachDonHang;
}