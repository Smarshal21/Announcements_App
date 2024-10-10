package com.example.announcements.data

import com.example.announcements.domain.model.AnnounceDto
import retrofit2.http.Body
import retrofit2.http.POST

interface AnnouncementsApi {

    @POST("/send")
    suspend fun sendMessage(
        @Body body: AnnounceDto
    )

    @POST("/broadcast")
    suspend fun broadcast(
        @Body body: AnnounceDto
    )
}