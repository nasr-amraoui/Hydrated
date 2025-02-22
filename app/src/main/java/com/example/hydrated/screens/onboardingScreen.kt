package com.example.hydrated.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.NavController
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnboardingScreen(navController: NavController) {
    val pages = listOf("Page 1", "Page 2", "Page 3")
    val pagerState = rememberPagerState(0, 0f) { pages.size }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HorizontalPager(
            beyondBoundsPageCount = pages.size,
            state = pagerState,
            modifier = Modifier.weight(1f)
        ) { page ->
            Text(text = pages[page], fontSize = 24.sp)
        }
        Button(onClick = { navController.navigate("main") }) {
            Text("Get Started")
        }
    }
}