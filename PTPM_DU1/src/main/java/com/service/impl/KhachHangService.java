package com.service.impl;

import com.model.KhachHang;
import com.repositories.IKhachHangRepository;
import com.repositories.impl.KhachHangRepository;
import com.service.IKhachHangService;
import java.util.ArrayList;

public class KhachHangService implements IKhachHangService {

    private IKhachHangRepository iKhachHangRepository = new KhachHangRepository();
    
    @Override
    public ArrayList<KhachHang> listKhachHang() {
        return iKhachHangRepository.listKhachHang();
    }

    @Override
    public Boolean add(KhachHang kh) {
        
    }

    @Override
    public Boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean update(KhachHang kh, String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<KhachHang> getKhToSdt(String sdt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
