package com.rajat.dp.chainofresponsibility.partone;

public abstract class AuthenticationProcessor {

    protected AuthenticationProcessor nextProcessor;
    
    public AuthenticationProcessor(AuthenticationProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract boolean isSuccess(Authentication authProvider);

}
