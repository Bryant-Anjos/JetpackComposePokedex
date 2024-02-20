package com.bryant.pokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.bryant.pokedex.data.remote.responses.Pokemon
import com.bryant.pokedex.repository.PokemonRepository
import com.bryant.pokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel
    @Inject
    constructor(
        private val repository: PokemonRepository,
    ) : ViewModel() {
        suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
            return repository.getPokemonInfo(pokemonName)
        }
    }
