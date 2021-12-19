package app.softwork.routingcompose

@JsNonModule
@JsModule("uuid")
internal external object UUIDGen {
    fun v4(): UUID
    fun validate(uuid: UUID): Boolean
}

internal actual fun validateUUID(uuid: UUID): Boolean {
    return UUIDGen.validate(uuid)
}