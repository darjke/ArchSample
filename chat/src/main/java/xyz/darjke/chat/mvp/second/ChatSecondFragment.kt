package xyz.darjke.chat.mvp.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.chat_fragment.*
import kotlinx.android.synthetic.main.chat_fragment.pageNumber
import kotlinx.android.synthetic.main.chat_second_fragment.*
import moxy.MvpAppCompatFragment
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import xyz.darjke.chat.R
import xyz.darjke.chat.di.ChatFeatureComponent

class ChatSecondFragment : MvpAppCompatFragment(), ChatSecondView {

    @InjectPresenter
    lateinit var presenter: ChatSecondPresenter

    @ProvidePresenter
    fun provide() = ChatFeatureComponent.get()
        .screenComponent()
        .presenter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return LayoutInflater.from(context).inflate(R.layout.chat_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        activity!!.title = "CHAT 1"
        btnBack.setOnClickListener { presenter.back() }
    }
}