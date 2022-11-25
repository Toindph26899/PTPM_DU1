package com.repositories;

import com.model.HoaDon;
import com.viewmodel.HoaDonView;
import java.util.ArrayList;

public interface IHoaDonRepository {
    
    ArrayList<HoaDonView> listHoaDonView();
    
    Boolean add(HoaDon hd);
    
    Boolean update(HoaDon hd, String id);
    
    Boolean delete(String id);
}
