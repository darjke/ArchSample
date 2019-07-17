package xyz.darjke.launcher

import ru.terrakok.cicerone.android.support.SupportAppScreen
import xyz.darjke.agenda.first.AgendaFragment

object Screens {
    object AgendaScreen : SupportAppScreen() {
        override fun getFragment(): androidx.fragment.app.Fragment {
            return AgendaFragment()
        }
    }
}