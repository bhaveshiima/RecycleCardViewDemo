package vsl.bhavesh.recyclecardviewdemo
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.memberlistview.view.*

// Creating clss of IIM Member Holder
class IIMMemberHolder(itemView: View) :
                    RecyclerView.ViewHolder(itemView)
{

    var iim_logo: ImageView? = null
    var iim_title: TextView? = null
    var director_name: TextView? = null
    var established_year: TextView? = null
    var cardMember: CardView? = null


    // all the component into init block [ START ]
    init {
        iim_logo = itemView.iim_logo
        iim_title = itemView.iim_title
        director_name = itemView.director_name
        established_year = itemView.established_year
        cardMember = itemView.cardMember
    }
    // all the component into init block [ END ]
}