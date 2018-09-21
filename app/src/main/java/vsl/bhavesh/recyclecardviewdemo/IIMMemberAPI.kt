package vsl.bhavesh.recyclecardviewdemo

import retrofit2.Call
import retrofit2.http.GET
import vsl.bhavesh.recyclecardviewdemo.beans.IIMMemberPOJO

interface IIMMemberAPI {
    //Define sub URL
    @GET(value = "testapi/member.html")
    //get IIM List in Interface
    fun getIIMList():Call<IIMMemberPOJO>
}