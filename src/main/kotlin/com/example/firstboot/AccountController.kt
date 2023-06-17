package com.example.firstboot

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/accounts")
class AccountController(
    @Value("\${example.firstboot.buildNumber}") val buildNumber: String
) {

    @GetMapping("/")
    fun getAccount(): List<ViewAccount> = listOf(ViewAccount(id = 1, name = "name", buildNumber = buildNumber))

    @PostMapping("/")
    fun postAccount(@RequestBody request: SaveAccount): ViewAccount {
        return ViewAccount(id = 2, name = request.name, buildNumber = buildNumber)
    }
}


data class ViewAccount(
    val id: Int,
    val name: String,
    val buildNumber: String
)

data class SaveAccount(
    val name: String
)