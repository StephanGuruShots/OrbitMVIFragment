object Dependency {

    object Retrofit {
        private const val version = "2.9.0"

        const val core = "com.squareup.retrofit2:retrofit:$version"
        const val converterGson = "com.squareup.retrofit2:converter-gson:$version"
        const val adapterRxjava = "com.squareup.retrofit2:adapter-rxjava2:$version"
    }

    object Hilt {
        private const val version = "2.50"

        const val android = "com.google.dagger:hilt-android:$version"
        const val compiler = "com.google.dagger:hilt-android-compiler:$version"
        const val compose = "androidx.hilt:hilt-navigation-compose:1.2.0"

    }

    object Room {
        private const val version = "2.6.1"

        const val runtime = "androidx.room:room-runtime:$version"
        const val compiler = "androidx.room:room-compiler:$version"
        const val ktx = "androidx.room:room-ktx:$version"
    }

    object RxJava {
        const val core = "io.reactivex.rxjava2:rxjava:2.2.21"
        const val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.8.0"
        const val rxandroid = "io.reactivex.rxjava2:rxandroid:2.1.1"
    }

    object Android {
        const val coreKtx = "androidx.core:core-ktx:1.12.0"
        const val appcompat = "androidx.appcompat:appcompat:1.6.1"
        const val material = "com.google.android.material:material:1.11.0"
        const val fragmentKtx = "androidx.fragment:fragment-ktx:1.6.2"
        const val swipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0"
        const val window = "androidx.window:window:1.2.0"
        const val userMessagingPlatform = "com.google.android.ump:user-messaging-platform:2.2.0"
        const val constraintlayout = "androidx.constraintlayout:constraintlayout:2.1.4"
        const val preferencesKtx = "androidx.preference:preference-ktx:1.2.1"
        const val legacySupport = "androidx.legacy:legacy-support-v4:1.0.0"
        const val recyclerView = "androidx.recyclerview:recyclerview:1.3.2"
        const val vectorDrawable = "androidx.vectordrawable:vectordrawable:1.1.0"
        const val vectorDrawableAnimated = "androidx.vectordrawable:vectordrawable-animated:1.1.0"
        const val cardView = "androidx.cardview:cardview:1.0.0"
        const val navigationRuntimeKtx = "androidx.navigation:navigation-runtime-ktx:2.7.7"
        const val paging = "androidx.paging:paging-runtime-ktx:3.2.1"
    }

    object Lifecycle {
        private const val version = "2.7.0"

        const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
        const val runtimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:$version"
        const val livedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
        const val commonJava = "androidx.lifecycle:lifecycle-common-java8:$version"
    }

    object Glide {
        const val core = "com.github.bumptech.glide:glide:4.16.0"
        const val compiler = "com.github.bumptech.glide:compiler:4.14.0"
    }

    object Applovin {
        const val sdk = "com.applovin:applovin-sdk:12.2.0"
        const val googleAdapter = "com.applovin.mediation:google-adapter:22.6.0.0"
        const val facebookAdapter = "com.applovin.mediation:facebook-adapter:6.16.0.2"
    }

    object GooglePlay {
        const val core = "com.google.android.play:core:1.10.3"
        const val ads = "com.google.android.gms:play-services-ads:22.6.0"
        const val adsIdentifier = "com.google.android.gms:play-services-ads-identifier:18.0.1"
        const val location = "com.google.android.gms:play-services-location:21.1.0"
        const val base = "com.google.android.gms:play-services-base:18.3.0"
        const val analytics = "com.google.android.gms:play-services-analytics:18.0.4"
        const val tagmanager = "com.google.android.gms:play-services-tagmanager:18.0.4"
    }

    object Firebase {
        const val messaging = "com.google.firebase:firebase-messaging-ktx:23.4.1"
        const val crashlytics = "com.google.firebase:firebase-crashlytics-ktx:18.6.2"
        const val analytics = "com.google.firebase:firebase-analytics-ktx:21.5.1"
        const val installations = "com.google.firebase:firebase-installations-ktx:17.2.0"
        const val perf = "com.google.firebase:firebase-perf-ktx:20.5.2"
    }

    object Facebook {
        private const val version = "16.3.0"

        const val login = "com.facebook.android:facebook-login:$version"
        const val share = "com.facebook.android:facebook-share:$version"
        const val inferAnnotation = "com.facebook.infer.annotation:infer-annotation:0.18.0"
    }

    object Okhttp {
        private const val version = "4.12.0"

        const val core = "com.squareup.okhttp3:okhttp:$version"
        const val interceptor = "com.squareup.okhttp3:logging-interceptor:$version"
    }

    object ViewAnimation {
        private const val version = "2.4@aar"

        const val easing = "com.daimajia.easing:library:$version"
        const val androidnimations = "com.daimajia.androidanimations:library:$version"
    }

    object OrbitMVI {
        private const val version = "6.1.0"

        const val viewModel = "org.orbit-mvi:orbit-viewmodel:$version"
        const val compose = "org.orbit-mvi:orbit-compose:$version"
    }

    object Compose {
        private const val version = "1.6.3"

        const val material = "androidx.compose.material3:material3:1.2.1"
        const val preview = "androidx.compose.ui:ui-tooling-preview:$version"
        const val previewDebug = "androidx.compose.ui:ui-tooling:$version"
        const val activity = "androidx.activity:activity-compose:1.8.2"
        const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:2.7.0"
        const val googleFonts = "androidx.compose.ui:ui-text-google-fonts:$version"
    }


    const val mixpanel = "com.mixpanel.android:mixpanel-android:7.4.1"
    const val timber = "com.jakewharton.timber:timber:5.0.1"
    const val firebaseAnalytics = "com.google.firebase:firebase-analytics:21.5.1"
    const val appsflyer = "com.appsflyer:af-android-sdk:6.13.0"
    const val appboy = "com.appboy:android-sdk-ui:23.1.0"
    const val kotlinVisibility = "io.github.esentsov:kotlin-visibility:1.1.0"
    const val sectionedRecyclerView = "com.github.IntruderShanky:Sectioned-RecyclerView:2.1.1"
    const val gson = "com.google.code.gson:gson:2.10.1"
    const val dotsIndicatorWithoutViewpager = "com.github.mazenrashed:DotsIndicatorWithoutViewpager:1.0.0"
    const val blurView = "com.github.Dimezis:BlurView:version-2.0.2"
    const val circleImageView = "de.hdodenhof:circleimageview:3.1.0"
    const val lottie = "com.airbnb.android:lottie:6.3.0"
    const val shimmer = "com.facebook.shimmer:shimmer:0.5.0"
    const val eventbus = "org.greenrobot:eventbus:3.3.1"
    const val scrollingPagerIndicator = "ru.tinkoff.scrollingpagerindicator:scrollingpagerindicator:1.2.5"
    const val androidJob = "com.evernote:android-job:1.4.3"
    const val billingKtx = "com.android.billingclient:billing-ktx:6.1.0"
    const val flexBox = "com.google.android:flexbox:1.0.0"
    const val photoView = "com.github.chrisbanes:PhotoView:2.0.0"
    const val universalImageLoader = "com.nostra13.universalimageloader:universal-image-loader:1.9.5"
    const val expandableTextView = "com.ms-square:expandableTextView:0.1.4"
    const val showCaseView = "com.github.amlcurran.showcaseview:library:5.4.3"
    const val imagePicker = "com.github.nguyenhoanglam:ImagePicker:1.2.1"
    const val collapsingToolbar = "net.opacapp:multiline-collapsingtoolbar:27.1.1"
    const val cardSlider = "com.github.IslamKhSh:CardSlider:0.3"
    const val socketIo = "io.socket:socket.io-client:1.0.1"
    const val lifecycleExtensions = "android.arch.lifecycle:extensions:1.1.1"
    const val materialEditText = "com.rengwuxian.materialedittext:library:2.1.4"
    const val okhttpProfiler = "com.localebro:okhttpprofiler:1.0.8"
    const val dotsIndicator = "com.tbuonomo:dotsindicator:4.2" //todo up to 5.0
    const val reactivexRxjavaIo = "io.reactivex:rxjava:1.3.8"
}