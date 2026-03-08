package com.detalles.rulesengine;

public class IsAdminRule implements Rule<UserContext> {

    @Override
    public boolean evaluate(UserContext context) {
        return context.isAdmin();
    }
}
