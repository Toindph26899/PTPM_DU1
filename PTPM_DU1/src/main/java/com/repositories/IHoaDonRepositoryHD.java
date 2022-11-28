package com.repositories;

import com.viewmodel.HoaDonViewModel;
import java.util.List;

public interface IHoaDonRepositoryHD {

    List<HoaDonViewModel> getAll();

    List<HoaDonViewModel> search(String string);
    
    void update(String id, HoaDonViewModel hd);
}
