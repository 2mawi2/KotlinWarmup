//declared at toplevel
fun foo(parameter: String): String {
    return parameter
}

fun foo2(parameter: String) = parameter

val foo3: (String) -> String = { parameter ->
    parameter
}
val foo4 = { parameter: String ->
    parameter
}

fun functionWithOptionalParameters(
    notOptional: String,
    optionalParameter: String = "default value"
): String {
    return notOptional + optionalParameter
}


fun callFunctionWithOptionalParameters() {
    functionWithOptionalParameters("notOptional")
    functionWithOptionalParameters(
        notOptional = "notOptional"
    )
    functionWithOptionalParameters(
        notOptional = "notOptional",
        optionalParameter = "no default"
    )
}


fun functionWithLambdaArgument(
    firstArg: String,
    lambda: (String) -> String
): String {
    return lambda(firstArg)
}

fun callFunctionWithLambdaArgument() {
    functionWithLambdaArgument("first") { s: String -> s + s }
    functionWithLambdaArgument("first") { s: String -> s + s }
    functionWithLambdaArgument("first") { it + it }
}
