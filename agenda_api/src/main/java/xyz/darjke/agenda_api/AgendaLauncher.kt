package xyz.darjke.agenda_api

import ru.terrakok.cicerone.Router

interface AgendaLauncher {

    fun launch(router: Router)
}