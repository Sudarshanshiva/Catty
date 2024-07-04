package com.example.catty.Feature.Cat

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CatFactScreen(modifier: Modifier = Modifier){
    Scaffold (modifier = Modifier.fillMaxSize()){ innerPadding ->
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            ,verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) 
        {
            val viewModel : CatViewModel = viewModel()
            Text(
                modifier = Modifier.padding(16.dp),
                text = "fact : ${viewModel.fact?.fact}",
                style = TextStyle(fontSize = 24.sp))
        }
    }
}