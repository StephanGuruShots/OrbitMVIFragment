// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(Plugins.agp.id) version Plugins.agp.version apply false
    id(Plugins.hilt.id) version Plugins.hilt.version apply false
    id(Plugins.navigationSafeargs.id) version Plugins.navigationSafeargs.version apply false
    id(Plugins.setupAndroidSdk.id) version Plugins.setupAndroidSdk.version apply false
    id(Plugins.kotlin.id) version Plugins.kotlin.version apply false
    id(Plugins.ksp.id) version Plugins.ksp.version apply false
}