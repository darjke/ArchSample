package xyz.darjke.agenda.di

import dagger.Subcomponent
import xyz.darjke.agenda.ui.first.AgendaPresenter
import xyz.darjke.common.di.scope.FeatureScope

@Subcomponent
@FeatureScope
interface AgendaScreenComponent {
//    fun providePresenter(): AgendaPresenter
}