package illyalaifu

import illyalaifu.entities.Post
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


internal class JsonplaceholderClientTest {
    var client = JsonplaceholderClient()

    @Test
    fun getTodos() {
        assertEquals(200, client.getTodos()?.size)
    }

    @Test
    fun getPost() {
        assertEquals(
            Post(
                userId = 1,
                id = 1,
                title = "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
                body = "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
            ),
            client.getPost(1)
        )
    }

    @Test
    fun getPosts() {
        assertEquals(100, client.getPosts()?.size)
    }
}