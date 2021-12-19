package app.softwork.routingcompose

import java.util.UUID


internal actual fun validateUUID(uuid: String): Boolean {
    return try { UUID.fromString(uuid); true } catch (e: Throwable) { false }
}