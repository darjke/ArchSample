package xyz.darjke.source.di

import dagger.Component
import xyz.darjke.source_api.SourceApi
import javax.inject.Singleton

@Singleton
@Component(modules = [SourceModule::class])
abstract class SourceComponent : SourceApi {

    companion object {
        private var sourceComponent: SourceComponent? = null

        fun getComponent(): SourceComponent {
            if (sourceComponent == null){
                sourceComponent = DaggerSourceComponent.builder().build()
            }
            return sourceComponent as SourceComponent
        }
    }
}