package com.example.depinjection.example2.presentation

import com.example.depinjection.example2.domain.ExampleUseCase

class ExampleViewModel(private val useCase: ExampleUseCase) {

    fun method() {
        useCase()
    }

}