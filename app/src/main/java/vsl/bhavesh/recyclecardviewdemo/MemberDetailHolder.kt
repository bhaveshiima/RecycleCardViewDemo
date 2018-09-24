package vsl.bhavesh.recyclecardviewdemo
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.memberdetailview.view.*

// Creating clss of IIM Member Holder
class MemberDetailHolder(itemView: View) :
                    RecyclerView.ViewHolder(itemView)
{

    var iim_logo: ImageView? = null
    var iim_home_name: TextView? = null
    var iim_title: TextView? = null
    var director_name: TextView? = null
    var established_year: TextView? = null
    var iim_short_code: TextView? = null
    var iim_address: TextView? = null
    var iim_description: TextView? = null
    //var iim_website_url: TextView? = null

    var iim_website_url: ImageView? = null
    var library_website_url: ImageView? =null
    var library_opac_url: ImageView? = null
    var library_ir_url: ImageView? = null

    var librarian_name: TextView? = null
    var librarian_designation: TextView? = null
    var librarian_email: TextView? = null
    var librarian_contact: TextView? = null
    var fpm_prog: TextView? = null
    var IIMPhotoURL: TextView? = null
    var cardMember: CardView? = null




    // all the component into init block [ START ]
    init {
        iim_logo = itemView.iim_logo
        iim_home_name = itemView.iim_home_name
        iim_title = itemView.iim_title
        established_year = itemView.established_year
        iim_address = itemView.iim_address
        iim_description = itemView.iim_description

        iim_website_url = itemView.iim_website_url
        library_website_url = itemView.library_website_url
        library_ir_url = itemView.library_ir_url
        library_opac_url = itemView.library_opac_url

        director_name = itemView.director_name
        librarian_name = itemView.librarian_name
        librarian_designation = itemView.librarian_designation




        cardMember = itemView.cardMemberDetail
    }
    // all the component into init block [ END ]
}