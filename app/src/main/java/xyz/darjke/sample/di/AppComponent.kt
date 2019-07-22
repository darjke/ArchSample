package xyz.darjke.sample.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import xyz.darjke.common.di.module.NavModule
import xyz.darjke.sample.main.MainActivity
import javax.inject.Singleton

@Singleton
@Component(
    modules = [NavModule::class]
)
interface AppComponent {
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}