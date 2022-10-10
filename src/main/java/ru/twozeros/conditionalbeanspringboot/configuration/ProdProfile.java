package ru.twozeros.conditionalbeanspringboot.configuration;

public class ProdProfile implements SystemProfile{
    @Override
    public String getProfile() {
        return "current profile is prod";
    }
}
