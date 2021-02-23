package com.application.MBBusBaseSpring.service.dto;

public class AssignmentCreateRequest {


    public int busId;


    public int driverId;


    public int routeId;

    public AssignmentCreateRequest(int busId, int driverId, int routeId) {
        this.busId = busId;
        this.driverId = driverId;
        this.routeId = routeId;
    }

    public AssignmentCreateRequest() {
    }

    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }
}
