/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.service.impl;

import com.repositories.IHoaDonCTRepositoryHD;
import com.repositories.impl.HoaDonCTRepositoryHD;
import com.service.IHoaDonCTSer;
import com.viewmodel.HoaDonChiTietViewModel;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class HoaDonCTSer implements IHoaDonCTSer {

    private IHoaDonCTRepositoryHD hd = new HoaDonCTRepositoryHD();

    @Override
    public List<HoaDonChiTietViewModel> getAll() {
        return hd.getAll();
    }
    
    public static void main(String[] args) {
        HoaDonCTSer hd = new HoaDonCTSer();
        hd.getAll().forEach(s -> System.out.println(s.toString()));
    }

    @Override
    public List<HoaDonChiTietViewModel> getOne(String id) {
       return hd.getOne(id);
    }

}
