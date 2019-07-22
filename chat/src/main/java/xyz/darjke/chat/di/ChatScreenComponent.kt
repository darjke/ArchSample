package xyz.darjke.chat.di

import dagger.Component
import dagger.Subcomponent
import xyz.darjke.chat.mvp.ChatPresenter
import xyz.darjke.common.di.scope.FeatureScope

@FeatureScope
@Subcomponent
interface ChatScreenComponent {
    fun presenter(): ChatPresenter
}