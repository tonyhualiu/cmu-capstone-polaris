/**
 * 
 */
package edu.cmu.capstone.polaris.authorization;

/**
 * This is the checker class that uses a Token and a Policy to 
 * determine if the user has the authorization to access this API.'
 * 
 * This works for now, but I think a better way is to adapt Apache Shiro.
 * @author tony
 * @see AuthorizationPolicy
 * @see Token
 */
public class AuthorizationChecker {
	/**
	 * 
	 * @param t - The token to check
	 * @param p - The policy to allow several tokens to pass
	 * @return <code>True</code> is the policy allows the app with the token
	 * 			to access this endpoint.
	 */
	public static boolean checkTokenWithPolicy(Token t, AuthorizationPolicy p){
		return p.accept(t);
	}
}
