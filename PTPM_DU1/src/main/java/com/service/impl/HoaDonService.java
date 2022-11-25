package com.service.impl;

import com.model.HoaDon;
import com.repositories.IHoaDonRepository;
import com.repositories.impl.HoaDonRepository;
import com.service.IHoaDonService;
import com.viewmodel.HoaDonView;
import java.util.ArrayList;

public class HoaDonService implements IHoaDonService {

    private IHoaDonRepository iHoaDonRepository = new HoaDonRepository();

    @Override
    public ArrayList<HoaDonView> listHoaDonView() {
        return iHoaDonRepository.listHoaDonView();
    }

    @Override
    public Boolean add(HoaDon hd) {
        return iHoaDonRepository.add(hd);
    }

    @Override
    public Boolean update(HoaDon hd, String id) {
        return iHoaDonRepository.update(hd, id);

    }

    @Override
    public Boolean delete(String id) {
        return iHoaDonRepository.delete(id);

    }

}
