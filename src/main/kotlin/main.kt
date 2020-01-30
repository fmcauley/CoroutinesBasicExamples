import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main() = runBlocking<Unit> {
   // waiting for a job

    println("Hello,")
    job.join()
}

val job = GlobalScope.launch {
    delay(1000L)
    println("World!")
}