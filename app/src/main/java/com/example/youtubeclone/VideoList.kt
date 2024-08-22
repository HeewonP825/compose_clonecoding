package com.example.youtubeclone

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.ui.draw.clip

data class VideoData(
    val title: String,
    val thumbnailUrl: String,
    val description: String,
    val viewsAndDate: String
)

@Composable
fun VideoList() {
    val videos = listOf(
        VideoData("McDonald's", "https://via.placeholder.com/150", "Lorem ipsum dolor sit amet...", "247k views • 2 days ago"),
        VideoData("Dyson", "https://via.placeholder.com/150", "Lorem ipsum dolor sit amet...", "247k views • 2 days ago"),
        VideoData("McDonald's", "https://via.placeholder.com/150", "Lorem ipsum dolor sit amet...", "247k views • 2 days ago"),
        VideoData("Dyson", "https://via.placeholder.com/150", "Lorem ipsum dolor sit amet...", "247k views • 2 days ago"),
        VideoData("McDonald's", "https://via.placeholder.com/150", "Lorem ipsum dolor sit amet...", "247k views • 2 days ago"),
        VideoData("Dyson", "https://via.placeholder.com/150", "Lorem ipsum dolor sit amet...", "247k views • 2 days ago")
    )

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(8.dp)
    ) {
        items(videos) { video ->
            VideoItem(video)
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun VideoItem(video: VideoData) {
    Column(modifier = Modifier.fillMaxWidth()) {
        // 비디오 썸네일 이미지
        Image(
            painter = rememberImagePainter(video.thumbnailUrl),
            contentDescription = "Video Thumbnail",
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(16f / 9f),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(8.dp))  // 이미지와 텍스트 사이의 간격 추가

        // 프로필 이미지와 텍스트를 가로로 배치
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)) {

            // 프로필 이미지
            Image(
                painter = rememberImagePainter("https://via.placeholder.com/48"),
                contentDescription = "Channel Profile Image",
                modifier = Modifier
                    .size(48.dp)
                    //.clip(CircleShape)
                    .padding(end = 8.dp),
            )

            // 텍스트들 (채널 이름, 조회수, 업로드 날짜)
            Column(modifier = Modifier.weight(1f)) {
                Text(text = video.title, fontWeight = FontWeight.Bold, fontSize = 16.sp, maxLines = 2)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "Channel Name • ${video.viewsAndDate}", fontSize = 12.sp, color = Color.Gray)
            }

            // 추가 옵션 아이콘
            IconButton(onClick = {}) {
                Icon(Icons.Default.MoreVert, contentDescription = "More Options")
            }
        }
    }
}