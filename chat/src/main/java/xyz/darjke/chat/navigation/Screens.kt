package xyz.darjke.chat.navigation

import androidx.fragment.app.Fragment
import ru.terrakok.cicerone.android.support.SupportAppScreen
import xyz.darjke.chat.mvp.first.ChatFragment
import xyz.darjke.chat.mvp.first.ChatSecondFragment

object Screens {
    object ChatScreen : SupportAppScreen() {
        override fun getFragment(): Fragment {
            return ChatFragment()
        }
    }

    object ChatSecondScreen : SupportAppScreen() {
        override fun getFragment(): Fragment {
            return ChatSecondFragment()
        }
    }
}