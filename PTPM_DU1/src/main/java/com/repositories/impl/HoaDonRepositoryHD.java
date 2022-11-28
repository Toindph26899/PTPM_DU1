/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repositories.impl;

import com.dbcontext.DbConnection;
import com.repositories.IHoaDonRepositoryHD;
import com.viewmodel.HoaDonViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class HoaDonRepositoryHD implements IHoaDonRepositoryHD {

    private Connection conn;

    public HoaDonRepositoryHD() {
        try {
            conn = DbConnection.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<HoaDonViewModel> getAll() {
        List<HoaDonViewModel> ds = new ArrayList<>();
        String sql = "select a.Id,c.Ten,c.Sdt,b.Ten,a.NgayTao,a.NgayThanhToan,"
                + "d.LoaiHinhThanhToan,a.TinhTrang,a.GhiChu\n"
                + "from HoaDon a join NhanVien b on a.IdNhanVien = b.Id\n"
                + "              join KhachHang c on a.IdKH = c.Id\n"
                + "              join HinhThucThanhToan d on a.Id = d.IdHoaDon";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonViewModel hd = new HoaDonViewModel();
                hd.setId(rs.getString(1));
                hd.setTenKH(rs.getString(2));
                hd.setSdtKH(rs.getString(3));
                hd.setTenNV(rs.getString(4));
                hd.setNgayTao(rs.getString(5));
                hd.setNgayThanhToan(rs.getString(6));
                hd.setHinhThucThanhToan(rs.getString(7));
                hd.setTinhTrang(rs.getInt(8));
                hd.setGhiChu(rs.getString(9));
                ds.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }

    public static void main(String[] args) {
        HoaDonRepositoryHD hd = new HoaDonRepositoryHD();
        hd.getAll().forEach(s -> System.out.println(s.toString()));
    }

    @Override
    public List<HoaDonViewModel> search(String string) {
        List<HoaDonViewModel> ds = new ArrayList<>();
        String sql = "select a.Id,c.Ten,c.Sdt,b.Ten,a.NgayTao,a.NgayThanhToan,"
                + "d.LoaiHinhThanhToan,a.TinhTrang,a.GhiChu\n"
                + "from HoaDon a join NhanVien b on a.IdNhanVien = b.Id\n"
                + "              join KhachHang c on a.IdKH = c.Id\n"
                + "              join HinhThucThanhToan d on a.Id = d.IdHoaDon"
                + "              where c.Sdt like '%" + string + "%' or c.Ten like '%" + string + "%'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonViewModel hd = new HoaDonViewModel();
                hd.setId(rs.getString(1));
                hd.setTenKH(rs.getString(2));
                hd.setSdtKH(rs.getString(3));
                hd.setTenNV(rs.getString(4));
                hd.setNgayTao(rs.getString(5));
                hd.setNgayThanhToan(rs.getString(6));
                hd.setHinhThucThanhToan(rs.getString(7));
                hd.setTinhTrang(rs.getInt(8));
                hd.setGhiChu(rs.getString(9));
                ds.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }

    @Override
    public void update(String id, HoaDonViewModel hd) {
        String sql = "update HoaDon set NgayTao = ?, NgayThanhToan = ?, TinhTrang = ?, GhiChu = ?"
                + " where id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, hd.getNgayTao());
            ps.setString(2, hd.getNgayThanhToan());
            ps.setInt(3, hd.getTinhTrang());
            ps.setString(4, hd.getGhiChu());
            ps.setString(5, id);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
