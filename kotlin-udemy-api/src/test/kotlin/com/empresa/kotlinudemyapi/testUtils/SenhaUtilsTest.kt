package com.empresa.kotlinudemyapi.testUtils

import org.junit.Test
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.junit.Assert
import com.empresa.kotlinudemyapi.utils.SenhaUtils


class SenhaUtilsTest {
	
	private val SENHA = "12345"
	private val bCryptEncoder = BCryptPasswordEncoder()
	
	@Test
	fun testGerarHashSenha(){
		val hash = SenhaUtils().gerarBcrypt(SENHA)
		Assert.assertTrue(bCryptEncoder.matches(SENHA, hash))
	}
}