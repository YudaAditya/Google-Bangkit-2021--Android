package com.dicoding.picodiploma.oceanlife

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_IMG = "extra_img"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvDataName: TextView= findViewById(R.id.tv_detail_name)
        val tvDataDetail: TextView= findViewById(R.id.tv_detail_detail)
        val ivImgPhoto:ImageView= findViewById(R.id.img_detail_photo)

        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val photo = intent.getIntExtra(EXTRA_IMG,0)

        tvDataName.text= name
        tvDataDetail.text= detail
        Glide.with(this)
            .load(photo)
            .apply(RequestOptions())
            .into(ivImgPhoto)
    }
}