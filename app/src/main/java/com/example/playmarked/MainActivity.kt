package com.example.playmarked

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.playmarked.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var list: ArrayList<Program>
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setData()
    }

    private fun setData() {
        list = ArrayList()
        list.add(
            Program(
                "O'xshash dasturlar",
                arrayListOf(
                    Project(
                        "https://ru.techbriefly.com/wp-content/uploads/2021/08/%D0%9A%D0%B0%D0%BA-%D1%83%D0%B4%D0%B0%D0%BB%D0%B8%D1%82%D1%8C-%D0%B8%D1%81%D1%82%D0%BE%D1%80%D0%B8%D1%8E-Snapchat.jpg",
                        "Snapchat"
                    ),
                    Project(
                        "https://is5-ssl.mzstatic.com/image/thumb/Purple122/v4/5d/ac/e0/5dace070-f03b-327d-2772-96cd89bb459b/AppIcon_TikTok-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/1200x630wa.png",
                        "TikYok"
                    ),
                    Project(
                        "https://www.ixbt.com/img/n1/news/2021/4/2/spotify-logo-1920x1080-2-1536x865_large.png",
                        "Spotify"
                    ),
                    Project(
                        "https://imag.malavida.com/mvimgbig/download-fs/like-20189-2.jpg",
                        "Likee"
                    )
                )
            )
        )
        list.add(
            Program(
                "O'xshash dasturlar",
                arrayListOf(
                    Project(
                        "https://ru.techbriefly.com/wp-content/uploads/2021/08/%D0%9A%D0%B0%D0%BA-%D1%83%D0%B4%D0%B0%D0%BB%D0%B8%D1%82%D1%8C-%D0%B8%D1%81%D1%82%D0%BE%D1%80%D0%B8%D1%8E-Snapchat.jpg",
                        "Snapchat"
                    ),
                    Project(
                        "https://is5-ssl.mzstatic.com/image/thumb/Purple122/v4/5d/ac/e0/5dace070-f03b-327d-2772-96cd89bb459b/AppIcon_TikTok-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/1200x630wa.png",
                        "TikYok"
                    ),
                    Project(
                        "https://www.ixbt.com/img/n1/news/2021/4/2/spotify-logo-1920x1080-2-1536x865_large.png",
                        "Spotify"
                    ),
                    Project(
                        "https://imag.malavida.com/mvimgbig/download-fs/like-20189-2.jpg",
                        "Likee"
                    )
                )
            )
        )
        list.add(
            Program(
                "O'xshash dasturlar",
                arrayListOf(
                    Project(
                        "https://ru.techbriefly.com/wp-content/uploads/2021/08/%D0%9A%D0%B0%D0%BA-%D1%83%D0%B4%D0%B0%D0%BB%D0%B8%D1%82%D1%8C-%D0%B8%D1%81%D1%82%D0%BE%D1%80%D0%B8%D1%8E-Snapchat.jpg",
                        "Snapchat"
                    ),
                    Project(
                        "https://is5-ssl.mzstatic.com/image/thumb/Purple122/v4/5d/ac/e0/5dace070-f03b-327d-2772-96cd89bb459b/AppIcon_TikTok-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/1200x630wa.png",
                        "TikYok"
                    ),
                    Project(
                        "https://www.ixbt.com/img/n1/news/2021/4/2/spotify-logo-1920x1080-2-1536x865_large.png",
                        "Spotify"
                    ),
                    Project(
                        "https://imag.malavida.com/mvimgbig/download-fs/like-20189-2.jpg",
                        "Likee"
                    )
                )
            )
        )
        list.add(
            Program(
                "O'xshash dasturlar",
                arrayListOf(
                    Project(
                        "https://ru.techbriefly.com/wp-content/uploads/2021/08/%D0%9A%D0%B0%D0%BA-%D1%83%D0%B4%D0%B0%D0%BB%D0%B8%D1%82%D1%8C-%D0%B8%D1%81%D1%82%D0%BE%D1%80%D0%B8%D1%8E-Snapchat.jpg",
                        "Snapchat"
                    ),
                    Project(
                        "https://is5-ssl.mzstatic.com/image/thumb/Purple122/v4/5d/ac/e0/5dace070-f03b-327d-2772-96cd89bb459b/AppIcon_TikTok-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/1200x630wa.png",
                        "TikYok"
                    ),
                    Project(
                        "https://www.ixbt.com/img/n1/news/2021/4/2/spotify-logo-1920x1080-2-1536x865_large.png",
                        "Spotify"
                    ),
                    Project(
                        "https://imag.malavida.com/mvimgbig/download-fs/like-20189-2.jpg",
                        "Likee"
                    )
                )
            )
        )
        list.add(
            Program(
                "O'xshash dasturlar",
                arrayListOf(
                    Project(
                        "https://ru.techbriefly.com/wp-content/uploads/2021/08/%D0%9A%D0%B0%D0%BA-%D1%83%D0%B4%D0%B0%D0%BB%D0%B8%D1%82%D1%8C-%D0%B8%D1%81%D1%82%D0%BE%D1%80%D0%B8%D1%8E-Snapchat.jpg",
                        "Snapchat"
                    ),
                    Project(
                        "https://is5-ssl.mzstatic.com/image/thumb/Purple122/v4/5d/ac/e0/5dace070-f03b-327d-2772-96cd89bb459b/AppIcon_TikTok-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/1200x630wa.png",
                        "TikYok"
                    ),
                    Project(
                        "https://www.ixbt.com/img/n1/news/2021/4/2/spotify-logo-1920x1080-2-1536x865_large.png",
                        "Spotify"
                    ),
                    Project(
                        "https://imag.malavida.com/mvimgbig/download-fs/like-20189-2.jpg",
                        "Likee"
                    )
                )
            )
        )


    }

}