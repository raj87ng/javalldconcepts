package com.rajat.dp.chainofresponsibility.partone;

public class CORMain {

	public static void main(String[] args) {
        AuthenticationProcessor oAuthProcessor = new UserNamePassAuthenticationProcessor(new JWTTokenAuthenticationProcessor(null));
        boolean isAuthorized = oAuthProcessor.isSuccess(new JWTTokenAuth());
        System.out.println(" Is Authorized "+isAuthorized);
        
        AuthenticationProcessor oAuthProcessor1 = new UserNamePassAuthenticationProcessor(new JWTTokenAuthenticationProcessor(null));
        boolean isAuthorized1 = oAuthProcessor1.isSuccess(new UserPasswordAuth());
        System.out.println(" Is Authorized "+isAuthorized1);
	}
	
	/**
	 *  Forwarding to next chain class com.rajat.dp.chainofresponsibility.partone.JWTTokenAuthenticationProcessor
        Is Authorized true
        Is Authorized true
	 */
}
