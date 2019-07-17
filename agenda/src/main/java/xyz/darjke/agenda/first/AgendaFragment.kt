package xyz.darjke.agenda.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import moxy.MvpAppCompatFragment
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import xyz.darjke.agenda.R
import javax.inject.Inject

class AgendaFragment : MvpAppCompatFragment(), AgendaView {

    @Inject
    @InjectPresenter
    lateinit var presenter: AgendaPresenter

    @ProvidePresenter
    fun provide() = presenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return LayoutInflater.from(context).inflate(R.layout.agenda_main, container, false)
    }
}