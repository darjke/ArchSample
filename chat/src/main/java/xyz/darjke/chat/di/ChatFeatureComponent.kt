package xyz.darjke.chat.di

import dagger.Component
import xyz.darjke.chat_api.ChatFeatureApi
import xyz.darjke.common.di.scope.FeatureScope
import xyz.darjke.source_api.SourceApi

@Component(
    modules = [ChatFeatureModule::class],
    dependencies = [ChatFeatureDependencies::class]
)
abstract class ChatFeatureComponent : ChatFeatureApi {
    companion object {
        private var component: ChatFeatureComponent? = null

        fun initAngGet(chatFeatureDependencies: ChatFeatureDependencies): ChatFeatureComponent {
            if (component == null) {
                component = DaggerChatFeatureComponent.builder()
                    .chatFeatureDependencies(chatFeatureDependencies)
                    .build()
            }
            return component!!
        }

        fun get() = component!!
    }

    fun reset() {
        component == null
    }

    abstract fun screenComponent(): ChatScreenComponent

    @Component(
        dependencies = [SourceApi::class]
    )
    @FeatureScope
    interface ChatDependenciesComponent : ChatFeatureDependencies
}