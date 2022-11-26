package com.service.impl;

import com.repositories.IChiTietSPRepository;
import com.repositories.impl.ChiTietSPRepository;
import com.service.IChiTietSPService;
import com.viewmodel.ChiTietSpViewModel;
import java.util.ArrayList;

public class ChiTietSpService implements IChiTietSPService {

    public static final IChiTietSPRepository iChiTietSPRepository = new ChiTietSPRepository();

    @Override
    public ArrayList<ChiTietSpViewModel> listChiTietSP() {
        
        return iChiTietSPRepository.getListChiTietSp();
    }
    
}

    @Override
    public ArrayList<ChiTietSpViewModel> list() {
        return iChiTietSPRepository.getList();
    }

    public static void main(String[] args) {
        ChiTietSpService c = new ChiTietSpService();
        
        System.out.println(c.listChiTietSP());
//        System.out.println(c.list());
    }

}
