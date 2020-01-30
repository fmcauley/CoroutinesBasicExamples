import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main() = runBlocking<Unit> {
  // making the scope of the coroutine more local
    launch {
        delay(1000L)
        println("Word")
    }
    println("Hello,")
}
