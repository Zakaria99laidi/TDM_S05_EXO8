package com.e.exo8.data.network


import com.e.exo8.exception.GetDataFromApiException
import retrofit2.Response


 abstract  class SafeApiRequest {

    suspend fun <T : Any> apiRequest(call : suspend () -> Response<T>) : T {
        val response = call.invoke()
        if( response.isSuccessful){
            return response.body()!!
        }
        else {
            throw GetDataFromApiException(response.code().toString())
        }
    }
}