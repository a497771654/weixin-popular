package weixin.popular.api;

import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;

import weixin.popular.bean.token.Token;
import weixin.popular.client.LocalHttpClient;

/**
 * ACCESS_TOKEN API
 * @author LiYi
 *
 */
public class TokenAPI extends BaseAPI{

	/**
	 * 获取access_token
	 * @param appid appid
	 * @param secret secret
	 * @return Token
	 */
	public static Token token(String appid,String secret){
		HttpUriRequest httpUriRequest = RequestBuilder.get()
				.setUri(BASE_URI + "/cgi-bin/token")
				.addParameter("grant_type","client_credential")
				.addParameter("appid", appid)
				.addParameter("secret", secret)
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,Token.class);
	}
	public static Token getTokenFromProxy(String url){
		HttpUriRequest httpUriRequest = RequestBuilder.get()
				.setUri(url)
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,Token.class);
	}

	public static void main(String[] args) {
		Token token = TokenAPI.getTokenFromProxy("http://localhost:3000");
		System.out.println(token.getAccess_token());
	}
}
