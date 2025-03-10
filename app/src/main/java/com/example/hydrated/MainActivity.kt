package com.example.hydrated

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.hydrated.ui.theme.HydratedTheme
import com.example.hydrated.viewModel.SplashViewModel

class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<SplashViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen().apply {
            setKeepOnScreenCondition {
                !viewModel.isReady.value
            }
        }
        enableEdgeToEdge()
        setContent {
            HydratedTheme {
                HydratedApp()
            }
        }
    }
}

@Composable
fun HydratedApp() {

}