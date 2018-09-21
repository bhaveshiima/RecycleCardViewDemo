package vsl.bhavesh.recyclecardviewdemo.beans

import com.google.gson.annotations.SerializedName

data class MembersItem(@SerializedName("iim_title")
                       val iimTitle: String = "",
                       @SerializedName("iiim_id")
                       val iiimId: String = "",
                       @SerializedName("iim_home_name")
                       val iimHomeName: String = "",
                       @SerializedName("established_year")
                       val establishedYear: String = "",
                       @SerializedName("director_name")
                       val directorName: String = "",
                       @SerializedName("iim_logo")
                       val iimLogo: String = "")