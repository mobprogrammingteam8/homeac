package com.example.storyactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val storyList = arrayListOf(
            Story("2023.10.13", "https://image.utoimage.com/preview/cp872722/2022/12/202212008462_500.jpg",
                arrayListOf("#강아지", "#귀여움"), "강아지 너무 귀엽다"),
            Story("2023.10.17", "https://image.utoimage.com/preview/cp780416/2016/09/201609017008_500.jpg",
                arrayListOf("#산책", "#별"), "별 산책을 나가보았다"),
            Story("2023.10.20", "https://image.utoimage.com/preview/cp872722/2020/06/202006010944_500.jpg",
                arrayListOf("#샐러드", "#친구"), "점심시간에 친구들과 같이 샐러드를 먹었다. 이렇게 맛있는 샐러드는 처음이었다. 수박도 맛있었다."),
            Story("2023.10.25", "https://image.utoimage.com/preview/cp872722/2022/06/202206006522_500.jpg",
                arrayListOf("#화해바람", "#다툼"), "아빠에게 짜증을 냈다. 미안했다."),
            Story("2023.10.31", "https://image.utoimage.com/preview/cp872722/2022/06/202206006522_500.jpg",
                arrayListOf("#미끄럼틀", "#워터파크"), "워터파크를 다녀왔다. 미끄럼틀 짱재미짐"),
        )
        val rv_profile = findViewById<RecyclerView>(R.id.rv_profile)
        rv_profile.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_profile.setHasFixedSize(true)

        rv_profile.adapter = StoryAdapter(storyList)
    }
}