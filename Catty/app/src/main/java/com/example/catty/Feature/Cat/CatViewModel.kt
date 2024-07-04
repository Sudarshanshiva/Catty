package com.example.catty.Feature.Cat

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.catty.CatFactResponse
import com.example.catty.data.network.NetworkService
import kotlinx.coroutines.launch

class CatViewModel():ViewModel() {

    var fact by mutableStateOf<CatFactResponse?>(null)

    init {
        fetchACatFact()
    }
    private fun fetchACatFact(){
        viewModelScope.launch {
            val response = NetworkService.service.getAFact()
            if(response.fact.isNullOrEmpty().not()){
                fact = response
            }
        }
    }
}