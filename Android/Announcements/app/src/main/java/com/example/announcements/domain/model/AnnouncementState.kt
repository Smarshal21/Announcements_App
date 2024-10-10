package com.example.announcements.domain.model

data class AnnouncementState(
    val isEnteringToken: Boolean = true,
    val remoteToken: String = "",
    val messageText: String = ""
)
