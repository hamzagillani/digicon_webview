package digiconvalley.project444;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web_View extends Fragment {

    WebView webView1 = null;
    private Activity activity = null;
    Context c;

    public Web_View() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.web_view, container, false);

        webView1 = (WebView) v.findViewById(R.id.webView);
        webView1.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView1.getSettings();
        webSettings.setJavaScriptEnabled(true);

        WebViewClientImpl webViewClient = new WebViewClientImpl(this.getActivity());

        webView1.loadUrl("http://www.azam-market.com");
        return v;
    }

    public class WebViewClientImpl extends WebViewClient  {

        private Activity activity = null;

        public WebViewClientImpl(Activity activity) {
            this.activity = activity;
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView webView, String url) {

            if (url.indexOf("http://www.azam-market.com") > -1) return false;

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            activity.startActivity(intent);

            return true;
        }
    }

        }



