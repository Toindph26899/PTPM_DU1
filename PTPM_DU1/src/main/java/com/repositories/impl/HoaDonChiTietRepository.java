package com.repositories.impl;

import com.dbcontext.DbConnection;
import com.model.HoaDonChiTiet;
import com.repositories.IHoaDonCTRepository;
import com.viewmodel.GioHangChiTiet;
import java.sql.*;
import java.util.ArrayList;

public class HoaDonChiTietRepository implements IHoaDonCTRepository {

    private ArrayList<GioHangChiTiet> listGioHang;

    @Override
    public ArrayList<GioHangChiTiet> getListGioHang() {
//        listGioHang = new ArrayList<>();
//        String sql = "select ctsp.id, sp.ten + ' - ' + ms.Ten + ' - ' + plh.Ten , ctsp.SoLuongTon, ctsp.GiaBan, Imei.SoImei from ChiTietSP ctsp \n"
//                + "JOIN SanPham sp ON ctsp.IdSP = sp.Id\n"
//                + "JOIN MauSac ms on ctsp.IdMauSac = ms.Id\n"
//                + "JOIN PhanLoaiHang plh ON ctsp.IdPhanLoaiHang = plh.id\n"
//                + "JOIN Imei ON ctsp.IdImei = Imei.id\n"
//                + "JOIN HoaDonChiTiet hdct on ctsp.Id = hdct.IdChiTietSP\n"
//                + "JOIN HoaDon hd ON hdct.IdHoaDon = hd.Id\n"
//                + "WHERE hd.Id = ?";
//
//        try ( Connection conn = DbConnection.getConnection()) {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setObject(1, id);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                listGioHang.add(new GioHangChiTiet(rs.getString(1), "Null", rs.getString(2), rs.getInt(3), rs.getLong(4)));
//            }
//            return listGioHang;
//        } catch (Exception e) {
//        }

        return null;
    }

    @Override
    public ArrayList<GioHangChiTiet> getListGioHangToIdHoaDon(String id) {
        listGioHang = new ArrayList<>();
        String sql = "select ctsp.id, sp.ten + ' - ' + ms.Ten + ' - ' + plh.Ten , ctsp.SoLuongTon, ctsp.GiaBan, Imei.SoImei from ChiTietSP ctsp \n"
                + "JOIN SanPham sp ON ctsp.IdSP = sp.Id\n"
                + "JOIN MauSac ms on ctsp.IdMauSac = ms.Id\n"
                + "JOIN PhanLoaiHang plh ON ctsp.IdPhanLoaiHang = plh.id\n"
                + "JOIN Imei ON ctsp.IdImei = Imei.id\n"
                + "JOIN HoaDonChiTiet hdct on ctsp.Id = hdct.IdChiTietSP\n"
                + "JOIN HoaDon hd ON hdct.IdHoaDon = hd.Id\n"
                + "WHERE hd.Id = ?";

        try ( Connection conn = DbConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listGioHang.add(new GioHangChiTiet(rs.getString(1), "Null", rs.getString(2), rs.getInt(3), rs.getLong(4)));
            }
            return listGioHang;
        } catch (Exception e) {
        }

        return null;
    }

    @Override
    public Boolean add(HoaDonChiTiet hdct) {
        String sql = "INSERT INTO HoaDonChiTiet(idHoaDon, idChiTietSP, SoLuong, DonGia, TrangThai) "
                + "VALUES(?, ?, ?, ?, ?)";
        int check = 0;
        try ( Connection conn = DbConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setObject(1, hdct.getIdHoaDon());
            ps.setObject(2, hdct.getIdChiTietSP());
            ps.setObject(3, hdct.getSoLuong());
            ps.setObject(4, hdct.getDonGia());
            ps.setObject(5, hdct.getTrangThai());

            check = ps.executeUpdate();
            return check > 0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Insert loi");
        }

        return null;
    }

}
