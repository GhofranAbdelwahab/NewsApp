package com.example.stevejobs.newsapp.Common;

import com.example.stevejobs.newsapp.Interface.IconBetterIdeaService;
import com.example.stevejobs.newsapp.Interface.NewsService;
import com.example.stevejobs.newsapp.Remote.IconBetterIdeaClient;
import com.example.stevejobs.newsapp.Remote.RetrofitClient;

import retrofit2.Retrofit;

/**
 * Created by SteveJobs on 1/20/2018.
 */

public class Common {
    public static final String BASE_URL="https://newsapi.org/";
    public static final String API_KEY="26f728f13246404bb4db4c2d579e31af";

    public static NewsService getNewsService(){
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }

    public static IconBetterIdeaService getIconService(){
        return IconBetterIdeaClient.getClient().create(IconBetterIdeaService.class);
    }

    public static String getAPIUrl(String source , String sortBy,String apiKey)
    {
        StringBuilder apiUrl = new StringBuilder("https://newsapi.org/v1/articles?source=");
        return apiUrl.append(source).append("&sortBy=").append(sortBy).append("&apiKey=").append(apiKey).toString();
    }

}
