package xyz.darjke.sample

import android.app.Application
import moxy.RegisterMoxyReflectorPackages
import xyz.darjke.sample.di.AppComponent
import xyz.darjke.sample.di.DaggerAppComponent

@RegisterMoxyReflectorPackages(
    "xyz.darjke.sample.agenda"
)
class App : Application() {

    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .application(this)
            .build()

    }
}