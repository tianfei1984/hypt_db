package cn.com.hypt.db.model;

import java.math.BigDecimal;
import java.util.Date;

public class MonthlyStat {
    private Integer jtMonthlyStatId;

    private Integer vehicleId;

    private Date occurMonth;

    private BigDecimal fuelIncount;

    private BigDecimal feeIncount;

    private BigDecimal mileageIncount;

    private Integer urgentBrake;

    private Integer urgentAccelerate;

    private BigDecimal fuelPer100km;

    private BigDecimal feePer100km;

    public Integer getJtMonthlyStatId() {
        return jtMonthlyStatId;
    }

    public void setJtMonthlyStatId(Integer jtMonthlyStatId) {
        this.jtMonthlyStatId = jtMonthlyStatId;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Date getOccurMonth() {
        return occurMonth;
    }

    public void setOccurMonth(Date occurMonth) {
        this.occurMonth = occurMonth;
    }

    public BigDecimal getFuelIncount() {
        return fuelIncount;
    }

    public void setFuelIncount(BigDecimal fuelIncount) {
        this.fuelIncount = fuelIncount;
    }

    public BigDecimal getFeeIncount() {
        return feeIncount;
    }

    public void setFeeIncount(BigDecimal feeIncount) {
        this.feeIncount = feeIncount;
    }

    public BigDecimal getMileageIncount() {
        return mileageIncount;
    }

    public void setMileageIncount(BigDecimal mileageIncount) {
        this.mileageIncount = mileageIncount;
    }

    public Integer getUrgentBrake() {
        return urgentBrake;
    }

    public void setUrgentBrake(Integer urgentBrake) {
        this.urgentBrake = urgentBrake;
    }

    public Integer getUrgentAccelerate() {
        return urgentAccelerate;
    }

    public void setUrgentAccelerate(Integer urgentAccelerate) {
        this.urgentAccelerate = urgentAccelerate;
    }

    public BigDecimal getFuelPer100km() {
        return fuelPer100km;
    }

    public void setFuelPer100km(BigDecimal fuelPer100km) {
        this.fuelPer100km = fuelPer100km;
    }

    public BigDecimal getFeePer100km() {
        return feePer100km;
    }

    public void setFeePer100km(BigDecimal feePer100km) {
        this.feePer100km = feePer100km;
    }
}