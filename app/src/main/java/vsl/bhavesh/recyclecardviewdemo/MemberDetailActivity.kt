package vsl.bhavesh.recyclecardviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MemberDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_member_detail)



        var iimID: String = intent.getStringExtra("iimID")
        var iimHomeName: String = intent.getStringExtra("iimHomeName")

        val text = iimHomeName + "("+ iimID +")"

        setTitle(text);

    }
}
