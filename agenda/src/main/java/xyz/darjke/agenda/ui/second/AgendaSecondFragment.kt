package xyz.darjke.agenda.ui.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.agenda_main.*
import moxy.MvpAppCompatFragment
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import xyz.darjke.agenda.R
import xyz.darjke.agenda.di.AgendaFeatureComponent

class AgendaSecondFragment : MvpAppCompatFragment(), AgendaView {

    @InjectPresenter
    lateinit var presenter: AgendaPresenter

    @ProvidePresenter
    fun provide() = AgendaFeatureComponent.get()
        .agendaScreenComponent()
        .providePresenter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return LayoutInflater.from(context).inflate(R.layout.agenda_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        pageNumber.text = "2 page"
    }
}