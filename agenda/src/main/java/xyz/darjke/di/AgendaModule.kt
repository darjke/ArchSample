package xyz.darjke.di

import dagger.Binds
import dagger.Module
import xyz.darjke.agenda_api.AgendaLauncher
import xyz.darjke.launcher.AgendaLauncherImpl

@Module
interface AgendaModule {
    @Binds
    fun bindAgendaLauncher(impl: AgendaLauncherImpl): AgendaLauncher
}