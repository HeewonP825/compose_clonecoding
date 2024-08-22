package com.example.youtubeclone

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.youtubeclone.ui.components.BottomNavigationBar
import com.example.youtubeclone.ui.components.ChipRow
import com.example.youtubeclone.ui.components.TopAppBarContent
import com.example.youtubeclone.ui.components.VideoList

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyApp() {
    Scaffold(
        topBar = { TopAppBarContent() },
        bottomBar = { BottomNavigationBar() }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            ChipRow()
            VideoList()
        }
    }
}