package com.example.announcements.domain.model

data class AnnounceDto(
    val to: String?,
    val notification: NotificationBody
)

data class NotificationBody(
    val title: String,
    val body: String
)
