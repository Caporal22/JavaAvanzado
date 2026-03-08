package com.detalles.rulesengine;

public class CountryRule implements Rule<UserContext> {

    private final String allowedCountry;

    public CountryRule(String allowedCountry) {
        this.allowedCountry = allowedCountry;
    }

    @Override
    public boolean evaluate(UserContext context) {
        return allowedCountry.equals(context.getCountry());
    }
}
