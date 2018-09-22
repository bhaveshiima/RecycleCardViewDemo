package vsl.bhavesh.recyclecardviewdemo

import retrofit2.Call
import retrofit2.http.GET
import vsl.bhavesh.recyclecardviewdemo.beans.MemberDetailPOJO


interface MemberDetailAPI {

    //Define sub URL Dynamically
    //@GET(value = MEMBERDETAIL_API)




    @GET(value = "testapi/memberinfo1/2.html")
    fun getMemberDetail():Call<MemberDetailPOJO>
}