package cn.com.hypt.db.model;

import java.util.Date;

public class Vehicle {
    private Integer vehicleId;

    private String licensePlate;

    private String vin;

    private String ein;

    private String styleId;

    private Byte status;

    private Date created;

    private Date updated;

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate == null ? null : licensePlate.trim();
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein == null ? null : ein.trim();
    }

    public String getStyleId() {
        return styleId;
    }

    public void setStyleId(String styleId) {
        this.styleId = styleId == null ? null : styleId.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}