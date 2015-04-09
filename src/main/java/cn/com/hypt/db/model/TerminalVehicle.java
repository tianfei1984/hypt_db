package cn.com.hypt.db.model;

import java.util.Date;

public class TerminalVehicle {
    private Integer terminalVehiclesId;

    private Integer terminalId;

    private Integer vehicleId;

    private Date created;

    public Integer getTerminalVehiclesId() {
        return terminalVehiclesId;
    }

    public void setTerminalVehiclesId(Integer terminalVehiclesId) {
        this.terminalVehiclesId = terminalVehiclesId;
    }

    public Integer getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(Integer terminalId) {
        this.terminalId = terminalId;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}