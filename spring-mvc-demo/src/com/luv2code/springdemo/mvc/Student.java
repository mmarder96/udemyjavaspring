package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private String[] favoriteOperatingSystems;

    private LinkedHashMap<String, String> favoriteLanguageOptions;
    private LinkedHashMap<String, String> favoriteOSOptions;

    public Student() {
        // populate favorite language options
        favoriteLanguageOptions = new LinkedHashMap<>();

        // parameter order: value, display label
        favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("C#", "C#");
        favoriteLanguageOptions.put("PHP", "PHP");
        favoriteLanguageOptions.put("Ruby", "Ruby");

        // populate favorite OS options
        favoriteOSOptions = new LinkedHashMap<>();

        // parameter order: value, display label
        favoriteOSOptions.put("Windows", "Windows");
        favoriteOSOptions.put("Mac", "Mac");
        favoriteOSOptions.put("Linux", "Linux");
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

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String[] getFavoriteOperatingSystems() {
        return favoriteOperatingSystems;
    }

    public void setFavoriteOperatingSystems(String[] favoriteOperatingSystems) {
        this.favoriteOperatingSystems = favoriteOperatingSystems;
    }

    public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
        return favoriteLanguageOptions;
    }

    public LinkedHashMap<String, String> getFavoriteOSOptions() {
        return favoriteOSOptions;
    }
}
