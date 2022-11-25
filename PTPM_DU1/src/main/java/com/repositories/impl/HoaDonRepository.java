package com.repositories.impl;

import com.dbcontext.DbConnection;
import com.model.HoaDon;
import com.repositories.IHoaDonRepository;
import com.viewmodel.HoaDonView;
import java.util.ArrayList;
import java.sql.*;

public class HoaDonRepository implements IHoaDonRepository {

    private ArrayList<HoaDonView> listHoaDon;

    @Override
    public ArrayList<HoaDonView> listHoaDonView() {
        listHoaDon = new ArrayList<>();
        try ( Connection conn = DbConnection.getConnection()) {
            String sql = "SELECT hd.id, hd.Ma, nv.Ten, hd.TenKh, hd.NgayTao, hd.NgayThanhToan, hd.TinhTrang "
                    + "FROM HoaDon hd JOIN NhanVien nv ON hd.IdNhanVien = nv.Id";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String ma = rs.getString(2);
                String tenNv = rs.getString(3);
                String tenKh = rs.getString(4);
                Date ngayTao = rs.getDate(5);
                Date ngayThanhToan = rs.getDate(6);
                int tinhTrang = rs.getInt(7);

                HoaDonView hdView = new HoaDonView(id, ma, tenNv, tenKh, ngayTao, ngayThanhToan, tinhTrang);
                listHoaDon.add(hdView);

            }
            return listHoaDon;

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Loi select");
        }
        return null;
    }

    @Override
    public Boolean add(HoaDon hd) {
        String sql = "INSERT INTO HoaDon(ma, idNhanVien, TenKh, NgayTao, TinhTrang) "
                + "VALUES(?, ?, ?, ?, ?)";

        int check = 0;

        try ( Connection conn = DbConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setObject(1, hd.getMa());
            ps.setObject(2, hd.getIdNhanVien());
            ps.setObject(3, hd.getTenKh());
            ps.setObject(4, hd.getNgayTao());
            ps.setObject(5, hd.getTinhTrang());

            check = ps.executeUpdate();
            return check > 0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Loi insert");
        }

        return false;
    }

    @Override
    public Boolean update(HoaDon hd, String id) {
        String sql = "UPDATE HoaDon SET TenKh = ?,NgayThanhToan = ?, TinhTrang = ? WHERE id = ?";
        int check = 0;
        
        try ( Connection conn = DbConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, hd.getTenKh());
            ps.setObject(2, hd.getNgayThanhToan());
            ps.setObject(3, hd.getTinhTrang());
            ps.setObject(4, id);

            check = ps.executeUpdate();
            return check > 0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi update");
        }

        return false;
    }

    @Override
    public Boolean delete(String id) {
        String sql = "DELETE FROM HoaDon WHERE id = ?";
        int check = 0;
        try (Connection conn = DbConnection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, id);
            check = ps.executeUpdate();
            return check > 0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Loi xoa");
        }
        return false;
    }

}
