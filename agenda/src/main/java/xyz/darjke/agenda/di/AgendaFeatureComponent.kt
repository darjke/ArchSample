package xyz.darjke.agenda.di

import dagger.Component
import xyz.darjke.agenda_api.AgendaApi
import xyz.darjke.common.di.scope.FeatureScope
import xyz.darjke.source_api.SourceApi

@Component(
    modules = [AgendaModule::class],
    dependencies = [AgendaDependencies::class]
)
abstract class AgendaFeatureComponent : AgendaApi {

    companion object {
        @Volatile
        private var agendaComponent: AgendaFeatureComponent? = null

        fun initAndGet(dependencies: AgendaDependencies): AgendaFeatureComponent {
            if (agendaComponent == null) {
                synchronized(AgendaFeatureComponent::class) {
                    if (agendaComponent == null) {
                        agendaComponent = DaggerAgendaFeatureComponent.builder()
                            .agendaDependencies(dependencies)
                            .build()
                    }
                }
            }
            return agendaComponent!!
        }

        //todo check
        fun get() = agendaComponent


    }

    fun resetComponent() {
        agendaComponent = null
    }

    abstract fun agendaScreenComponent(): AgendaScreenComponent

    @Component(
        dependencies =
        [SourceApi::class]
    )
    @FeatureScope
    interface AgendaDependenciesComponent : AgendaDependencies
}