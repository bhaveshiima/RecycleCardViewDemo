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

        //now for Image
        var logo_url = ""
        if(iimmember.iimLogo == ""){
            var logo_url = main_iimmember_pojo.noImageURL
        }else{
            var logo_url = main_iimmember_pojo.iIMPhotoURL + iimmember.iimLogo
        }

        // Glide will load on Image View componenet
        Glide.with(mainActivity).load(logo_url).into(p0.iim_logo!!)

        // set Onclick Listner
        p0.cardMember!!.setOnClickListener {

            /*

               **********************
                val intent = Intent(this@MainActivity,SecondActivity::class.java);
                var userName = username.textø
                var password = password_field.text
                intent.putExtra("Username", userName)
                intent.putExtra("Password", password)
                startActivity(intent);
                *******************


                var i = Intent()
                i.action = Intent.ACTION_VIEW
                i.setData(Uri.parse("http://bhaveshpatel.in/testapi/memberinfo1/1.html"))
                mainActivity.startActivity(i)
            */

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