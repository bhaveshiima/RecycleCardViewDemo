package vsl.bhavesh.recyclecardviewdemo

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import vsl.bhavesh.recyclecardviewdemo.beans.MemberDetailPOJO

//import android.webkit.WebView
//import android.webkit.WebViewClient

// Create a class of IIMMemberAdapter
class MemberDetailAdapter(var memberDetailActivity: MemberDetailActivity,
                          var memberdetail_pojo: MemberDetailPOJO?) : RecyclerView.Adapter<MemberDetailHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberDetailHolder {
        var inflater = LayoutInflater.from(memberDetailActivity)
        var v = inflater.inflate(R.layout.memberdetailview,parent,false)
        return MemberDetailHolder(v)
    }

    override fun getItemCount(): Int {
        return 1
    }

    override fun onBindViewHolder(holder: MemberDetailHolder, position: Int) {

        holder.iim_home_name!!.text = memberdetail_pojo!!.iimHomeName
        holder.iim_title!!.text = memberdetail_pojo!!.iimTitle
        holder.iim_home_name!!.text = memberdetail_pojo!!.iimHomeName
        holder.iim_description!!.text = memberdetail_pojo!!.iimDescription
        holder.iim_address!!.text = memberdetail_pojo!!.iimAddress
        holder.established_year!!.text = memberdetail_pojo!!.establishedYear

        holder.director_name!!.text = memberdetail_pojo!!.directorName
        holder.librarian_designation!!.text = memberdetail_pojo!!.librarianDesignation
        holder.librarian_name!!.text = memberdetail_pojo!!.librarianName


        // IIM Website [ START ]
       // var websiteURL = ""
        if(memberdetail_pojo!!.iimWebsiteUrl != ""){
            //Open URL into WebView
            holder.iim_website_url!!.setOnClickListener {
                /*  Open in Browser [ START ]
                var i = Intent()
                i.action = Intent.ACTION_VIEW
                i.setData(Uri.parse("${memberdetail_pojo!!.iimWebsiteUrl}"))
                memberDetailActivity.startActivity(i)
                    Open in Browser [ END ]
                */
                // Pass to second activity
                val i = Intent(memberDetailActivity, MemberWebViewActivity::class.java)
                i.putExtra("load_url", memberdetail_pojo!!.iimWebsiteUrl)
                i.putExtra("iim_home_name", memberdetail_pojo!!.iimHomeName)
                memberDetailActivity.startActivity(i)
            }
        }
        // IIM Website [ END ]


        // Library Website [ START ]
        if(memberdetail_pojo!!.libraryWebsiteUrl != ""){
            //Open URL into WebView
            holder.library_website_url!!.setOnClickListener {
                val i = Intent(memberDetailActivity, MemberWebViewActivity::class.java)
                i.putExtra("load_url", memberdetail_pojo!!.libraryWebsiteUrl)
                i.putExtra("iim_home_name", memberdetail_pojo!!.iimHomeName)
                memberDetailActivity.startActivity(i)
            }
        }
        // Library Website [ END ]

        // OPAC Website [ START ]
        if(memberdetail_pojo!!.libraryOpacUrl != ""){
            //Open URL into WebView
            holder.library_opac_url!!.setOnClickListener {
                val i = Intent(memberDetailActivity, MemberWebViewActivity::class.java)
                i.putExtra("load_url", memberdetail_pojo!!.libraryOpacUrl)
                i.putExtra("iim_home_name", memberdetail_pojo!!.iimHomeName )
                memberDetailActivity.startActivity(i)
            }
        }
        // Library Website [ END ]


        // IR Website [ START ]
        if(memberdetail_pojo!!.libraryIrUrl != ""){
            //Open URL into WebView
            holder.library_ir_url!!.setOnClickListener {
                val i = Intent(memberDetailActivity, MemberWebViewActivity::class.java)
                i.putExtra("load_url", memberdetail_pojo!!.libraryIrUrl)
                i.putExtra("iim_home_name", memberdetail_pojo!!.iimHomeName)
                memberDetailActivity.startActivity(i)
            }
        }
        // Library Website [ END ]


        // set IIM Logo Image [ START ]
        var logoURL = ""
        if(memberdetail_pojo!!.iimLogo == ""){
            logoURL = memberdetail_pojo!!.nOImageURL
        }else{
            logoURL = memberdetail_pojo!!.iIMPhotoURL+memberdetail_pojo!!.iimLogo
        }
        Glide.with(memberDetailActivity).load(logoURL).into(holder.iim_logo!!)
        // set IIM Logo Image [ END ]








    }

}