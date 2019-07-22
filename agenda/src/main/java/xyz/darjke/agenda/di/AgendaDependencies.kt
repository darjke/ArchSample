package xyz.darjke.agenda.di

import xyz.darjke.source_api.DataSource

interface AgendaDependencies {
    fun source(): DataSource
}