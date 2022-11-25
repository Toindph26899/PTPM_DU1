package com.model;

import java.util.Date;

public class GiamGia {

    private String id;
    private String ma;
    private String tenCT;
    private Long soTienGiam;
    private Date ngayTao;
    private Date ngayDienRa;
    private Date ngayKetThuc;

    public GiamGia() {
    }

    public GiamGia(String id, String ma, String tenCT, Long soTienGiam, Date ngayTao, Date ngayDienRa, Date ngayKetThuc) {
        this.id = id;
        this.ma = ma;
        this.tenCT = tenCT;
        this.soTienGiam = soTienGiam;
        this.ngayTao = ngayTao;
        this.ngayDienRa = ngayDienRa;
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenCT() {
        return tenCT;
    }

    public void setTenCT(String tenCT) {
        this.tenCT = tenCT;
    }

    public Long getSoTienGiam() {
        return soTienGiam;
    }

    public void setSoTienGiam(Long soTienGiam) {
        this.soTienGiam = soTienGiam;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayDienRa() {
        return ngayDienRa;
    }

    public void setNgayDienRa(Date ngayDienRa) {
        this.ngayDienRa = ngayDienRa;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    @Override
    public String toString() {
        return "GiamGia{" + "id=" + id + ", ma=" + ma + ", tenCT=" + tenCT + ", soTienGiam=" + soTienGiam + ", ngayTao=" + ngayTao + ", ngayDienRa=" + ngayDienRa + ", ngayKetThuc=" + ngayKetThuc + '}';
    }

}
