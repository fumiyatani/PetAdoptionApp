// Composable メソッドは大文字から始めるため
@file:Suppress("FunctionName")

package com.fumiyatani.mycomposesample

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.fumiyatani.mycomposesample.data.Pet
import com.fumiyatani.mycomposesample.data.PetCreator

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeScreen()
        }
    }

    @Composable
    fun HomeScreen() {
        Scaffold(
            content = {
                PetList()
            },
        )
    }

    @Composable
    fun PetList() {
        val verticalScrollModifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
        val centerHorizontalAlignment = Alignment.CenterHorizontally

        Column(
            modifier = verticalScrollModifier,
            horizontalAlignment = centerHorizontalAlignment
        ) {
            MutableList(40) {
                val dog = PetCreator.createPet(it)
                PetRow(dog)
            }
        }
    }

    @Composable
    fun PetRow(pet: Pet) {
        val modifier = Modifier
            .fillMaxWidth()
            .padding(Dimen.DP_4)

        Card(
            modifier,
            elevation = Dimen.DP_4
        ) {
            Column {
                Text(pet.name)
                Text(pet.age.toString())
                Text(pet.character)
                Text(pet.sex.sexText)
                Text(pet.description)
            }
        }
    }
}