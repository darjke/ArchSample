package xyz.darjke.chat.di

import dagger.Module
import dagger.Provides
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router
import xyz.darjke.common.di.scope.FeatureScope

@Module
@FeatureScope
class ChatNavigationModule {

    private var cicerone: Cicerone<Router>

    init {
        cicerone = Cicerone.create()
    }

    @FeatureScope
    @Provides
    fun router() = cicerone.router

    @FeatureScope
    @Provides
    fun navHolder() = cicerone.navigatorHolder

}