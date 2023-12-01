package org.example;

import java.util.ArrayList;

class RootTest{
    public ArrayList<CarTest> cars;
}
class CarTest{
    public String mark;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String market;
    public String bodyType;
    public String fuelType;
    public String transmissionType;

    @Override
    public String toString(){

        return "\nМарка авто: " + mark + " \nСтрана производства: " + market+
                "\nТип кузова: " + bodyType +
                "\nТип топлива: " + fuelType+
                "\nКоробка передач: " + transmissionType + "\n";
    }
}
