package com.fumiyatani.mycomposesample

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeScreen()
        }
    }

    @Composable
    fun HomeScreen() {
        Scaffold(
            topBar = { Text("My Jetpack Compose") },
            content = {
                Column {
                    Text("これはテキスト1")
                    Text("これはテキスト2")
                    Text("これはテキスト3")
                    Text("これはテキスト4")
                    Text("これはテキスト5")
                }
            }
        )
    }
}