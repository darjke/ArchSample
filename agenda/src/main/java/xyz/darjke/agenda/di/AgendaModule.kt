package xyz.darjke.agenda.di

import dagger.Binds
import dagger.Module
import xyz.darjke.agenda_api.AgendaLauncher
import xyz.darjke.agenda.launcher.AgendaLauncherImpl
import xyz.darjke.agenda.ui.first.AgendaPresenter
import xyz.darjke.common.di.scope.FeatureScope

@Module
abstract class AgendaModule {

    @Binds
    @FeatureScope
    abstract fun bindAgendaLauncher(impl: AgendaLauncherImpl): AgendaLauncher
}