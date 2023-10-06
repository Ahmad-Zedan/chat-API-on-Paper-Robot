package com.kabil.chatgpt;

import android.speech.tts.TextToSpeech;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyWebViewClient extends WebViewClient {
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);

        // Get the text that is currently displayed in the WebView
        String text = view.getTitle();

        // If there is text displayed, then speak it
        if (text != null) {
            TextToSpeech textToSpeech;
            textToSpeech = null;
            textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null, null);
        }}}
