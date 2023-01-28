package com.bilgeadam.civil.repository;

import com.bilgeadam.civil.entity.Apartman;
import com.bilgeadam.civil.entity.Beton;
import com.bilgeadam.civil.entity.Villa;

public class Yapi {
    public void villaYap(Villa villa){
        villa.toplamInsaatAlani();
        villa.katBasiInsaatAlani();
    }
    public void apartmanYap(Apartman apartman){
        apartman.toplamInsaatAlani();
        apartman.katBasiInsaatAlani();
    }
}
