package xyz.darjke.sample.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.layout_container.*
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router
import ru.terrakok.cicerone.android.support.SupportAppNavigator
import xyz.darjke.agenda_api.AgendaApi
import xyz.darjke.common.App
import xyz.darjke.sample.R
import xyz.darjke.sample.di.FeatureProxyInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var navigatorHolder: NavigatorHolder

    @Inject
    lateinit var router: Router

    private val supportAppNavigator = SupportAppNavigator(this, R.id.container)

    override fun onCreate(savedInstanceState: Bundle?) {
        App.appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_container)

        navMenu.getMenu().add("Agenda")
        navMenu.getMenu().add("Chat")

        navMenu.setOnNavigationItemSelectedListener {
            val screen = when (it.title) {
                "Agenda" -> FeatureProxyInjector.getAgendaFeature().agendaLauncher().startScreen()
//                "Chat" -> FeatureProxyInjector.getChatFeature().chatLauncher().launch(router)
                else -> { null
                }
            }
            router.navigateTo(screen)
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