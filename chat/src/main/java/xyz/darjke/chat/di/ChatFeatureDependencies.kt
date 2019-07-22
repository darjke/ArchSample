package xyz.darjke.chat.di

import xyz.darjke.source_api.DataSource

interface ChatFeatureDependencies {
    fun source(): DataSource
}