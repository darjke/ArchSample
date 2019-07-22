package xyz.darjke.agenda.launcher

import ru.terrakok.cicerone.Router
import xyz.darjke.agenda_api.AgendaLauncher
import javax.inject.Inject

class AgendaLauncherImpl @Inject constructor() : AgendaLauncher {

    override fun launch(router: Router) {
        router.navigateTo(Screens.AgendaScreen)
    }

}