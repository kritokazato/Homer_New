package materialtest.com.example.sam.homer_new;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class WaterTax extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity5);
        WebView webView = (WebView)findViewById(R.id.webview4);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        WebViewClientImpl4 webViewClient = new WebViewClientImpl4(this);
        webView.setWebViewClient(webViewClient);

        webView.loadUrl("http://www.chennaimetrowater.tn.nic.in/NewMetroWater/MetroWater/PGBD/CMCEntry1.aspx");



    }


}

class WebViewClientImpl4 extends WebViewClient {

    private Activity activity = null;

    public WebViewClientImpl4(Activity activity) {
        this.activity = activity;
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String url) {
        if(url.indexOf("chennaimetrowater.tn.nic.in") > -1 ) return false;

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        activity.startActivity(intent);
        return true;
    }

}
