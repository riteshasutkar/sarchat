package com.sarchat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SarChatApplication

fun main(args: Array<String>) {
	runApplication<SarChatApplication>(*args)
}
