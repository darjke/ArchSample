package xyz.darjke.sample.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import xyz.darjke.di.AgendaModule
import xyz.darjke.sample.di.module.NavModule
import xyz.darjke.sample.main.MainActivity
import javax.inject.Singleton

@Singleton
@Component(
    modules = [NavModule::class,
        AgendaModule::class]
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