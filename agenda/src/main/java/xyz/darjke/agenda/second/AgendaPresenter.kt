package xyz.darjke.agenda.first

import moxy.InjectViewState
import moxy.MvpPresenter
import xyz.darjke.source_api.DataSource
import javax.inject.Inject

@InjectViewState
class AgendaSecondPresenter @Inject constructor(
    private val source: DataSource
) : MvpPresenter<AgendaView>() {

}