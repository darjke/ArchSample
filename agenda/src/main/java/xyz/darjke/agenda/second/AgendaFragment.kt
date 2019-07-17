package xyz.darjke.agenda.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import moxy.MvpAppCompatFragment
import xyz.darjke.agenda.R

class AgendaSecondFragment : MvpAppCompatFragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       return LayoutInflater.from(context).inflate(R.layout.agenda_second,container,false)
    }
}