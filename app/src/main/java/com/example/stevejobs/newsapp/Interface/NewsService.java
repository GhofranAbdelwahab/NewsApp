package com.example.stevejobs.newsapp.Interface;

import com.example.stevejobs.newsapp.Model.News;
import com.example.stevejobs.newsapp.Model.WebSite;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by SteveJobs on 1/20/2018.
 */

public interface NewsService {
    @GET("v1/sources?language=en")
    Call<WebSite> getSource();

    @GET
    Call<News> getNewsArticle(@Url String url);
}
