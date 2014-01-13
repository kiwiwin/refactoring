package org.kiwi.refactoring.extractclass;

public class People {
    private final String name;
    private final String cityCode;
    private final String phoneNumber;

    public People(String name, String cityCode, String phoneNumber) {
        this.name = name;
        this.cityCode = cityCode;
        this.phoneNumber = phoneNumber;
    }

    public String getInfo() {
        return "name: " + name + ", tel: " + cityCode + "-" + phoneNumber;
    }
}
