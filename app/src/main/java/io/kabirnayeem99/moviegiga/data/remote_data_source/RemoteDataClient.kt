package io.kabirnayeem99.moviegiga.data.remote_data_source

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

const val API_KEY = "cc2cd6cbc2d4a7660e5cca714722d4f8"
const val POSTER_PATH_URL = "https://image.tmdb.org/t/p/w500"
const val BASE_URL = "https://api.themoviedb.org/3/"

// To refer to the object, we use its name directly:
// Such as, RemoteDataClient.getClient()
object RemoteDataClient {
    fun getClient(): RemoteDataService {
        // Interceptors are a powerful mechanism that can monitor, rewrite, and retry calls.
        val requestInterceptor = Interceptor { chain ->
            val url = chain.request()
                .url().newBuilder().addQueryParameter("api_key", API_KEY).build()
            val request = chain.request().newBuilder().url(url).build()
                                              
            // A call to chain.proceed(request) is a critical part of each interceptor’s
            // implementation. This simple-looking method is where all the HTTP work happens,
            // producing a response to satisfy the request.                                 
            return@Interceptor chain.proceed(request)
        }
        val okHttpClient: OkHttpClient = OkHttpClient.Builder().addInterceptor(requestInterceptor)
            .connectTimeout(60, TimeUnit.SECONDS).build() // The HTTP client used for requests.
        
        // This action of returning from the background thread, which receives and 
        // prepares the result, to the Android UI thread is a call adapter!
        
        return Retrofit.Builder().client(okHttpClient) // The HTTP client used for requests.
        .baseUrl(BASE_URL) // Set the API base URL.
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create()) //CallAdapter.Factory call adapter} which uses RxJava 2 for creating observables.
            .addConverterFactory(GsonConverterFactory.create()) // Add converter factory for serialization and deserialization of objects.
            .build() // Create the Retrofit instance using the configured values.
        .create(RemoteDataService::class.java)
    }
}

