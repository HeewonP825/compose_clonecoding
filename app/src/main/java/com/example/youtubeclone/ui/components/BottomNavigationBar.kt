package com.example.youtubeclone.ui.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import com.example.youtubeclone.R

@Composable
fun BottomNavigationBar() {
    var selectedIndex by remember { mutableStateOf(0) }

    BottomNavigation(
        backgroundColor = Color.White,
        contentColor = Color.Black
    ) {
        BottomNavigationItem(
            icon = { Icon(painter = painterResource(id = R.drawable.ic_home), contentDescription = "Home") },
            label = { Text("Home", fontSize = 12.sp) },
            selected = selectedIndex == 0,
            onClick = { selectedIndex = 0 }
        )
        BottomNavigationItem(
            icon = { Icon(painter = painterResource(id = R.drawable.ic_shorts), contentDescription = "Shorts") },
            label = { Text("Shorts", fontSize = 12.sp) },
            selected = selectedIndex == 1,
            onClick = { selectedIndex = 1 }
        )
        BottomNavigationItem(
            icon = { Icon(painter = painterResource(id = R.drawable.ic_subscription), contentDescription = "Subscriptions") },
            label = { Text("Subscription", fontSize = 12.sp) },
            selected = selectedIndex == 2,
            onClick = { selectedIndex = 2 }
        )
        BottomNavigationItem(
            icon = { Icon(painter = painterResource(id = R.drawable.ic_library), contentDescription = "Library") },
            label = { Text("Library", fontSize = 12.sp) },
            selected = selectedIndex == 3,
            onClick = { selectedIndex = 3 }
        )
    }
}