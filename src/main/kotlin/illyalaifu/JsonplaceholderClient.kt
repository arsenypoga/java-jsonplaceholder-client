package illyalaifu

import illyalaifu.entities.Post
import illyalaifu.entities.Todo
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.client.WebClient
import java.util.*


class JsonplaceholderClient {
    private var client = WebClient.create("https://jsonplaceholder.typicode.com")

    fun getTodos(): Array<Todo>? = client
        .get()
        .uri("/todos")
        .accept(MediaType.APPLICATION_JSON)
        .retrieve()
        .bodyToMono(Array<Todo>::class.java)
        .block()

    fun getPost(index: Int): Post? = client
        .get()
        .uri("/posts/$index")
        .accept(MediaType.APPLICATION_JSON)
        .retrieve()
        .bodyToMono(Post::class.java)
        .block()


    fun getPosts(): Array<Post>? = client
        .get()
        .uri("/posts")
        .accept(MediaType.APPLICATION_JSON)
        .retrieve()
        .bodyToMono(Array<Post>::class.java)
        .block()
}