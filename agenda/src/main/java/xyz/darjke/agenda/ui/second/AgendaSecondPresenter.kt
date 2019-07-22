package xyz.darjke.agenda.ui.first

import moxy.InjectViewState
import moxy.MvpPresenter
import xyz.darjke.common.di.scope.FeatureScope
import xyz.darjke.source_api.DataSource
import javax.inject.Inject

@FeatureScope
@InjectViewState
class AgendaSecondPresenter @Inject constructor(
    private val source: DataSource
) : MvpPresenter<AgendaView>() {

}