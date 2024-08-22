package com.example.youtubeclone.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.example.youtubeclone.R

@Composable
fun TopAppBarContent() {
    TopAppBar(
        backgroundColor = Color.White,  // 배경색을 흰색으로 설정
        contentColor = Color.Black,     // 텍스트 및 아이콘 색상을 검은색으로 설정
        elevation = 4.dp,
    ) {
        // 유튜브 로고와 텍스트
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.weight(1f)
        ) {
            Image(
                painter = painterResource(id = R.drawable.youtube_logo),
                contentDescription = "YouTube Logo",
                modifier = Modifier
                    .size(40.dp)
                    .padding(start = 8.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "YouTube",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }

        // 오른쪽 아이콘들 (검색, 프로필)
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            IconButton(onClick = { /* 검색 버튼 클릭 시 */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_search),
                    contentDescription = "Search",
                    modifier = Modifier.size(23.dp)
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            IconButton(onClick = { /* 프로필 버튼 클릭 시 */ }) {
                CircularImage()  // 원형 프로필 이미지
            }
        }
    }
}