package com.sergeigots.study.devicesshop;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Purchase {

    protected LocalDateTime dateTime;
    protected int customerId;
    ArrayList<Lot> lots;

    public Purchase(LocalDateTime dateTime, int customerId,
                    ArrayList<Lot> lots){
        this.customerId = customerId;
        this.dateTime = dateTime;
        this.lots = lots;
    }

}
