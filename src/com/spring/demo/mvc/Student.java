package com.spring.demo.mvc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private String[] OS;
    private LinkedHashMap<String, String> countryOptions;
    private LinkedHashMap<String, String> favoriteLanguageOptions;
    private List<String> operationSystemOptions;

    public Student() {
        //populete country options
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR", "BRAZIL");
        countryOptions.put("FR", "FRANCE");
        countryOptions.put("TR", "TURKEY");
        countryOptions.put("USA", "UNITED STATES OF AMERICA");

        // populate favorite language options
        favoriteLanguageOptions = new LinkedHashMap<>();
        favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("C#", "C#");
        favoriteLanguageOptions.put("PHP", "PHP");
        favoriteLanguageOptions.put("Ruby", "Ruby");

        // populate OS options
        operationSystemOptions =  new ArrayList<String>();
        operationSystemOptions.add("Mac OS");
        operationSystemOptions.add("Linux");
        operationSystemOptions.add("Microsoft Windows");
    }

    public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
        return favoriteLanguageOptions;
    }

    public void setFavoriteLanguageOptions(LinkedHashMap<String, String> favoriteLanguageOptions) {
        this.favoriteLanguageOptions = favoriteLanguageOptions;
    }

    public String[] getOS() {
        return OS;
    }

    public void setOS(String[] OS) {
        this.OS = OS;
    }

    public List<String> getOperationSystemOptions() {
        return operationSystemOptions;
    }

    public void setOperationSystemOptions(List<String> operationSystemOptions) {
        this.operationSystemOptions = operationSystemOptions;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
        this.countryOptions = countryOptions;
    }
}
