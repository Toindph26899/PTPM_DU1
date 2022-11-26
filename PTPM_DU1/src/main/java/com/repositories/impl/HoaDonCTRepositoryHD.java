/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repositories.impl;

import com.dbcontext.DbConnection;
import com.repositories.IHoaDonCTRepositoryHD;
import com.viewmodel.HoaDonChiTietViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HoaDonCTRepositoryHD implements IHoaDonCTRepositoryHD {

    private Connection conn;

    public HoaDonCTRepositoryHD() {
        try {
            conn = DbConnection.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<HoaDonChiTietViewModel> getAll() {
        List<HoaDonChiTietViewModel> ds = new ArrayList<>();
        String sql = "select f.Ten,e.MaImei,SoLuong,DonGia,c.SoTienGiam\n"
                + "from HoaDonChiTiet a join HoaDon b on a.IdHoaDon = b.Id\n"
                + "                     join GiamGia c on b.IdGiamGia = c.Id\n"
                + "                     join ChiTietSP d on a.IdChiTietSP = d.Id\n"
                + "                     join SanPham f on d.IdSP = f.Id\n"
                + "                     join ImeiDaBan e on a.Id = e.idHoaDonCT ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonChiTietViewModel hd = new HoaDonChiTietViewModel();
                hd.setTenSP(rs.getString(1));
                hd.setImei(rs.getString(2));
                hd.setSoLuong(rs.getInt(3));
                hd.setDonGia(rs.getLong(4));
                hd.setSale(rs.getLong(5));
                ds.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }

    @Override
    public List<HoaDonChiTietViewModel> getOne(String id) {
       List<HoaDonChiTietViewModel> ds = new ArrayList<>();
        String sql = "select f.Ten,e.MaImei,SoLuong,DonGia,c.SoTienGiam\n"
                + "from HoaDonChiTiet a join HoaDon b on a.IdHoaDon = b.Id\n"
                + "                     join GiamGia c on b.IdGiamGia = c.Id\n"
                + "                     join ChiTietSP d on a.IdChiTietSP = d.Id\n"
                + "                     join SanPham f on d.IdSP = f.Id\n"
                + "                     join ImeiDaBan e on a.Id = e.idHoaDonCT"
                + "                     where b.id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonChiTietViewModel hd = new HoaDonChiTietViewModel();
                hd.setTenSP(rs.getString(1));
                hd.setImei(rs.getString(2));
                hd.setSoLuong(rs.getInt(3));
                hd.setDonGia(rs.getLong(4));
                hd.setSale(rs.getLong(5));
                ds.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }

}
