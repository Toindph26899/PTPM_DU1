
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
        if(iChiTietSPRepository.getListChiTietSp() == null) {
            System.out.println("Null");
            return null;
        }
        
        return iChiTietSPRepository.getListChiTietSp();
    }
    
    public static void main(String[] args) {
        ChiTietSpService c = new ChiTietSpService();
        
        System.out.println(c.iChiTietSPRepository.getListChiTietSp().toString());
    }
    
}
