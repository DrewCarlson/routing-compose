package app.softwork.routingcompose


public class UUIDRouteNode : VariableRouteNode<UUID>() {
    override fun variable(fromRoute: String): UUID? = fromRoute.takeIf(::validateUUID)

    override fun toString(): String = "UUIDRouteNode(children='$children')"
}