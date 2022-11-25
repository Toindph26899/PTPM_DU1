package com.service;

import com.model.HoaDon;
import com.viewmodel.HoaDonView;
import java.util.ArrayList;

public interface IHoaDonService {

    ArrayList<HoaDonView> listHoaDonView();

    Boolean add(HoaDon hd);

    Boolean update(HoaDon hd, String id);

    Boolean delete(String id);
}
