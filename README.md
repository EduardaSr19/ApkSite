# 🌐 Site para APK - WebView App

Este projeto converte um site em um aplicativo Android (APK) utilizando **WebView** no Android Studio. Como exemplo, utilizei meu site de portfólio para demonstrar o funcionamento.

## 📷 Captura de Tela

![Screenshot](https://github.com/EduardaSr19/ApkSite/blob/master/app/src/main/res/drawable/tela-portifolio.png)  

## 🚀 Funcionalidades
- Exibe qualquer site dentro do app
- Suporte a JavaScript e mídias interativas
- Ícone e nome personalizados
- Layout responsivo

## 📥 Como Usar
1. Clone este repositório:
   ```bash
   git clone https://github.com/EduardaSr19/ApkSite.git
   ```
2. Abra o projeto no **Android Studio**
3. Modifique a URL no arquivo `MainActivity.java`:
   ```java
   myWebView.loadUrl("https://seusite.com");
   ```
4. Construa o APK e instale no dispositivo

## 📌 Requisitos
- Android Studio instalado
- SDK do Android configurado

## 🛠 Tecnologias Utilizadas
- **Java/Kotlin** para o desenvolvimento Android
- **WebView** para exibição do site
- **Gradle** para build do projeto
