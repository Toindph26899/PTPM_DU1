package com.model;

import java.util.Date;

public class HoaDon {

    private String id;
    private String idNhanVien;
    private String idKh;
    private String idGiamGia;
    private String ma;
    private Date ngayTao;
    private Date ngayThanhToan;
    private Date ngayShip;
    private Long tienShip;
    private Long tienCoc;
    private Date ngayNhan;
    private String tenKh;
    private String sdtNguoiNhan;
    private String sdtNguoiShip;
    private String tenNguoiShip;
    private String maVanChuyen;
    private int tinhTrang;
    private Long soTienGiam;
    private String ghiChu;

    public HoaDon() {
    }

    public HoaDon(String id, String idNhanVien, String idKh, String idGiamGia, String ma, Date ngayTao, Date ngayThanhToan, Date ngayShip, Long tienShip, Long tienCoc, Date ngayNhan, String tenKh, String sdtNguoiNhan, String sdtNguoiShip, String tenNguoiShip, String maVanChuyen, int tinhTrang, Long soTienGiam, String ghiChu) {
        this.id = id;
        this.idNhanVien = idNhanVien;
        this.idKh = idKh;
        this.idGiamGia = idGiamGia;
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.ngayShip = ngayShip;
        this.tienShip = tienShip;
        this.tienCoc = tienCoc;
        this.ngayNhan = ngayNhan;
        this.tenKh = tenKh;
        this.sdtNguoiNhan = sdtNguoiNhan;
        this.sdtNguoiShip = sdtNguoiShip;
        this.tenNguoiShip = tenNguoiShip;
        this.maVanChuyen = maVanChuyen;
        this.tinhTrang = tinhTrang;
        this.soTienGiam = soTienGiam;
        this.ghiChu = ghiChu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getIdKh() {
        return idKh;
    }

    public void setIdKh(String idKh) {
        this.idKh = idKh;
    }

    public String getIdGiamGia() {
        return idGiamGia;
    }

    public void setIdGiamGia(String idGiamGia) {
        this.idGiamGia = idGiamGia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public Date getNgayShip() {
        return ngayShip;
    }

    public void setNgayShip(Date ngayShip) {
        this.ngayShip = ngayShip;
    }

    public Long getTienShip() {
        return tienShip;
    }

    public void setTienShip(Long tienShip) {
        this.tienShip = tienShip;
    }

    public Long getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(Long tienCoc) {
        this.tienCoc = tienCoc;
    }

    public Date getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(Date ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }

    public String getSdtNguoiNhan() {
        return sdtNguoiNhan;
    }

    public void setSdtNguoiNhan(String sdtNguoiNhan) {
        this.sdtNguoiNhan = sdtNguoiNhan;
    }

    public String getSdtNguoiShip() {
        return sdtNguoiShip;
    }

    public void setSdtNguoiShip(String sdtNguoiShip) {
        this.sdtNguoiShip = sdtNguoiShip;
    }

    public String getTenNguoiShip() {
        return tenNguoiShip;
    }

    public void setTenNguoiShip(String tenNguoiShip) {
        this.tenNguoiShip = tenNguoiShip;
    }

    public String getMaVanChuyen() {
        return maVanChuyen;
    }

    public void setMaVanChuyen(String maVanChuyen) {
        this.maVanChuyen = maVanChuyen;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public Long getSoTienGiam() {
        return soTienGiam;
    }

    public void setSoTienGiam(Long soTienGiam) {
        this.soTienGiam = soTienGiam;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "id=" + id + ", idNhanVien=" + idNhanVien + ", idKh=" + idKh + ", idGiamGia=" + idGiamGia + ", ma=" + ma + ", ngayTao=" + ngayTao + ", ngayThanhToan=" + ngayThanhToan + ", ngayShip=" + ngayShip + ", tienShip=" + tienShip + ", tienCoc=" + tienCoc + ", ngayNhan=" + ngayNhan + ", tenKh=" + tenKh + ", sdtNguoiNhan=" + sdtNguoiNhan + ", sdtNguoiShip=" + sdtNguoiShip + ", tenNguoiShip=" + tenNguoiShip + ", maVanChuyen=" + maVanChuyen + ", tinhTrang=" + tinhTrang + ", soTienGiam=" + soTienGiam + ", ghiChu=" + ghiChu + '}';
    }

}
