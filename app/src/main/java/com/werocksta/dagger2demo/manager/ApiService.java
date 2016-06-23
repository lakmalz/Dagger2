package com.werocksta.dagger2demo.manager;

import com.werocksta.dagger2demo.model.RepoCollection;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface ApiService {

    @GET("{user}/repos")
    Observable<RepoCollection> getRepo(@Path("users") String user);
}