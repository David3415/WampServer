package com.example.wampserver

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.data.EmptyGroup.name
import androidx.compose.ui.unit.dp
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var mainApi: MainApi
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        // enableEdgeToEdge()
        /* CoroutineScope(Dispatchers.IO).launch {
             val list = mainApi.getAllUsers()
             list.forEach { user -> Log.d("MyLog", "User: ${user.name}") }
         }*/
    }
}

@Composable
fun mainScreen() {
    val name = remember {
        mutableStateOf("")
    }
    val age = remember {
        mutableStateOf("")
    }
    Column(modifier = Modifier.fillMaxSize()) {
        LazyColumn(
            modifier = Modifier
                .fillMaxHeight(0.7f)
                .fillMaxWidth()
                .background(color = Color.Blue), verticalArrangement = Arrangement.SpaceBetween
        ) {

        }
        Spacer(modifier = Modifier.height(10.dp))
        TextField(value = name.value, onValueChange = {
            name.value
        })
        Spacer(modifier = Modifier.height(5.dp))
        TextField(value = age.value, onValueChange = {
            age.value
        })
        Button(onClick = {


        }) {
            Text(text = "Save user")

        }

    }
}
