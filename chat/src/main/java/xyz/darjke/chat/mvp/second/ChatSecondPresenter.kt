package xyz.darjke.chat.mvp.first

import moxy.InjectViewState
import moxy.MvpPresenter
import ru.terrakok.cicerone.Router
import xyz.darjke.source_api.DataSource
import javax.inject.Inject

@InjectViewState
class ChatSecondPresenter @Inject constructor(
    private val source: DataSource,
    private val router: Router
) : MvpPresenter<ChatSecondView>() {
    fun back() {
        router.exit()
    }

}