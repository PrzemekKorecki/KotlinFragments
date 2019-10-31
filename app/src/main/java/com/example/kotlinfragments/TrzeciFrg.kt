package com.example.kotlinfragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

/**
 * A simple [Fragment] subclass.
 */
class TrzeciFrg : Fragment() {


    companion object{
        fun newInstance():TrzeciFrg{
            return TrzeciFrg()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trzeci_frg, container, false)


        /*val  mWebView = view?.findViewById(R.id.webView1) as WebView
        mWebView.loadUrl("https://onlinepaisa555.blogspot.in/")

        val webSettings = mWebView.getSettings()
        webSettings.setJavaScriptEnabled(true)

// Force links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(WebViewClient())*/
    }


}
