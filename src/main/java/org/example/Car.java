package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
class Root {
    public Car getAuto1990() {
        return auto1990;
    }

    public void setAuto1990(Car auto1990) {
        this.auto1990 = auto1990;
    }

    @JsonProperty("Автомобили 1990-х годов")
    public Car auto1990;
}
public class Car{
    public Manual getManual() {
        return manual;
    }

    public void setManual(Manual manual) {
        this.manual = manual;
    }

    public AutomaticGearbox getAutomaticGearbox() {
        return automaticGearbox;
    }

    public void setAutomaticGearbox(AutomaticGearbox automaticGearbox) {
        this.automaticGearbox = automaticGearbox;
    }

    @JsonProperty("МКПП")
    public Manual manual;
    @JsonProperty("АКПП")
    public AutomaticGearbox automaticGearbox;

}

class AsianAuto {
    @JsonProperty("Hyundai")
    public ArrayList<Object> hyundai;
    @JsonProperty("Kia")
    public ArrayList<Object> kia;
    @JsonProperty("Lifan")
    public ArrayList<Object> lifan;
}

class AutomaticGearbox {
    @JsonProperty("Бензин")
    public Gas gas;
    @JsonProperty("Дизель")
    public Disel disel;
}

class AmericanAuto {
    @JsonProperty("Ford")
    public ArrayList<Object> ford;
    @JsonProperty("Chevrolet")
    public ArrayList<Object> chevrolet;
    @JsonProperty("Cadillac")
    public ArrayList<Object> cadillac;
}

class Gas{
    @JsonProperty("Седан")
    public Sedan sedan;
    @JsonProperty("Минивэн")
    public MiniVan miniVan;
    @JsonProperty("Купэ")
    public Coupe coupe;
    @JsonProperty("Микроавтобус")
    public MicroBus microBus;
    @JsonProperty("Джип")
    public Jeep jeep;
}

class Jeep{
    @JsonProperty("Японские авто")
    public JapanAuto japanAuto;
}

class Disel {
    @JsonProperty("Полный привод")
    public FullWD fullWD;
    @JsonProperty("Задний привод")
    public RWD rwd;
    @JsonProperty("Передний привод")
    public FWD fwd;
    @JsonProperty("Седан")
    public Sedan sedan;
    @JsonProperty("Минивэн")
    public MiniVan miniVan;
    @JsonProperty("Купэ")
    public Coupe coupe;
    @JsonProperty("Микроавтобус")
    public MicroBus microBus;
    @JsonProperty("Джип")
    public Jeep jeep;
}

class EuropianAuto {
    @JsonProperty("Mercedes")
    public ArrayList<Object> mercedes;
    @JsonProperty("BMW")
    public ArrayList<Object> bMW;
    @JsonProperty("Volvo")
    public ArrayList<Object> volvo;
    @JsonProperty("Volkswagen")
    public ArrayList<Object> volkswagen;
}

class RWD {
    @JsonProperty("Седан")
    public Sedan sedan;
    @JsonProperty("Минивэн")
    public MiniVan miniVan;
    @JsonProperty("Купэ")
    public Coupe coupe;
    @JsonProperty("Микроавтобус")
    public MicroBus microBus;
    @JsonProperty("Джип")
    public Jeep jeep;
}

class Coupe {
    @JsonProperty("Японские авто")
    public JapanAuto japanAuto;
    @JsonProperty("Европейские авто")
    public EuropianAuto europianAuto;
    @JsonProperty("Американские авто")
    public AmericanAuto americanAuto;
    @JsonProperty("Азиатские авто")
    public AsianAuto asianAuto;
}

class MicroBus {
    @JsonProperty("Японские авто")
    public JapanAuto japanAuto;
}

class MiniVan {
    @JsonProperty("Японские авто")
    public JapanAuto japanAuto;
    @JsonProperty("Европейские авто")
    public EuropianAuto europianAuto;
    @JsonProperty("Американские авто")
    public AmericanAuto americanAuto;
    @JsonProperty("Азиатские авто")
    public AsianAuto asianAuto;
}

class Manual{
    @JsonProperty("Бензин")
    public Gas gas;
    @JsonProperty("Дизель")
    public Disel disel;
}

class FWD {
    @JsonProperty("Седан")
    public Sedan sedan;
    @JsonProperty("Минивэн")
    public MiniVan miniVan;
    @JsonProperty("Купэ")
    public Coupe coupe;
    @JsonProperty("Микроавтобус")
    public MicroBus microBus;
    @JsonProperty("Джип")
    public Jeep jeep;
}

class FullWD {
    @JsonProperty("Седан")
    public Sedan sedan;
    @JsonProperty("Минивэн")
    public MiniVan miniVan;
    @JsonProperty("Купэ")
    public Coupe coupe;
    @JsonProperty("Микроавтобус")
    public MicroBus microBus;
    @JsonProperty("Джип")
    public Jeep jeep;
}

class Sedan {
    @JsonProperty("Японские авто")
    public JapanAuto japanAuto;
    @JsonProperty("Европейские авто")
    public EuropianAuto europianAuto;
    @JsonProperty("Американские авто")
    public AmericanAuto americanAuto;
    @JsonProperty("Азиатские авто")
    public AsianAuto asianAuto;
}

class JapanAuto {
    @JsonProperty("Toyota")
    public ArrayList<String> toyota;
    @JsonProperty("Honda")
    public ArrayList<String> honda;
    @JsonProperty("Nissan")
    public ArrayList<String> nissan;
    @JsonProperty("Европейские авто")
    public EuropianAuto europianAuto;
    @JsonProperty("Американские авто")
    public AmericanAuto americanAuto;
    @JsonProperty("Азиатские авто")
    public AsianAuto asianAuto;
}


