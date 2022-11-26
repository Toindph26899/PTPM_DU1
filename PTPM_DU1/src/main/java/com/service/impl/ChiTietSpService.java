
package com.service.impl;

import com.repositories.IChiTietSPRepository;
import com.repositories.impl.ChiTietSPRepository;
import com.service.IChiTietSPService;
import com.viewmodel.ChiTietSpViewModel;
import java.util.ArrayList;


public class ChiTietSpService implements IChiTietSPService{

    private IChiTietSPRepository iChiTietSPRepository = new ChiTietSPRepository();
    
    @Override
    public ArrayList<ChiTietSpViewModel> listChiTietSP() {
        return iChiTietSPRepository.getListChiTietSp();
    }
    
    public static void main(String[] args) {
        ChiTietSpService sp = new ChiTietSpService();
        sp.listChiTietSP().forEach(s -> System.out.println(s.toString()));
    }
}
