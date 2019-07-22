package xyz.darjke.agenda.launcher

import androidx.fragment.app.Fragment
import ru.terrakok.cicerone.android.support.SupportAppScreen
import xyz.darjke.agenda.ui.first.AgendaFragment


object Screens {
    object AgendaScreen : SupportAppScreen() {
        override fun getFragment(): androidx.fragment.app.Fragment {
            return AgendaFragment()
        }
    }
}