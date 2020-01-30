import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main() = runBlocking<Unit> {
    GlobalScope.launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    delay(2000L)

    /*
    Here runBlocking<Unit> { ... } works as an adaptor that is used to start the top-level main coroutine.
    We explicitly specify its Unit return type, because a well-formed main function in Kotlin has to return Unit.
     */
}