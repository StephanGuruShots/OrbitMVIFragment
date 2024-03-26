object Plugins {

    val agp = Plugin("com.android.application","8.3.0")
    val googleService = Plugin("com.google.gms.google-services","4.4.1")
    val firebaseCrashlytics = Plugin("com.google.firebase.crashlytics","2.9.9")
    val firebasePerf = Plugin("com.google.firebase.firebase-perf","1.4.2")
    val hilt = Plugin("com.google.dagger.hilt.android","2.50")
    val navigationSafeargs = Plugin("androidx.navigation.safeargs","2.7.7")
    val setupAndroidSdk = Plugin("com.quittle.setup-android-sdk","3.1.0")
    val kotlin = Plugin("org.jetbrains.kotlin.android","1.9.22")
    val ksp = Plugin("com.google.devtools.ksp","1.9.22-1.0.17")
    val kapt = Plugin("kotlin-kapt", "")
    val parcelize = Plugin("kotlin-parcelize", "")
    val android = Plugin("kotlin-android","")
    val library = Plugin("com.android.library", "")
}

data class Plugin(
    val id: String,
    val version: String
)