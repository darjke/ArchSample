package xyz.darjke.chat.di

import dagger.Binds
import dagger.Module
import xyz.darjke.chat.ChatLauncherImpl
import xyz.darjke.chat_api.ChatLauncher
import xyz.darjke.common.di.scope.FeatureScope

@Module
abstract class ChatFeatureModule {

    @FeatureScope
    @Binds
    abstract fun provideChatLauncher(impl: ChatLauncherImpl): ChatLauncher
}