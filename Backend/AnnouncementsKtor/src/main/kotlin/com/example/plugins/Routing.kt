package com.example.plugins

import com.example.sendAnnouncement
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        sendAnnouncement()
    }
}
