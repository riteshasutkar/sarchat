package com.ritesh.sarchat

import com.sarchat.SarChatApplication
import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<SarChatApplication>().with(TestcontainersConfiguration::class).run(*args)
}
