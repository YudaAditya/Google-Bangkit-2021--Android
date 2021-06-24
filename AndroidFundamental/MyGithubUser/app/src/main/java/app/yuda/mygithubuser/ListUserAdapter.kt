package app.yuda.mygithubuser

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.microdevrj.superellipse.custom_superellipse_views.SuperellipseImageView
import de.hdodenhof.circleimageview.CircleImageView

class ListUserAdapter(private val listUser:ArrayList<User>) : RecyclerView.Adapter<ListUserAdapter.ListViewHolder>() {
private lateinit var onItemClickCallback: OnItemClickCallback

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_user, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val user = listUser[position]

        Glide.with(holder.itemView.context)
//            .load(user.avatar)
            .load(holder.itemView.context.resources.getIdentifier(user.avatar,"drawable",holder.itemView.context.packageName))
            .apply(RequestOptions().override(110, 110))
            .into(holder.imgAvatar)


        holder.tvUsername.text=user.username
        holder.tvName.text=user.name
        holder.tvCompany.text=user.company
        holder.tvLocation.text=user.location
        holder.tvRepository.text= user.repository.toString()
        holder.tvFollower.text= user.follower.toString()
        holder.tvFollowing.text= user.following.toString()
//        holder.imgAvatar.setImageResource(user.avatar)
    }

    override fun getItemCount(): Int {
        return listUser.size
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback=onItemClickCallback
    }

    inner class ListViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvName: TextView = view.findViewById(R.id.tv_name)
        val tvUsername: TextView = view.findViewById(R.id.tv_username)
        val imgAvatar: ImageView = view.findViewById(R.id.img_photo)
        val tvCompany: TextView = view.findViewById(R.id.tv_company)
        val tvLocation: TextView = view.findViewById(R.id.tv_location)
        val tvRepository: TextView = view.findViewById(R.id.tv_repository)
        val tvFollower: TextView = view.findViewById(R.id.tv_follower)
        val tvFollowing: TextView = view.findViewById(R.id.tv_following)
    }

    interface OnItemClickCallback{
        fun onItemClicked(data: User)
    }

}