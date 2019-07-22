package xyz.darjke.agenda.ui.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import xyz.darjke.agenda.R
import xyz.darjke.agenda.di.AgendaFeatureComponent
import xyz.darjke.common.BaseFragment

class AgendaFragment : BaseFragment(), AgendaView {

    @InjectPresenter
    lateinit var presenter: AgendaPresenter

//    @ProvidePresenter
//    fun provide() = AgendaPresenter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return LayoutInflater.from(context).inflate(R.layout.agenda_main, container, false)
    }
}