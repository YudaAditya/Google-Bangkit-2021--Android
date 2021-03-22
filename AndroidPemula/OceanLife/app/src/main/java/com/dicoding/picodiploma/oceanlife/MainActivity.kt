package com.dicoding.picodiploma.oceanlife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.math.log

class MainActivity : AppCompatActivity() , View.OnClickListener{
    private lateinit var rvFish: RecyclerView
    private val list: ArrayList<Fish> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFish = findViewById(R.id.rv_ocean_life)
        rvFish.setHasFixedSize(true)
        list.addAll(FishData.listData)
        showRecyclerList()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId==R.id.about) {
            startActivity(Intent(this@MainActivity, AboutActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }


    private fun showRecyclerList() {
        rvFish.layoutManager=LinearLayoutManager(this)
        val listFishAdapter = ListFishAdapter(list)
        rvFish.adapter = listFishAdapter
        listFishAdapter.setOnItemClickCallback(object : ListFishAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Fish) {
                val moveIntentDetail = Intent(this@MainActivity, DetailActivity::class.java)
                moveIntentDetail.putExtra(DetailActivity.EXTRA_NAME, data.name)
                moveIntentDetail.putExtra(DetailActivity.EXTRA_DETAIL, data.detail)
                moveIntentDetail.putExtra(DetailActivity.EXTRA_IMG, data.photo)
                startActivity(moveIntentDetail)
                showSelectedFish(data)
            }
        })
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.menu.menu_main -> {
                val moveIntentProfile = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntentProfile)
            }
        }
    }

    private fun showSelectedFish(fish: Fish) {
//        val moveIntentDetail = Intent(this@MainActivity, DetailActivity::class.java)
//        moveIntentDetail.putExtra("EXTRA_NAME", fish.name)
//        moveIntentDetail.putExtra("EXTRA_DETAIL", fish.detail)
//        moveIntentDetail.putExtra("EXTRA_IMG", fish.photo)
//        startActivity(moveIntentDetail)
//        Toast.makeText(this, "Kamu memilih " + fish.name, Toast.LENGTH_SHORT).show()
    }
}