package com.rajat.dp.chainofresponsibility.partone;

public class JWTTokenAuthenticationProcessor extends AuthenticationProcessor{

	public JWTTokenAuthenticationProcessor(AuthenticationProcessor nextProcessor) {
		super(nextProcessor);
	}

	@Override
	public boolean isSuccess(Authentication authProvider) {
		if (authProvider instanceof JWTTokenAuth) {
            return Boolean.TRUE;
        } else if (nextProcessor != null) {
        	System.out.println(" Forwarding to next chain "+nextProcessor.getClass());
            return nextProcessor.isSuccess(authProvider);
        } else {
            return Boolean.FALSE;
        }
	}

}
