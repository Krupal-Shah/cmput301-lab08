package com.example.lab08;// City.java

/**
 * This is a class that defines a City. It implements Comparable so that we can sort the cities by
 * city name in cityList.
 */
public class City implements Comparable {
    private String cityName, provinceName;

    /**
     * Constructor of class City
     *
     * @param cityName: City name
     * @param provinceName: Province Name
     */
    public City(String cityName, String provinceName) {
        this.cityName = cityName;
        this.provinceName = provinceName;
    }

    /**
     * Getter City Name
     *
     * @return cityName String
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Getter Province Name
     *
     * @return provinceName: String
     */
    public String getProvinceName(){
        return provinceName;
    }

    /**
     * Setter City Name
     *
     * @param cityName City
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * Setter Province Name
     *
     * @param provinceName Province
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    /**
     * Compares the city names with each other
     *
     * @param o the object to be compared.
     * @return comparison to another cityName
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.cityName.compareTo(city.getCityName());
    }
}
