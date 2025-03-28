package com.example.sysfilaapk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    // Declaração da variável WebView para uso posterior
    private lateinit var webview: WebView

    // Método chamado quando a atividade é criada
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Define o layout da atividade

        // Inicializa a WebView buscando pelo ID definido no layout
        webview = findViewById(R.id.webview)
        // Define um WebViewClient para a WebView, que permite o carregamento de URLs dentro da WebView
        webview.webViewClient = WebViewClient()
        // Habilita o suporte a JavaScript na WebView
        webview.settings.javaScriptEnabled = true
        // Permite a reprodução de mídia sem interação do usuário (para áudio e vídeo)
        webview.settings.setMediaPlaybackRequiresUserGesture(false)
        // Permite acesso a arquivos locais e conteúdo
        webview.settings.setAllowFileAccess(true)
        webview.settings.setAllowContentAccess(true)

        // Verifica se há um estado salvo; se não houver, carrega a URL inicial
        if (savedInstanceState == null) {
            webview.loadUrl("https://eduardaramos.tech/")
        } else {
            // Se houver um estado salvo, restaura o estado da WebView
            webview.restoreState(savedInstanceState)
        }
    }

    // Método chamado para salvar o estado da atividade antes de ser destruída
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        // Salva o estado atual da WebView no Bundle passado
        webview.saveState(outState)
    }
}
