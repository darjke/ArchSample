package xyz.darjke.sample.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.layout_container.*
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router
import ru.terrakok.cicerone.android.support.SupportAppNavigator
import xyz.darjke.agenda_api.AgendaLauncher
import xyz.darjke.sample.App
import xyz.darjke.sample.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var navigatorHolder: NavigatorHolder

    @Inject
    lateinit var router: Router

    @Inject
    lateinit var agendaLauncher: AgendaLauncher

    private val supportAppNavigator = SupportAppNavigator(this, R.id.container)

    override fun onCreate(savedInstanceState: Bundle?) {
        App.appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_container)

//        agendaLauncher.launch(router)

        navMenu.getMenu().add("Agenda")
        navMenu.getMenu().add("Chat")

        navMenu.setOnNavigationItemSelectedListener {
            when (it.title) {
                "Agenda" -> agendaLauncher.launch(router)
                else -> {
                }
            }
            return@setOnNavigationItemSelectedListener true
        }

    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        navigatorHolder.setNavigator(supportAppNavigator)
    }

    override fun onPause() {
        super.onPause()
        navigatorHolder.removeNavigator()
    }
}