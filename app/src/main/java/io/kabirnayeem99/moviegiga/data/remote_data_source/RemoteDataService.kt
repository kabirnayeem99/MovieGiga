package io.kabirnayeem99.moviegiga.data.remote_data_source

import io.kabirnayeem99.moviegiga.data.value_object.Movie
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RemoteDataService {
    @GET("movie/{movie_id}")
    fun getMovieDetails(
        @Path("movie_id") id: Int,
        @Query("api_key") apiKey: String
    ): Single<Movie>
}