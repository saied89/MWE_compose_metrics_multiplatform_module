package com.example.mwe_compose_metrics_multiplatform_module

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.mwe_compose_metrics_multiplatform_module.ui.theme.MWE_compose_metrics_multiplatform_moduleTheme
import com.example.shared.SharedGreetingName
import com.example.shared.getGreetingName

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MWE_compose_metrics_multiplatform_moduleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting(getGreetingName())
                }
            }
        }
    }
}

@Composable
fun Greeting(greetingName: SharedGreetingName) {
    Text(text = "Hello ${greetingName.name}!")
}