package com.example.stevejobs.newsapp.Remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by SteveJobs on 1/20/2018.
 */

public class IconBetterIdeaClient {
    private static Retrofit retrofit=null;
    public static Retrofit getClient()
    {
        if(retrofit==null)
        {
            retrofit=new Retrofit.Builder().baseUrl("https://icons.better-idea.org/").addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
