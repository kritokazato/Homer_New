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


public class IncomeTax extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3);
        WebView webView = (WebView)findViewById(R.id.webview3);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        WebViewClientImpl2 webViewClient = new WebViewClientImpl2(this);
        webView.setWebViewClient(webViewClient);

        webView.loadUrl("https://incometaxindiaefiling.gov.in");



    }


}

class WebViewClientImpl2 extends WebViewClient {

    private Activity activity = null;

    public WebViewClientImpl2(Activity activity) {
        this.activity = activity;
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String url) {
        if(url.indexOf("incometaxindiafilling.gov.in") > -1 ) return false;

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        activity.startActivity(intent);
        return true;
    }

}
