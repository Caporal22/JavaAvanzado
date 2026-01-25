package com.detalles.rulesengine;

public class FeatureEnabledRule implements Rule<UserContext> {

    @Override
    public boolean evaluate(UserContext context) {
        return context.isFeatureEnabled();
    }
}
