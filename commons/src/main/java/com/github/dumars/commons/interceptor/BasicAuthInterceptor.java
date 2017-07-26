package com.github.dumars.commons.interceptor;

import com.google.common.base.Charsets;
import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

public class BasicAuthInterceptor implements ClientHttpRequestInterceptor {

	private final String username;
	private final String password;

	public BasicAuthInterceptor(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
		final String auth = username + ":" + password;
		final String authHeader = "Basic " + new String(Base64.encodeBase64(auth.getBytes(Charsets.UTF_8)));

		request.getHeaders().add("Authorization", authHeader);

		return execution.execute(request, body);
	}

}
