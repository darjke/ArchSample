package xyz.darjke.chat_api

import ru.terrakok.cicerone.Router

interface ChatLauncher {
    fun launch(router: Router)
}