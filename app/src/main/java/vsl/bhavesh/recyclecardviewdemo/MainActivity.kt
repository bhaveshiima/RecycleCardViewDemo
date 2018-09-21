package vsl.bhavesh.recyclecardviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import vsl.bhavesh.recyclecardviewdemo.beans.IIMMemberPOJO

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("IIM Libraries Consortium Members");

        // specify the data on vertical view
        var lManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)

        rview.layoutManager = lManager

        // Get Retrofit Object
        var r = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).
                baseUrl("http://bhaveshpatel.in/").build()

        // Implementation class for Interface
        var api = r.create(IIMMemberAPI::class.java)

        // call abstract function of the Interface
        var call = api.getIIMList()

        // Make a HTTTP request using enqueue
        call.enqueue(object : Callback<IIMMemberPOJO> {
            override fun onFailure(call: Call<IIMMemberPOJO>?, t: Throwable?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(call: Call<IIMMemberPOJO>?,
                                    response: Response<IIMMemberPOJO>?) {

                //store all json response data into main_iimmember_pojo variable
                var main_iimmember_pojo = response!!.body()

                //store members records into iimmember_list variable
                var iimmember_list = main_iimmember_pojo!!.members

                /*
                for checking the result of JSON
                for(item in iimmember_list!!){
                    Log.i("msg", "${item.iiimId} \n ${item.iimHomeName} \n ${item.directorName} \n *******************")
                }
                */

                // submit adapter
                rview.adapter = IIMMemberAdapter(this@MainActivity,main_iimmember_pojo)

                var totCount = main_iimmember_pojo.totRecords

                // set the Activity Title
                setTitle("IIM Consortium Members (" + totCount + ")");



            }
        })




    } // end of OnCreate
}
