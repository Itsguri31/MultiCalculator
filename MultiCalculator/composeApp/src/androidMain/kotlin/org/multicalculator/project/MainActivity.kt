package org.multicalculator.project

import App
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CalcView()
        }

    }

    @Composable
    fun CalcView() {
         }



    @Composable
    fun CalcRow () {

            }




    @Composable
    fun CalcDisplay() {

    }

    private fun Text(value: String, modiffier: Modifier) {

    }

    @Composable
    fun CalcNumericButton() {

    }
    @Composable
    fun CalcOperationButton(){


    }
    @Composable
    fun CalcEqualsButton(){

}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}}
