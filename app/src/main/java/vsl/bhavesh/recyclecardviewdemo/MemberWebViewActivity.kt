package vsl.bhavesh.recyclecardviewdemo

import android.app.ProgressDialog
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_member_web_view.*

class MemberWebViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_member_web_view)


        // Get paramenter from previous activity and set the title according [ START ]
        var load_url: String = intent.getStringExtra("load_url")
        var iim_home_name: String = intent.getStringExtra("iim_home_name")
        setTitle(iim_home_name); // set the title based on the selection of IIM


        var pDial = ProgressDialog(this)
        pDial.setMessage("Please wait...!")


        member_webview.loadUrl(load_url)

        member_webview.webViewClient  = object : WebViewClient(){

            // Before loading the page this method called
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
                pDial.show()
            }

            // After loading the page this method called
            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                pDial.dismiss()
            }


        }



    }
}
