package vsl.bhavesh.recyclecardviewdemo.beans

import com.google.gson.annotations.SerializedName

data class MemberDetailPOJO(@SerializedName("iim_title")
                            val iimTitle: String = "",
                            @SerializedName("iim_home_name")
                            val iimHomeName: String = "",
                            @SerializedName("iim_short_code")
                            val iimShortCode: String = "",
                            @SerializedName("established_year")
                            val establishedYear: String = "",
                            @SerializedName("IIMPhotoURL")
                            val iIMPhotoURL: String = "",
                            @SerializedName("NoImageURL")
                            val nOImageURL: String = "",
                            @SerializedName("fpm_prog")
                            val fpmProg: String = "",
                            @SerializedName("logo_height")
                            val logoHeight: String = "",
                            @SerializedName("logo_width")
                            val logoWidth: String = "",
                            @SerializedName("librarian_name")
                            val librarianName: String = "",
                            @SerializedName("iiim_id")
                            val iiimId: String = "",
                            @SerializedName("librarian_designation")
                            val librarianDesignation: String = "",
                            @SerializedName("librarian_contact")
                            val librarianContact: String = "",
                            @SerializedName("iim_logo")
                            val iimLogo: String = "",
                            @SerializedName("iim_description")
                            val iimDescription: String = "",
                            @SerializedName("opac_code")
                            val opacCode: String = "",
                            @SerializedName("display_name")
                            val displayName: String = "",
                            @SerializedName("librarian_email")
                            val librarianEmail: String = "",
                            @SerializedName("library_ir_url")
                            val libraryIrUrl: String = "",
                            @SerializedName("iim_website_url")
                            val iimWebsiteUrl: String = "",
                            @SerializedName("library_website_url")
                            val libraryWebsiteUrl: String = "",
                            @SerializedName("estatus")
                            val estatus: String = "",
                            @SerializedName("iim_address")
                            val iimAddress: String = "",
                            @SerializedName("success")
                            val success: Int = 0,
                            @SerializedName("director_name")
                            val directorName: String = "",
                            @SerializedName("library_opac_url")
                            val libraryOpacUrl: String = "")