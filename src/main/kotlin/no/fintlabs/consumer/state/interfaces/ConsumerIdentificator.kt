package no.fintlabs.consumer.state.interfaces

interface ConsumerIdentificator {
    val domain: String
    val `package`: String
    val org: String
}