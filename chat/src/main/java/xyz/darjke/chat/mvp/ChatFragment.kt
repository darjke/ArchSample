package xyz.darjke.chat.mvp

import moxy.MvpAppCompatFragment
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import xyz.darjke.chat.di.ChatFeatureComponent

class ChatFragment : MvpAppCompatFragment(), ChatView {

    @InjectPresenter
    lateinit var presenter: ChatPresenter

    @ProvidePresenter
    fun provide() = ChatFeatureComponent.get()
        .screenComponent()
        .presenter()
}