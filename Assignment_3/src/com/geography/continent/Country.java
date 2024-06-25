package com.geography.continent;


public class Country extends Continent {
    private String countryName;
    private long population;
    private String officialLanguage;

    public Country(String continentName, double continentArea, String countryName, long population, String officialLanguage) {
        super(continentName, continentArea);
        this.countryName = countryName;
        this.population = population;
        this.officialLanguage = officialLanguage;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getOfficialLanguage() {
        return officialLanguage;
    }

    public void setOfficialLanguage(String officialLanguage) {
        this.officialLanguage = officialLanguage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Country: " + countryName);
        System.out.println("Population: " + population);
        System.out.println("Official Language: " + officialLanguage);
    }
}