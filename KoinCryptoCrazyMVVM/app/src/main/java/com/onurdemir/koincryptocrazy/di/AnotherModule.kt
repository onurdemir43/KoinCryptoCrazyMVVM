package com.onurdemir.koincryptocrazy.di

import com.onurdemir.koincryptocrazy.view.ListFragment
import org.koin.core.qualifier.named
import org.koin.dsl.module

val anotherModule = module {

    scope<ListFragment> {
        scoped(qualifier = named("hello")) {
            "Hello Kotlin"
        }

        scoped(qualifier = named("hi")) {
            "Hi Kotlin"
        }

    }

}