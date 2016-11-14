package com.laioffer.laiofferproject;

/**
 * Created by juntao on 11/3/16.
 */
import android.util.Log;

import org.scribe.builder.ServiceBuilder;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;

public class YelpApi {
    private static final String API_HOST = "api.yelp.com";
    private static final String SEARCH_PATH = "/v2/search";


    private static final String CONSUMER_KEY = "ab__X-zgi-2wzP7J4Z0lmQ";
    private static final String CONSUMER_SECRET = "ZbdflkSQP6j5Ed3eYc2AxZnrSJo";
    private static final String TOKEN = "Ns7gPRa-nR1H2DY8B6mhfwR-5isxM1wH";
    private static final String TOKEN_SECRET = "weSeIWJ1bUPu7D27pgBwSRT4Bmk";


    private OAuthService service;
    private Token accessToken;


    /**
     * Setup the Yelp API OAuth credentials.
     */
    public YelpApi() {
        this.service = new ServiceBuilder().provider(TwoStepOAuth.class).apiKey(CONSUMER_KEY)
                .apiSecret(CONSUMER_SECRET).build();
        this.accessToken = new Token(TOKEN, TOKEN_SECRET);
    }


    /**
     * Fire a search request to Yelp API.
     */
    public String searchForBusinessesByLocation(String term, String location, int searchLimit) {
        OAuthRequest request = new OAuthRequest(Verb.GET, "http://" + API_HOST + SEARCH_PATH);
        request.addQuerystringParameter("term", term);
        request.addQuerystringParameter("location", location);
        request.addQuerystringParameter("limit", String.valueOf(searchLimit));
        this.service.signRequest(this.accessToken, request);
        Response response = request.send();
        Log.i("message", response.getBody());
        return response.getBody();
    }
}

