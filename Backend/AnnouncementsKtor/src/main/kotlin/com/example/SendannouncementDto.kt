package com.example

import com.google.firebase.messaging.Message
import com.google.firebase.messaging.Notification

data class SendannouncementDto(
    val to: String?,
    val notification: NotificationBody
)

data class NotificationBody(
    val title: String,
    val body: String
)

fun SendannouncementDto.toMessage(): Message {
    return Message.builder()
        .setNotification(
            Notification.builder()
                .setTitle(notification.title)
                .setBody(notification.body)
                .build()
        )
        .apply {
            if(to == null) {
                setTopic("chat")
            } else {
                setToken(to)
            }
        }
        .build()
}