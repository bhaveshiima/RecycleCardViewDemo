package vsl.bhavesh.recyclecardviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_member_detail.*
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import vsl.bhavesh.recyclecardviewdemo.beans.MemberDetailPOJO

class MemberDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_member_detail)
        //setContentView(R.layout.memberdetailview)

        // Get paramenter from precious activity and set the title accodring [ START ]
        var iimID: String = intent.getStringExtra("iimID")
        var iimHomeName: String = intent.getStringExtra("iimHomeName")
        val text = iimHomeName + "("+ iimID +")"
        setTitle(text);
        // Get paramenter from precious activity and set the title accodring [ END ]


       // var MEMBERDETAIL_API = "testapi/memberinfo1/"+ iimID + ".html"

        /*
        // Set Layout Manager Object
        var MDlManager = LinearLayoutManager(this@MemberDetailActivity,LinearLayoutManager.VERTICAL,false)
        RV_MemberDetail.layoutManager = MDlManager

        // Get Retrofit Object
        var r = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).
                baseUrl("http://bhaveshpatel.in/").
                build()

        var api_memberdetail = r.create(MemberDetailAPI::class.java)
        var call_memberdetail = api_memberdetail.getMemberDetail()

        // Call the API
        call_memberdetail.enqueue(object : retrofit2.Callback<MemberDetailPOJO> {
            override fun onFailure(call: Call<MemberDetailPOJO>?, t: Throwable?) {

            }

            override fun onResponse(call: Call<MemberDetailPOJO>?,
                                    response: Response<MemberDetailPOJO>?) {
                var memberdetail_pojo = response!!.body()

                RV_MemberDetail.adapter = MemberDetailAdapter(this@MemberDetailActivity, memberdetail_pojo)

            }

        })


        */


    }
}
