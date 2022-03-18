package com.shailendra.itemInventory.entity;


import jdk.jfr.Enabled;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class itemInventory {

    @Column
    @Id
    private int itemId;
    @Column
    private String supplyQty;
    @Column
    private String demandQty;

    public itemInventory(int itemId, String supplyQty, String demandQty) {
        this.itemId = itemId;
        this.supplyQty = supplyQty;
        this.demandQty = demandQty;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getSupplyQty() {
        return supplyQty;
    }

    public void setSupplyQty(String supplyQty) {
        this.supplyQty = supplyQty;
    }

    public String getDemandQty() {
        return demandQty;
    }

    public void setDemandQty(String demandQty) {
        this.demandQty = demandQty;
    }
}
