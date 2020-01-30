import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main() {
    GlobalScope.launch{
        delay(1000L)
        print("World!")
    }
    println("Hello,")
    Thread.sleep(2000L)

    // Thread Example with no Coroutine
    thread {
        Thread.sleep(1000L)
        print("Hot!")
    }
    println("Like it's")
    Thread.sleep(2000L)
}