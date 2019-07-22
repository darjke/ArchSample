package xyz.darjke.agenda.launcher

import ru.terrakok.cicerone.Router
import ru.terrakok.cicerone.Screen
import xyz.darjke.agenda_api.AgendaLauncher
import javax.inject.Inject

class AgendaLauncherImpl @Inject constructor() : AgendaLauncher {
    override fun startScreen(): Screen {
        return Screens.AgendaScreen
    }

}