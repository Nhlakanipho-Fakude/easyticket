package com.sbuhost.easyticket;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class PaymentFragment extends Fragment {

    private Browser browser;
    public PaymentFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //WebView view = (WebView) findViewById(R.id.webView);
        //view.loadUrl("http://www.example.com");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_payment, container, false);
        WebView webView = (WebView) view.findViewById(R.id.webView);
        webView.setWebViewClient(new Browser());
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        //webView.loadUrl(Globals.BASE_URL);
        webView.loadUrl("file:///android_asset/index.html");
        return view;
    }
    class Browser extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return false;
        }
    }
    class WebInterface{

    }
}
