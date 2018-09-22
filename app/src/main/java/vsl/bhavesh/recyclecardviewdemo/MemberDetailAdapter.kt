package vsl.bhavesh.recyclecardviewdemo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import vsl.bhavesh.recyclecardviewdemo.beans.MemberDetailPOJO

// Create a class of IIMMemberAdapter
class MemberDetailAdapter(var memberDetailActivity: MemberDetailActivity,
                          var memberdetail_pojo: MemberDetailPOJO?) : RecyclerView.Adapter<MemberDetailHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberDetailHolder {
        var inflater = LayoutInflater.from(memberDetailActivity)
        var v = inflater.inflate(R.layout.memberdetailview,parent,false)
        return MemberDetailHolder(v)
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: MemberDetailHolder, position: Int) {

        holder.iim_home_name!!.text = memberdetail_pojo!!.iimHomeName
        holder.iim_title!!.text = memberdetail_pojo!!.iimTitle

        holder.iim_home_name!!.text = memberdetail_pojo!!.iimAddress
        holder.iim_description!!.text = memberdetail_pojo!!.iimDescription

        holder.iim_short_code!!.text = memberdetail_pojo!!.iimShortCode
        holder.established_year!!.text = memberdetail_pojo!!.establishedYear
        holder.fpm_prog!!.text = memberdetail_pojo!!.fpmProg

        holder.director_name!!.text = memberdetail_pojo!!.directorName
        holder.librarian_contact!!.text = memberdetail_pojo!!.librarianContact
        holder.librarian_designation!!.text = memberdetail_pojo!!.librarianDesignation
        holder.librarian_name!!.text = memberdetail_pojo!!.librarianName

        holder.iim_website_url!!.text = memberdetail_pojo!!.iimWebsiteUrl
        holder.library_ir_url!!.text = memberdetail_pojo!!.libraryIrUrl
        holder.library_opac_url!!.text = memberdetail_pojo!!.libraryOpacUrl
        holder.library_website_url!!.text = memberdetail_pojo!!.libraryWebsiteUrl

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