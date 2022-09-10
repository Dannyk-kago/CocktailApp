package com.developerdan.cocktailapp.view_models

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.developerdan.cocktailapp.models.data.remote.cocktailDto.Drink
import com.developerdan.cocktailapp.models.repository.RepositoryDef
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RandomCocktailViewModel @Inject constructor  (
    private val repositoryDef: RepositoryDef
): ViewModel() {

    private val _state = MutableStateFlow(emptyList<Drink>())
    val state: StateFlow<List<Drink>> = _state

    init {
        getRandomCocktail()
    }

    private fun getRandomCocktail() {
        viewModelScope.launch {
            _state.value = repositoryDef.randomCocktail()
        }
    }

}