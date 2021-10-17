package com.rajat.dp.chainofresponsibility.partone;

public class UserNamePassAuthenticationProcessor extends AuthenticationProcessor{

	public UserNamePassAuthenticationProcessor(AuthenticationProcessor nextProcessor) {
		super(nextProcessor);
	}

	@Override
	public boolean isSuccess(Authentication authProvider) {
		if (authProvider instanceof UserPasswordAuth) {
            return Boolean.TRUE;
        } else if (nextProcessor != null) {
        	System.out.println(" Forwarding to next chain "+nextProcessor.getClass());
            return nextProcessor.isSuccess(authProvider);
        } else {
            return Boolean.FALSE;
        }
	}

}
