package xyz.darjke.sample.di

import xyz.darjke.agenda.di.AgendaFeatureComponent
import xyz.darjke.agenda.di.DaggerAgendaFeatureComponent_AgendaDependenciesComponent
import xyz.darjke.agenda_api.AgendaApi
import xyz.darjke.source.di.SourceComponent

object FeatureProxyInjector {

    fun getAgendaFeature(): AgendaApi {
        return AgendaFeatureComponent.initAndGet(
            DaggerAgendaFeatureComponent_AgendaDependenciesComponent.builder()
                .sourceApi(SourceComponent.getComponent())
                .build()
        )
    }
}