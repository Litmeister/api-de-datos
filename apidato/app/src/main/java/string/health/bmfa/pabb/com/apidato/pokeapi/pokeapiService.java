package string.health.bmfa.pabb.com.apidato.pokeapi;

import retrofit2.Call;
import retrofit2.http.GET;
import string.health.bmfa.pabb.com.apidato.models.PokemonRespuesta;
public interface pokeapiService {

    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPokemon();
}
