package com.onurdemir.koincryptocrazy.service

import com.onurdemir.koincryptocrazy.model.CryptoModel
import retrofit2.Response
import retrofit2.http.GET

interface CryptoAPI {

    //atilsamancioglu/K21-JSONDataSet/master/crypto.json
    // BASE_URL -> https://raw.githubusercontent.com/

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    suspend fun getData() : Response<List<CryptoModel>>

}