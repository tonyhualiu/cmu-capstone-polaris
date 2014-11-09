package edu.cmu.capstone.polaris.authorization;

public interface AuthorizationPolicy {
	public boolean accept(Token t);
}
