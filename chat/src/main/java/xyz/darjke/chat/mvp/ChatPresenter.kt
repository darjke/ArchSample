package xyz.darjke.chat.mvp

import moxy.InjectViewState
import moxy.MvpPresenter
import xyz.darjke.source_api.DataSource
import javax.inject.Inject

@InjectViewState
class ChatPresenter @Inject constructor(
    private val source: DataSource
) : MvpPresenter<ChatView>() {

}