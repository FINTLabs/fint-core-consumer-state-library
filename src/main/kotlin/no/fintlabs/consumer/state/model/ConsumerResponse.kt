package no.fintlabs.consumer.state.model

import no.fintlabs.consumer.state.interfaces.Consumer

data class ConsumerResponse(
    val consumer: Consumer,
    val operation: Operation
)
