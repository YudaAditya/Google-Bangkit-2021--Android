package app.yuda.mygithubuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class UserDetailActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_USER = "extra_user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_detail)

        val tvUsername:TextView = findViewById(R.id.tv_username)
        val tvName:TextView = findViewById(R.id.tv_name)
        val tvCompany:TextView = findViewById(R.id.tv_company)
        val tvLocation:TextView = findViewById(R.id.tv_location)
        val tvFollowing:TextView = findViewById(R.id.tv_following)
        val tvFollower:TextView = findViewById(R.id.tv_follower)
        val tvRepository:TextView = findViewById(R.id.tv_repository)
        val imgAvatar:ImageView = findViewById(R.id.img_photo)

        val user = intent.getParcelableExtra<User>(EXTRA_USER) as User

        tvUsername.text = user.username.toString()
        tvName.text = user.name.toString()
        tvCompany.text = user.company.toString()
        tvLocation.text = user.location.toString()
        tvFollowing.text = user.following.toString()
        tvFollower.text = user.follower.toString()
        tvRepository.text = user.repository.toString()
        Glide.with(this)
            .load(this.resources.getIdentifier(user.avatar,"drawable",this.packageName))
            .apply(RequestOptions().override(110, 110))
            .into(imgAvatar)

    }
}