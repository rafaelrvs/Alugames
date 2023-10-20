
import com.google.gson.Gson
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

fun main() {
 val client: HttpClient = HttpClient.newHttpClient(); // faz a requisição
 val request = HttpRequest.newBuilder().uri(URI.create(("https://www.cheapshark.com/api/1.0/games?id=146"))).build() // acessa o endpoint
 val response = client.send(request, HttpResponse.BodyHandlers.ofString()) // pega a requisição

 val json = response.body() // pega a requisção e descarrega em uma variavel
 println(json)

 val gson = Gson()
 val meuInfoJogo = gson.fromJson(json, infoJogo::class.java) //Desserialização


 val meuJogo = Jogo(meuInfoJogo.info.title,
  meuInfoJogo.info.thumb)
 println(meuJogo)
}