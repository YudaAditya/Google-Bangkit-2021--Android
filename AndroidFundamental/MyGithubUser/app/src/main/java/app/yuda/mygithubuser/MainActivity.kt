package app.yuda.mygithubuser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.json.JSONObject
import java.io.IOException
import java.io.InputStream

class MainActivity : AppCompatActivity() {
//    private lateinit var jsonText : TextView
    private lateinit var rvUser: RecyclerView
    private val userList: ArrayList<User> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvUser= findViewById(R.id.rv_github_user)
        rvUser.setHasFixedSize(true)

//        jsonText= findViewById(R.id.json_text)
        read_json()
        showRecyclerList()
    }



    fun read_json() {
        var json : String? = null

        try {
            val inputStream: InputStream = assets.open("githubuser.json")
            json = inputStream.bufferedReader().use { it.readText() }
//            jsonText.text = json
            val jsnInput = JSONObject(json)
            val users = jsnInput.getJSONArray("users")
            for (i in 0 until users.length()) {
                val jsonObject = users.getJSONObject(i)
                val username = jsonObject.getString("username")
                val name = jsonObject.getString("name")
                val avatar = jsonObject.get("avatar")
                val company = jsonObject.getString("company")
                val location = jsonObject.getString("location")
                val repository = jsonObject.getInt("repository")
                val follower = jsonObject.getInt("follower")
                val following = jsonObject.getInt("following")
//                Log.i("JSON DATA", username)
                val user =
                    User(username, name,
                        avatar as String?, company, location, repository, follower, following)
                userList.add(user)
            }

        } catch (e: IOException) {

        }

    }
    private fun showRecyclerList() {
        rvUser.layoutManager = LinearLayoutManager(this)
        val listUserAdapter= ListUserAdapter(userList)
        rvUser.adapter=listUserAdapter
        listUserAdapter.setOnItemClickCallback(object :ListUserAdapter.OnItemClickCallback {
            override fun onItemClicked(data: User) {
                val moveIntentDetail = Intent(this@MainActivity, UserDetailActivity::class.java)
                moveIntentDetail.putExtra(UserDetailActivity.EXTRA_USER, data)
                Log.i("USERLIST",data.toString())
                startActivity(moveIntentDetail)
            }
        })
    }
}