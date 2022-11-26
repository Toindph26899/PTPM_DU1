package com.viewmodel;

public class GioHangChiTiet {

    private String idHoaDon;
    private String idChiTietSp;
    private String anh;
    private String tenSp;
    private int soLuong;
    private Long donGia;

    public GioHangChiTiet() {
    }

    public GioHangChiTiet(String idHoaDon, String idChiTietSp, String anh, String tenSp, int soLuong, Long donGia) {
        this.idHoaDon = idHoaDon;
        this.idChiTietSp = idChiTietSp;
        this.anh = anh;
        this.tenSp = tenSp;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public GioHangChiTiet(String idChiTietSp, String anh, String tenSp, int soLuong, Long donGia) {
        this.idChiTietSp = idChiTietSp;
        this.anh = anh;
        this.tenSp = tenSp;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    
    public String getIdChiTietSp() {
        return idChiTietSp;
    }

    public void setIdChiTietSp(String idChiTietSp) {
        this.idChiTietSp = idChiTietSp;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Long getDonGia() {
        return donGia;
    }

    public void setDonGia(Long donGia) {
        this.donGia = donGia;
    }

    public String getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(String idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    @Override
    public String toString() {
        return "GioHangChiTiet{" + "idHoaDon=" + idHoaDon + ", idChiTietSp=" + idChiTietSp + ", anh=" + anh + ", tenSp=" + tenSp + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }

}
