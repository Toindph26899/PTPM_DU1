package com.viewmodel;

public class ChiTietSpViewModel {

    private String id;
    private String anh;
    private String tenSp;
    private int soLuong;
    private Long donGia;
    private Long imei;

    public ChiTietSpViewModel() {
    }

    public ChiTietSpViewModel(String id, String anh, String tenSp, int soLuong, Long donGia, Long imei) {
        this.id = id;
        this.anh = anh;
        this.tenSp = tenSp;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.imei = imei;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Long getImei() {
        return imei;
    }

    public void setImei(Long imei) {
        this.imei = imei;
    }

    @Override
    public String toString() {
        return "ChiTietSpViewModel{" + "id=" + id + ", anh=" + anh + ", tenSp=" + tenSp + ", soLuong=" + soLuong + ", donGia=" + donGia + ", imei=" + imei + '}';
    }

}
