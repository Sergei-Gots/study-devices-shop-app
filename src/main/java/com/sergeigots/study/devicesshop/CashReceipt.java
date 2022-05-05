package com.sergeigots.study.devicesshop;

import java.time.LocalDateTime;
import java.util.Collection;

public class CashReceipt {

    protected LocalDateTime dateTime;
    protected int customerId;
    Collection<SoldLot> soldLots;

    public CashReceipt(LocalDateTime dateTime, Customer customer,
                       Collection<SoldLot> soldLots){
        this.customerId = customer.getId();
        this.dateTime = dateTime;
        this.soldLots = soldLots;
    }

}
