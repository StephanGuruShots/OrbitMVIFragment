plugins {
    id(Plugins.agp.id)
    id(Plugins.android.id)
    id(Plugins.kapt.id)
    id(Plugins.parcelize.id)
    id(Plugins.hilt.id)
    id(Plugins.navigationSafeargs.id)
    id(Plugins.ksp.id)
}

android {
    namespace = "com.example.myapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myapplication"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kapt { generateStubs = true }

    kotlinOptions {
        freeCompilerArgs = listOf("-Xjvm-default=all") // required by Braze
        jvmTarget = "17"
    }
    buildFeatures {
        dataBinding = true
        viewBinding = true
        buildConfig = true
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.10"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation(Dependency.Android.appcompat)
    implementation(Dependency.Android.constraintlayout)
    implementation(Dependency.Android.preferencesKtx)
    implementation(Dependency.Android.fragmentKtx)
    implementation(Dependency.Android.legacySupport)
    implementation(Dependency.Android.material)
    implementation(Dependency.Android.recyclerView)
    implementation(Dependency.Android.vectorDrawable)
    implementation(Dependency.Android.vectorDrawableAnimated)
    implementation(Dependency.Android.cardView)
    implementation(Dependency.Android.coreKtx)
    implementation(Dependency.Android.navigationRuntimeKtx)
    implementation(Dependency.Android.fragmentKtx)
    implementation(Dependency.Android.paging)

    implementation(Dependency.Lifecycle.livedataKtx)
    implementation(Dependency.Lifecycle.viewModelKtx)
    implementation(Dependency.Lifecycle.commonJava)
    implementation(Dependency.Lifecycle.runtimeKtx)

    implementation(Dependency.Glide.core)
    annotationProcessor(Dependency.Glide.compiler)

    implementation(Dependency.Hilt.android)
    ksp(Dependency.Hilt.compiler)
    implementation(Dependency.Hilt.compose)

    implementation(Dependency.RxJava.rxandroid)
    implementation(Dependency.Compose.activity)
    implementation(Dependency.Compose.lifecycleViewModel)
    implementation(Dependency.Compose.preview)
    implementation(Dependency.Compose.material)
    implementation(Dependency.Compose.googleFonts)
    debugImplementation(Dependency.Compose.previewDebug)

    implementation(Dependency.OrbitMVI.viewModel)
    implementation(Dependency.OrbitMVI.compose)

    implementation(Dependency.RxJava.rxandroid)
}