package com.e.exo8.data.repository

import com.e.exo8.data.network.Api
import com.e.exo8.data.network.SafeApiRequest

class TaskRepository (
    private val api : Api
) : SafeApiRequest(){

    suspend fun getAll() = apiRequest { api.getAll() }

}