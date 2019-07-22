package xyz.darjke.chat.di

import dagger.Subcomponent
import xyz.darjke.chat.mvp.first.ChatPresenter
import xyz.darjke.chat.mvp.first.ChatSecondPresenter
import xyz.darjke.common.di.scope.FeatureScope

@FeatureScope
@Subcomponent
interface ChatScreenComponent {
    fun presenter(): ChatPresenter
    fun presenterSecond(): ChatSecondPresenter
}