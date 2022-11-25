package com.service.impl;

import com.model.HoaDonChiTiet;
import com.repositories.IHoaDonCTRepository;
import com.repositories.impl.HoaDonChiTietRepository;
import com.service.IChiTietHdService;
import com.viewmodel.GioHangChiTiet;
import java.util.ArrayList;

public class ChiTietHdService implements IChiTietHdService {

    private IHoaDonCTRepository iHoaDonCTRepository = new HoaDonChiTietRepository();

    @Override
    public ArrayList<GioHangChiTiet> getListGioHang() {
        return iHoaDonCTRepository.getListGioHang();
    }

    @Override
    public ArrayList<GioHangChiTiet> getListGioHangToIdHoaDon(String id) {
        return iHoaDonCTRepository.getListGioHangToIdHoaDon(id);

    }

    @Override
    public Boolean add(HoaDonChiTiet hdct) {
        return iHoaDonCTRepository.add(hdct);

    }

}
