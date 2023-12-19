package com.jayakarta.uashasan.Network.Movies

import retrofit2.http.GET

interface MoviesAPI {

    @GET("api/movies")
    suspend fun getMovies(): ResponseMovies
}

