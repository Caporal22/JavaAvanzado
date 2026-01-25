package com.detalles.rulesengine;

public class UserContext {

    private final boolean admin;
    private final String country;
    private final boolean featureEnabled;

    public UserContext(boolean admin, String country, boolean featureEnabled) {
        this.admin = admin;
        this.country = country;
        this.featureEnabled = featureEnabled;
    }

    public boolean isAdmin() {
        return admin;
    }

    public String getCountry() {
        return country;
    }

    public boolean isFeatureEnabled() {
        return featureEnabled;
    }
}
