package cn.com.hypt.db.model;

import java.util.Date;

public class Trip {
    private Integer tripId;

    private Integer vehicleId;

    private Date recday;

    private Date created;

    private String gps;

    public Integer getTripId() {
        return tripId;
    }

    public void setTripId(Integer tripId) {
        this.tripId = tripId;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Date getRecday() {
        return recday;
    }

    public void setRecday(Date recday) {
        this.recday = recday;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps == null ? null : gps.trim();
    }
}