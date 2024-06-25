package com.geography.continent;


public class State extends Country {
    private String stateName;
    private String capitalCity;
    private double gdp; // in billion USD

    public State(String continentName, double continentArea, String countryName, long population, String officialLanguage, String stateName, String capitalCity, double gdp) {
        super(continentName, continentArea, countryName, population, officialLanguage);
        this.stateName = stateName;
        this.capitalCity = capitalCity;
        this.gdp = gdp;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("State: " + stateName);
        System.out.println("Capital City: " + capitalCity);
        System.out.println("GDP: " + gdp + " billion USD");
    }
}