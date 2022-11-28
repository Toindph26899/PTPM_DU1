package com.repositories.impl;

import com.dbcontext.DbConnection;
import com.repositories.IChiTietSPRepository;
import com.viewmodel.ChiTietSpViewModel;
import java.sql.*;
import java.util.ArrayList;

public class ChiTietSPRepository implements IChiTietSPRepository {

    private ArrayList<ChiTietSpViewModel> listChiTietSP;

    @Override
    public ArrayList<ChiTietSpViewModel> getListChiTietSp() {
        listChiTietSP = new ArrayList<>();
        String sql = "select ctsp.id, sp.ten + ' - ' + ms.Ten + ' - ' + plh.Ten , ctsp.SoLuongTon, ctsp.GiaBan, Imei.SoImei from ChiTietSP ctsp \n"
                + "JOIN SanPham sp ON ctsp.IdSP = sp.Id\n"
                + "JOIN MauSac ms on ctsp.IdMauSac = ms.Id\n"
                + "JOIN PhanLoaiHang plh ON ctsp.IdPhanLoaiHang = plh.id\n"
                + "JOIN Imei ON ctsp.IdImei = Imei.id";

        try ( Connection conn = DbConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listChiTietSP.add(new ChiTietSpViewModel(rs.getString(1), "Null", rs.getString(2), rs.getInt(3), rs.getLong(4), rs.getLong(5)));
            }
            return listChiTietSP;
        } catch (Exception e) {
        }

        return null;
    }
    
    public static void main(String[] args) {
        ChiTietSPRepository c = new ChiTietSPRepository();
        
        System.out.println(c.getListChiTietSp().toString());
    }
}
