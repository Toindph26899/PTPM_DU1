/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.service.impl;

import com.repositories.IHoaDonCTRepositoryHD;
import com.repositories.IHoaDonRepositoryHD;
import com.repositories.impl.HoaDonRepositoryHD;
import com.service.IHoaDonSer;
import com.viewmodel.HoaDonViewModel;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class HoaDonSer implements IHoaDonSer{

    private IHoaDonRepositoryHD hd = new HoaDonRepositoryHD();
    
    @Override
    public List<HoaDonViewModel> getAll() {
        return hd.getAll();
    }
    
}
