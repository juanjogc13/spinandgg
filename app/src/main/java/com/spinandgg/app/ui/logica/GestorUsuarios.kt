package com.spinandgg.app.ui.logica

import com.spinandgg.app.ui.modelos.Usuario

object GestorUsuarios {
    val usuariosRegistrados = mutableListOf<Usuario>()

    fun cargarUsuarios() {
        usuariosRegistrados.add(Usuario("juanjo123", "juanjo@email.com", "1234"))
        usuariosRegistrados.add(Usuario("alvaro666", "alvaro@email.com", "abcd"))
        usuariosRegistrados.add(Usuario("carlito07", "carlos@email.com", "pass"))
    }

    fun login(usernameOrEmail: String, password: String): Boolean {
        return usuariosRegistrados.any {
            (it.username == usernameOrEmail || it.email == usernameOrEmail)
                    && it.password == password
        }
    }
}