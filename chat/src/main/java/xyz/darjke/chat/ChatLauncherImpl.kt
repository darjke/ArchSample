package xyz.darjke.chat

import ru.terrakok.cicerone.Router
import xyz.darjke.chat.navigation.Screens
import xyz.darjke.chat_api.ChatLauncher
import javax.inject.Inject

class ChatLauncherImpl @Inject constructor() : ChatLauncher {
    override fun launch(router: Router) {
        router.navigateTo(Screens.ChatScreen)
    }

}