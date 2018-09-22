package vsl.bhavesh.recyclecardviewdemo

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import retrofit2.http.Url
import vsl.bhavesh.recyclecardviewdemo.beans.IIMMemberPOJO

// Create a class of IIMMemberAdapter
class IIMMemberAdapter(var mainActivity: MainActivity,
                       var main_iimmember_pojo: IIMMemberPOJO) :RecyclerView.Adapter<IIMMemberHolder>()
{
    // ont time we will load the XML file
    override fun onCreateViewHolder(p0: ViewGroup, p1 : Int): IIMMemberHolder {
        var inflater = LayoutInflater.from(mainActivity)
        var v = inflater.inflate(R.layout.memberlistview,p0,false)
        return IIMMemberHolder(v)
    }

    override fun getItemCount(): Int {
        // return no of items based on the members array
        return main_iimmember_pojo.members!!.size
    }

    override fun onBindViewHolder(p0: IIMMemberHolder, p1: Int) {
        //specify the data
        var iimmember = main_iimmember_pojo.members!!.get(p1)


        p0.iim_title!!.text = iimmember.iimTitle
        p0.director_name!!.text = iimmember.directorName
        p0.established_year!!.text = iimmember.establishedYear

      

        // set IIM Logo Image [ START ]
        var logoURL = ""
        if(iimmember!!.iimLogo == ""){
            logoURL = main_iimmember_pojo!!.noImageURL
        }else{
            logoURL = main_iimmember_pojo!!.iIMPhotoURL+iimmember!!.iimLogo
        }
        Glide.with(mainActivity).load(logoURL).into(p0.iim_logo!!)
        // set IIM Logo Image [ END ]






        // set Onclick Listner
        p0.cardMember!!.setOnClickListener {

            // Display click IIM Name in Toast Message
            val iimHomeName = iimmember.iimHomeName
            val iimID = iimmember.iiimId
            val text = iimHomeName + "("+ iimID +")"
            val duration = Toast.LENGTH_SHORT
            // Display message based on the selection
            Toast.makeText(mainActivity,text,duration).show()

            // Pass to second activity
            val i = Intent(mainActivity, MemberDetailActivity::class.java)
            i.putExtra("iimID", iimID)
            i.putExtra("iimHomeName", iimHomeName)
            mainActivity.startActivity(i)


        }


    }


}