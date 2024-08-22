package com.example.youtubeclone.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.youtubeclone.R

@Composable
fun CircularImage() {
    Box(
        modifier = Modifier
            .size(40.dp)
            .clip(CircleShape) // 원형으로 자르기
            .background(Color.Gray) // 백그라운드 컬러를 설정해 이미지 이외의 영역 확인 가능
    ) {
        Image(
            painter = rememberImagePainter("https://via.placeholder.com/48"),
            contentDescription = "Profile",
            modifier = Modifier
                .size(40.dp) // 이미지의 크기 설정
        )
    }
}