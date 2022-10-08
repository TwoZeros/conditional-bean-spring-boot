package ru.twozeros.conditionalbeanspringboot.configuration;

public class DevProfile implements SystemProfile{
    @Override
    public String getProfile() {
        return "current profile is dev";
    }
}
