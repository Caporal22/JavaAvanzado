package com.detalles.rulesengine;

public class Main {

    public static void main(String[] args) {

        UserContext user = new UserContext(
                true,
                "MX",
                true
        );

        RuleEngine<UserContext> engine =
                new RuleEngine<UserContext>()
                        .addRule(new IsAdminRule())
                        .addRule(new CountryRule("MX"))
                        .addRule(new FeatureEnabledRule());

        boolean canAccessFeature = engine.evaluate(user);

        System.out.println("Access granted: " + canAccessFeature);
    }
}
