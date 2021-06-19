package app.softwork.routingcompose

import androidx.compose.runtime.*

public typealias UUID = String

internal expect fun validateUUID(uuid: UUID): Boolean

public class UUIDContentNode : ContentNode() {
    public lateinit var content: @Composable NavBuilder.Content.(UUID) -> Unit

    override fun matches(subRoute: String): Boolean = validateUUID(subRoute)

    @Composable
    override fun display(argument: String) {
        NavBuilder.Content.content(argument)
    }
}
